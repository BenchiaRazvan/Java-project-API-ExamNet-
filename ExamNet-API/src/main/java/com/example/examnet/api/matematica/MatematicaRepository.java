package com.example.examnet.api.matematica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MatematicaRepository extends JpaRepository<Matematica, Integer> {
    @Query("SELECT raspuns FROM Matematica")
    public ArrayList<String> checkAnswear();
}
