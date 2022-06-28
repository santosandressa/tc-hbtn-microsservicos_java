package example.jpah2demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;


@RestController
public class ClienteController {

    final Logger LOG = Logger.getLogger(ClienteController.class.getName());
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/addClient")
    public ResponseEntity<Cliente> addClient(@RequestBody Cliente cliente) {
        cliente = clienteRepository.save(cliente);

        LOG.info("POST - Cliente");
        return new ResponseEntity<>(cliente, HttpStatus.CREATED);
    }

    @GetMapping("/findAllClients")
    public ResponseEntity<List<Cliente>> findAllClients() {

        List<Cliente> clientes = clienteRepository.findAll();

        LOG.info("GET - Clientes");
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }

    @GetMapping("/findClientById/{id}")
    public ResponseEntity<Cliente> findClientById(@PathVariable("id") Long idClient) {
        LOG.info("GET - Clinte by ID");
        return clienteRepository.findById(idClient).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/removeClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerCliente(@PathVariable("id") Long idClient){
        LOG.info("DELETE - Cliente by ID");
        clienteRepository.deleteById(idClient);
    }

    @PutMapping("/updateClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente) {

        Optional<Cliente> clienteOptional = clienteRepository.findById(id);

        LOG.info("PUT - Cliente");

        if (clienteOptional.isPresent()){
            clienteRepository.save(cliente);
        }
    }
}
