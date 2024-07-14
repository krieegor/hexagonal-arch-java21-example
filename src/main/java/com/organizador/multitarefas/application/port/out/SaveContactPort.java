package com.organizador.multitarefas.application.port.out;

import com.organizador.multitarefas.domain.model.ContactEntity;

public interface SaveContactPort {
    void saveContact(ContactEntity contactEntity);
}