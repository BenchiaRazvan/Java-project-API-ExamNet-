package com.example.examnet.api.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contact")
public class ContactController {
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService newContactService){
        this.contactService = newContactService;
    }
    @PostMapping("/insert")
    public int contact(@RequestBody Contact contact){
        return contactService.insertContact(contact);
    }
    @GetMapping()
    public List<Contact> getContact(){
        return contactService.getContact();
    }
}
