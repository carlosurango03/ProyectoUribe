package com.example.Store.repositorio;

import com.example.Store.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositirio extends JpaRepository<Usuario,Integer> {
}
