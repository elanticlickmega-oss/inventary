package com.kenny.inventary.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenny.inventary.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
}
