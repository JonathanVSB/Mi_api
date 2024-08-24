/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mi_api.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jonad
 */

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    private Map<Integer, String> users = new HashMap<>();
    
    // GET: Obtener un usuario por su ID
    @GetMapping("/{id}")
    public String getUser(@PathVariable Integer id) {
        String response = "";
        
        if (id == 1) {
            response = "Tus muertos cagaos";
            return response;
        }
        
        return users.getOrDefault(id, "Usuario no encontrado");
    }
}
