package com.organizador.multitarefas.application.port.in;

import com.organizador.multitarefas.application.dto.ContactDTO;

import java.util.List;

public interface RetrieveContactsUseCase {
    List<ContactDTO> retrieveContacts();
}