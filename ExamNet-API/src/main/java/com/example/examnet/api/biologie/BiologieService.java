package com.example.examnet.api.biologie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BiologieService {
    private final BiologieRepository biologieRepository;

    @Autowired
    BiologieService(BiologieRepository newBiologieRepository){
        this.biologieRepository = newBiologieRepository;
    }

    public int insertProblem(Biologie biologie){
        biologieRepository.save(biologie);
        return 1;
    }
    public List<Biologie> showProblems(){
        return biologieRepository.findAll();
    }
    public int checkAnswear(ArrayList<String> stringList){
        int score = 0;
        ArrayList<String> test = biologieRepository.checkAnswear();
        for(int i = 0; i < test.size(); i++){
            if(stringList.get(i).equals(test.get(i))){
                score++;
            }
            else return i;
        }
        return score;
    }


}

