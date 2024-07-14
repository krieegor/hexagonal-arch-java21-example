package com.organizador.multitarefas.application.service;

import com.organizador.multitarefas.application.dto.ContactDTO;
import com.organizador.multitarefas.application.port.in.RetrieveContactsUseCase;
import com.organizador.multitarefas.application.port.out.LoadContactsPort;
import com.organizador.multitarefas.domain.model.ContactEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RetrieveContactsService implements RetrieveContactsUseCase {

    private final LoadContactsPort loadContactsPort;

    public RetrieveContactsService(LoadContactsPort loadContactsPort) {
        this.loadContactsPort = loadContactsPort;
    }

    @Override
    public List<ContactDTO> retrieveContacts() {
        List<ContactEntity> contactEntities = loadContactsPort.loadContacts();
        return contactEntities.stream()
                .map(contact -> new ContactDTO(contact.getId(), contact.getName(), contact.getEmail(), contact.getPhoneNumber()))
                .collect(Collectors.toList());
    }
}