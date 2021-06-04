package com.example.examnet.api.matematica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(path = "matematica")
public class MatematicaController {

    private final MatematicaService matematicaService;

    @Autowired
    public MatematicaController(MatematicaService matematicaService){
        this.matematicaService = matematicaService;
    }
    @GetMapping
    public List<Matematica> showProblems(){
        return matematicaService.getProblems();
    }
    @PostMapping
    public void putProblems(@RequestBody Matematica matematica){
        matematicaService.insertProblem(matematica);
    }
    @PostMapping("query")
    public int showScore(@RequestBody ArrayList<String> integerArrayList){
        return matematicaService.checkAnswear(integerArrayList);
    }
}
