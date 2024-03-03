package com.example.helloapp;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/v1/ciao")
public class HelloMichele {


        //METODO SENZA PARAMETRI
        @GetMapping("/ciaoMichele")
        public String saluta() {
            return "Ciao Michele!";
        }

        //METODO CON PASSAGGIO DI UN PARAMETRO
        @GetMapping("/ciaoTutor")
        public String saluta(@RequestParam String nome,@RequestParam String provincia) {
            return "Ciao , " + nome + " com'è il tempo in " + provincia + "?";
        }

        //METODO CON IL PASSAGGIO DI UN OGGETTO
        @GetMapping("/ciaoUser")
        public User saluta(@RequestBody User userCreato) {
            return userCreato;
        }
    }


