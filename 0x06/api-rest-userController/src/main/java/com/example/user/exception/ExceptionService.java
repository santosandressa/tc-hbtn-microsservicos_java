package com.example.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionService {

    @ExceptionHandler
    ResponseEntity<CPFException> handleException(CPFException err){
        UserErrorResponse user =new UserErrorResponse();
        user.setStatus(HttpStatus.NOT_FOUND.value());
        user.setMessage("You have entered CPF invalid.");
        return new ResponseEntity(user,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    ResponseEntity<UserIdException> hadleUserIdException(UserIdException err){
        UserErrorResponse user = new UserErrorResponse();
        user.setStatus(HttpStatus.NOT_FOUND.value());
        user.setMessage("You have entered invalid ID");
        return new ResponseEntity(user, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    ResponseEntity<UserNameException> handleUsernameException(UserNameException err){
        UserErrorResponse user = new UserErrorResponse();
        user.setStatus(HttpStatus.NOT_FOUND.value());
        user.setMessage("You have entered invalid USERNAME");
        return new ResponseEntity(user, HttpStatus.NOT_FOUND);
    }
}
