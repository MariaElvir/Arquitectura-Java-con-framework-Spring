package com.certus.demo.servicios;

import com.certus.demo.modelo.entidades.Administrador;


public interface AdministradorService {
    public Administrador validar(String usuario,String password);
}
