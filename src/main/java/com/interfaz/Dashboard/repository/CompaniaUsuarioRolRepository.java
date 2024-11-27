package com.interfaz.Dashboard.repository;

import com.interfaz.Dashboard.model.CompaniaUsuarioRol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompaniaUsuarioRolRepository extends JpaRepository<CompaniaUsuarioRol, String> {
    // Si necesitas realizar una búsqueda específica por CUSUARIO, puedes agregar un método aquí
    // Ejemplo:
    // List<CompaniaUsuarioRol> findByCUsuario(String cUsuario);
}
