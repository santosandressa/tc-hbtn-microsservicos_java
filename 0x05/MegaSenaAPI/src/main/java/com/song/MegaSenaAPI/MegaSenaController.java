package com.song.MegaSenaAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(value= "/megasena")
public class MegaSenaController {

    final Logger LOG = Logger.getLogger(MegaSenaController.class.getName());

    @GetMapping("/simpleMessageWelcome")
    public String mensagemBoasVindas() {
        LOG.info("GET - Boas Vindas");
        return "Bem vindo a API REST para geração de números para a loteria Mega Sena.";
    }


    @GetMapping("/getNumbers")
    public List<Integer> numerosMegaSena() {
        LOG.info("GET - Números");

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 61; i ++){
            numeros.add(i);
        }

        Collections.shuffle(numeros);

        List<Integer> novaLista = new ArrayList<>();
        for (int i = 0; i < 6; i++){

            novaLista.add(numeros.get(i));
        }

        Collections.sort(novaLista);

        return novaLista;
    }
}
