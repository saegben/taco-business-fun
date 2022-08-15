package bened.tacobusinessfun.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TicTacTaco {
    @GetMapping("/tictactaco")
    public String game() {
        return "game";
    }
}
