package com.mycompany.veterinaria;

import com.mycompany.veterinaria.igu.Principal;

// Clase principal que representa la aplicación Veterinaria
public class Veterinaria {
    // Método principal que inicia la aplicación
    public static void main(String[] args) {
        // Hacer visible la ventana Principal
        Principal princi = new Principal();
        princi.setVisible(true);
        // Establecer la ubicación de la ventana en el centro de la pantalla
        princi.setLocationRelativeTo(null);

    }
}
