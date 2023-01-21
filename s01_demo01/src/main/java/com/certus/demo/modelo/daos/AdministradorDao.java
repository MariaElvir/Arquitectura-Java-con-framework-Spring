package com.certus.demo.modelo.daos;

import com.certus.demo.modelo.entidades.Administrador;

public interface AdministradorDao {
    public Administrador login(String us, String ps);
}