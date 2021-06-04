package com.example.examnet.api.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    Optional<Person> findByEmail(String email);

    @Query(value = "SELECT p FROM  Person p WHERE p.email = :email ")
    Person findEmail(@Param("email") String email);


    @Transactional
    @Modifying
    @Query("update Person p set p.score = p.score + :score where p.email = :email")
    int showAnswear(@Param("score") int score, @Param("email") String email);

    @Query("SELECT p.score FROM Person p where p.email= :email")
    int showScoreForUser(@Param("email") String email);
}
