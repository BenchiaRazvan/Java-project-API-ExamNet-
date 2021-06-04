package com.example.examnet.api.person;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "user")
public class PersonController {

    private  PersonService personService;

    @Autowired
    public PersonController(PersonService newPersonService){

        this.personService = newPersonService;
    }
    @GetMapping
    public List<Person> getAllUsers(){
        return personService.showPersons();
    }
    @PostMapping("/register")
    public int registerUser(@RequestBody Person person) throws JSONException {
        return personService.register(person);
    }
    @PostMapping("/login")
    public Person loginUser(@RequestBody Person person) throws JSONException{
        return personService.login(person);
    }
    @PostMapping("/score")
    public int udateUserScore(@RequestBody Map<String, String> map) {
        return personService.updateScore(map.get("score"), map.get("email"));
    }
}
