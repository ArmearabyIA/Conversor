package com.armearaby.conversor.machine;

import javax.swing.*;

public class MensajeFin {

    public void fin(){
        System.out.println("Se ha lanzado la opcion de mensaje final al usuario."); //opcion solo visible en consola jdk
        Object mensajeFinalOpcion = JOptionPane.showConfirmDialog(null, "Desea continuar?","Seleccione una opcion",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        int opcionFinal = (Integer) mensajeFinalOpcion;

        if(opcionFinal == 0 ) {
            motor intentarDeNuevo = new motor();
            intentarDeNuevo.inicio();
        } else if (opcionFinal == 1) {
            JOptionPane.showMessageDialog(null, "Fin de la ejecucion", "Gracias por usar conversor de divisas", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
