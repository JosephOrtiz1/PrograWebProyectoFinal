/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba_Final.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Luis David
 */
@Controller
@RequestMapping("/sobreNosotros")
public class SobreNosotrosController {
   
    
    @GetMapping("/info")
    public String listado(Model model){
        return "/sobreNosotros/info";
    }
}
