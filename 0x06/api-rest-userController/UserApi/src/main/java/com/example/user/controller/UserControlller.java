package com.example.user.controller;

import br.com.caelum.stella.validation.CPFValidator;
import com.example.user.exception.CPFException;
import com.example.user.exception.UserIdException;
import com.example.user.exception.UserNameException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserControlller {

    @GetMapping("/user-id/{id}")
    public String findUserById(@PathVariable int id) {
        String msg = "You have entered valid ID";

        if (id < 1 || id > 100) {
            throw new UserIdException();
        }

        return msg;
    }

    @GetMapping("/user-name/{userName}")
    public String findUserByName(@PathVariable String userName) {

        String msg = "You have entered valid USERNAME";

        if (userName.length() < 3 || userName.length() > 15) {
            throw new UserNameException();
        }

        return msg;
    }

    @GetMapping("/user-cpf/{cpf}")
    public String findUserByCPF(@PathVariable String cpf) {

        String msg = "You have entered valid CPF";
        boolean isCPFValid = isCPF(cpf);

        if (!isCPFValid) {
            throw new CPFException();
        }

        return msg;
    }

    public boolean isCPF(String CPF) {
        CPFValidator cpfValidator = new CPFValidator();

        try {
            cpfValidator.assertValid(CPF);
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}
