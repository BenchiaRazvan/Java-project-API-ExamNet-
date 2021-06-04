package com.example.examnet.api.biologie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface BiologieRepository extends JpaRepository<Biologie, Integer> {
    @Query("SELECT raspuns FROM Biologie")
    public ArrayList<String> checkAnswear();

}
