package com.organizador.multitarefas.infrastructure.adapter.in.controllers;

import com.organizador.multitarefas.application.dto.ContactDTO;
import com.organizador.multitarefas.application.dto.RegisterContactCommand;
import com.organizador.multitarefas.application.port.in.RegisterContactUseCase;
import com.organizador.multitarefas.application.port.in.RetrieveContactsUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    private final RegisterContactUseCase registerContactUseCase;
    private final RetrieveContactsUseCase retrieveContactsUseCase;

    public ContactController(RegisterContactUseCase registerContactUseCase, RetrieveContactsUseCase retrieveContactsUseCase) {
        this.registerContactUseCase = registerContactUseCase;
        this.retrieveContactsUseCase = retrieveContactsUseCase;
    }

    @PostMapping("/register")
    public void registerContact(@RequestBody RegisterContactRequest request) {
        RegisterContactCommand command = new RegisterContactCommand(request.name(), request.email(), request.phoneNumber());
        registerContactUseCase.registerContact(command);
    }

    @GetMapping
    public List<ContactDTO> getContacts() {
        return retrieveContactsUseCase.retrieveContacts();
    }
}

record RegisterContactRequest(String name, String email, String phoneNumber) {
}