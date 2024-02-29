package com.example.helloapp;

<<<<<<< HEAD
public class HelloMichele {
=======
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class HelloMichele {

    //METODO SENZA PARAMETRI
    @GetMapping("/ciaoMichele")
    public String saluta(){
        return "Ciao Michele!";
    }
    //METODO CON PASSAGGIO DI UN PARAMETRO
    @GetMapping("/ciaoTutor")
    public String saluta(@RequestParam String nome){
        return  "<h1>Ciao , " + nome + " !</h1>";
    }
    //METODO CON IL PASSAGGIO DI UN OGGETTO
    @GetMapping("/ciaoUser")
    public User saluta(@RequestBody User userCreato){
        return userCreato;
    }
>>>>>>> b021c9f (Ciao-MICHELE)
}
