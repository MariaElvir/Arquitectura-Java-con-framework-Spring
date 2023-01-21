

package pruebas;

import com.certus.demo.modelo.entidades.Administrador;
import com.certus.demo.servicios.AdministradorService;
import com.certus.demo.servicios.impl.AdministradorServiceImpl;

public class Prueba01 {
    public static void main(String[] args) {
        
        AdministradorService servicio = new AdministradorServiceImpl();
        Administrador adm = servicio.validar("admin", "admin");
        if(adm!=null){
            System.out.println("Bienvenido: "+adm.getNombre());
        }else {
            System.out.println("No ingreso");
        }

    }
}