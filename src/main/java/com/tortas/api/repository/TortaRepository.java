package com.tortas.api.repository;

import com.tortas.api.model.Torta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TortaRepository extends JpaRepository<Torta, Long> {
}