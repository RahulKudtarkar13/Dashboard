package pl.rengreen.taskmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotesController {
    

    @GetMapping("/Notes")
    public String viewNotes(){
        return "views/Notes";
    }
}