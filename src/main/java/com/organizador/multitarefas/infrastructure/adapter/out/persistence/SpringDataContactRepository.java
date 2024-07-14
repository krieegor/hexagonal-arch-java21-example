package com.organizador.multitarefas.infrastructure.adapter.out.persistence;

import com.organizador.multitarefas.domain.model.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataContactRepository extends JpaRepository<ContactEntity, Long> {
}