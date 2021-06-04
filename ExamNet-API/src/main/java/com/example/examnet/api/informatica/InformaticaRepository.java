package com.example.examnet.api.informatica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface InformaticaRepository extends JpaRepository<Informatica, Integer> {
    @Query("SELECT raspuns FROM Informatica")
    ArrayList<String> checkAnswearInf();

}
