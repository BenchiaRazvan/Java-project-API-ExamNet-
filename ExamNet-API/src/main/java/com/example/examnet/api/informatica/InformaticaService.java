package com.example.examnet.api.informatica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InformaticaService {

    private final InformaticaRepository informaticaRepository;
    @Autowired
    InformaticaService(InformaticaRepository newInformaticaRepository){
        this.informaticaRepository = newInformaticaRepository;
    }
    public void insertProblem(Informatica informatica){
        informaticaRepository.save(informatica);
    }
    public List<Informatica> showProblems(){
        return informaticaRepository.findAll();
    }

    public int checkAnswearInf(ArrayList<String> integerList){
        int score = 0;
        ArrayList<String> test = informaticaRepository.checkAnswearInf();
        for(int i = 0; i < test.size(); i++){
            if(test.get(i).equals(integerList.get(i))){
                score++;
            }
        }
        return score;
    }
}
