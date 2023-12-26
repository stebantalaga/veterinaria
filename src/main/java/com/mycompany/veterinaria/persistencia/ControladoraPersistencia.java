package com.mycompany.veterinaria.persistencia;

import com.mycompany.veterinaria.logica.Duenio;
import com.mycompany.veterinaria.logica.Mascota;
import com.mycompany.veterinaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        //crear en la base de datos al duenio
        duenioJpa.create(duenio);
        //crear en la bbase de datos a la mascota 
        mascoJpa.create(masco);
    }

    public List<Mascota> traerMascotas() {
        //busca todos los registro de la tabla mascota
        return mascoJpa.findMascotaEntities();

    }

    public void borrarmascotas(int num_cliente) {
        //llamamos la instacia creamos el metodo destroy con su atributo
        try {
            mascoJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traermeMascota(int num_cliente) {
       return mascoJpa.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco) {
        try {
            mascoJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id_duenio) {
        return duenioJpa.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio dueno) {
        try {
            duenioJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


   
}
