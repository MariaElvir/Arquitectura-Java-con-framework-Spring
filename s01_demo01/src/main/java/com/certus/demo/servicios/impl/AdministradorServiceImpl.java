package com.certus.demo.servicios.impl;

import com.certus.demo.modelo.daos.AdministradorDao;
import com.certus.demo.modelo.entidades.Administrador;
import com.certus.demo.servicios.AdministradorService;


public class AdministradorServiceImpl implements AdministradorService{

    private AdministradorDao dao;
    public AdministradorServiceImpl() {
        
    }
        public void setDao(AdministradorDao dao){
        this.dao = dao;
        }

    @Override
    public Administrador validar(String usuario, String password) {
        return dao.login(usuario, password);
    }
    
}
