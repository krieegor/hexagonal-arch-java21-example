package com.organizador.multitarefas.application.service;

import com.organizador.multitarefas.application.dto.RegisterContactCommand;
import com.organizador.multitarefas.application.port.in.RegisterContactUseCase;
import com.organizador.multitarefas.application.port.out.SaveContactPort;
import com.organizador.multitarefas.domain.model.ContactEntity;
import org.springframework.stereotype.Service;

@Service
public class RegisterContactService implements RegisterContactUseCase {

    private final SaveContactPort saveContactPort;

    public RegisterContactService(SaveContactPort saveContactPort) {
        this.saveContactPort = saveContactPort;
    }

    @Override
    public void registerContact(RegisterContactCommand command) {
        ContactEntity contactEntity = new ContactEntity(null, command.name(), command.email(), command.phoneNumber());
        saveContactPort.saveContact(contactEntity);
    }
}