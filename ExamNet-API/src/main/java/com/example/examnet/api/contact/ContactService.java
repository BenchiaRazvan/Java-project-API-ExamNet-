package com.example.examnet.api.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService{

    private final ContactRepository contactRepository;

    @Autowired
    ContactService(ContactRepository newContactRepository){
        this.contactRepository = newContactRepository;
    }

    public int insertContact(Contact contact){
        contactRepository.save(contact);
        return 1;
    }
    public List<Contact> getContact(){
        return contactRepository.findAll();
    }
}
