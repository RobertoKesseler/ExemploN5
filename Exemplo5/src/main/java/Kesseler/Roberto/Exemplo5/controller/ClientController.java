package Kesseler.Roberto.Exemplo5.controller;

import Kesseler.Roberto.Exemplo5.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/clientes")
    public String getClient() {

        Client client = new Client();
        client.setName("Roberto");
        client.setLastName("Kesseler");
        client.setEmail("r.kesselerkesseler@gmail.com");

        return "Lança a Braba com Lombok";


    }
}
