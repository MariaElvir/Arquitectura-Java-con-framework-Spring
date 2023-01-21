
package com.certus.demo.modelo.daos.impl;

import com.certus.demo.modelo.daos.AdministradorDao;
import com.certus.demo.modelo.entidades.Administrador;

public class AdministradorDaoMemory implements AdministradorDao{

    @Override
    public Administrador login(String us, String ps) {
        if(us.equalsIgnoreCase("admin") && ps.equalsIgnoreCase("admin"))
            return new Administrador("100", "admin", "admin", "juan", "perez");
        return null;
    }
    
}
