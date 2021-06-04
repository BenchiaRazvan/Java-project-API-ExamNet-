package com.example.examnet.api.matematica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatematicaService {

    private final MatematicaRepository matematicaRepository;

    @Autowired
    public MatematicaService(MatematicaRepository newMatematicaRepository){
        this.matematicaRepository = newMatematicaRepository;
    }

    public void insertProblem(Matematica matematica){
        matematicaRepository.save(matematica);
    }
    public List<Matematica> getProblems(){
        return matematicaRepository.findAll();
    }

    public int checkAnswear(ArrayList<String> integerList){
        int score = 0;
        ArrayList<String> test = matematicaRepository.checkAnswear();
        for(int i = 0; i < test.size(); i++){
            if(test.get(i).equals(integerList.get(i))){
                score++;
            }
        }
        return score;
    }


}
