package com.organizador.multitarefas.infrastructure.adapter.out.persistence;

import com.organizador.multitarefas.application.port.out.LoadContactsPort;
import com.organizador.multitarefas.application.port.out.SaveContactPort;
import com.organizador.multitarefas.domain.model.ContactEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaContactRepository implements SaveContactPort, LoadContactsPort {

    private final SpringDataContactRepository repository;

    public JpaContactRepository(SpringDataContactRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveContact(ContactEntity contactEntity) {
        repository.save(contactEntity);
    }

    @Override
    public List<ContactEntity> loadContacts() {
        return repository.findAll();
    }
}