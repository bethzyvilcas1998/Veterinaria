/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import dao.MascotaDao;
import entidades.Mascota;
import org.omg.CORBA.MARSHAL;

/**
 *
 * @author USUARIO
 */
public class Ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        MascotaDao mascotadao = new MascotaDao();
        Mascota mascota = new Mascota();
        
        
        
         mascota.getNombreMascota();
    }
    
}
