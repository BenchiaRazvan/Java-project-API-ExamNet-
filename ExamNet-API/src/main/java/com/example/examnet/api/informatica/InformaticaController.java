package com.example.examnet.api.informatica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "informatica")
public class InformaticaController {

    private final InformaticaService informaticaService;

    @Autowired
    InformaticaController(InformaticaService newInformaticaService){
        this.informaticaService = newInformaticaService;
    }
    @GetMapping
    public List<Informatica> showProblems(){
        return informaticaService.showProblems();
    }
    @PostMapping("post")
    public void postProblems(@RequestBody Informatica informatica){
        informaticaService.insertProblem(informatica);
    }
    @PostMapping("query")
    public int showScore(@RequestBody ArrayList<String> integerArrayList){
        return informaticaService.checkAnswearInf(integerArrayList);
    }
}
