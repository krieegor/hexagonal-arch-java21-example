package com.organizador.multitarefas.application.port.in;

import com.organizador.multitarefas.application.dto.RegisterContactCommand;

public interface RegisterContactUseCase {
    void registerContact(RegisterContactCommand command);
}