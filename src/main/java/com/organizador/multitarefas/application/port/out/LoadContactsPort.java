package com.organizador.multitarefas.application.port.out;

import com.organizador.multitarefas.domain.model.ContactEntity;

import java.util.List;

public interface LoadContactsPort {
    List<ContactEntity> loadContacts();
}