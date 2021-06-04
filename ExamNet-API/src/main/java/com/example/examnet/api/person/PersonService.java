package com.example.examnet.api.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService{

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public List<Person> showPersons(){
        return personRepository.findAll();
    }

    public int register(Person person){
        boolean alreadyExists = personRepository.findByEmail(person.getEmail()).isPresent();
        if(alreadyExists){
            return 0;
        }
        personRepository.save(person);
         return 1;
    }
    public Person login(Person person){

        List<Person> personList = personRepository.findAll();
        for(Person otherPerson : personList) {
            if (otherPerson.equals(person)) {
                return personRepository.findEmail(person.getEmail());
            }
        }
        return person;
    }
    public int updateScore(String score, String email){
        int i = Integer.parseInt(score);
        int response = personRepository.showAnswear(i, email);
        if(response != 0){
            return personRepository.showScoreForUser(email);
        }
        return 0;
    }
}
