package bluevelt.com.br.music_store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "home"; // Isso diz para o Spring procurar um arquivo chamado "home.html"
    }
}