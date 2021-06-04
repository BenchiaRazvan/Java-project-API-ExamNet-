package com.example.examnet.api.biologie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "biologie")
public class BiologieController {

    private final BiologieService biologieService;

    @Autowired
    public BiologieController(BiologieService biologieService){
        this.biologieService =biologieService;
    }
    @GetMapping
    public List<Biologie> showProblems(){
        return biologieService.showProblems();
    }
    @PostMapping("post")
    public void putProblems(@RequestBody Biologie biologie){
        biologieService.insertProblem(biologie);
    }

    @PostMapping("query")
    public int showScore(@RequestBody ArrayList<String> stringList){
        return biologieService.checkAnswear(stringList);
    }

}
