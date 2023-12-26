package com.mycompany.veterinaria.logica;

import com.mycompany.veterinaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observa,
            String alergico, String atenEspe, String nombreDuenio, String celDuenio) {

        //creamos al dueño y le asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCel_duenio(celDuenio);

        //creamos la mascota y le asignamos los valores correspondientes al constructor
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencio_especial(atenEspe);
        masco.setObservaciones(observa);
        masco.setUnDuenio(duenio);
        //ahora los creamos y asosiamos a la base de datos 
        controlPersis.guardar(duenio, masco);
    }

    public List<Mascota> traermascotas() {
        //intermediario para traer una lista de mascota
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarmascotas(num_cliente);
    }

    public Mascota traermeMascota(int num_cliente) {
        return controlPersis.traermeMascota (num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color,
            String observa, String alergico, String atenEspe, String nombreDuenio, String celDuenio) {
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observa);
        masco.setAlergico(alergico);
        masco.setAtencio_especial(atenEspe);
        //modifico la mascota
        
        controlPersis.modificarMascota(masco);
        Duenio dueno = this.buscarDeunio(masco.getUnDuenio().getId_duenio());
        dueno.setNombre(nombreDuenio);
        dueno.setCel_duenio(celDuenio);
        //llamar al modificar dueño
        this.moficarDuenio(dueno);
    }

    private Duenio buscarDeunio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }

    private void moficarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }

    

  

}
