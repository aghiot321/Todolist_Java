package com.aghiot.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificadores
 * Public 
 * Private 
 * Protected 
 */

@RestController
@RequestMapping("/users")
public class UserController {
    
    /**
     * String (texto)
     * int (numero inteiro)
     * boolean (true ou false)
     * double (duplo)
     * float (real)
     * char (caracter)
     * Date (data)
     * void (sem retorno)
     */

    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.getUsername());


    }


}
