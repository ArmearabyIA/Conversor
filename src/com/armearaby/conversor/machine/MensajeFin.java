package com.armearaby.conversor.machine;

import javax.swing.*;

public class MensajeFin {

    public void fin(){
        System.out.println("Finalizar");
        Object mensajeOpcion = JOptionPane.showConfirmDialog(null, "Desea continuar?","Seleccione una opcion",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        int mensaje = (Integer) mensajeOpcion;

        if(mensaje == 0 ) {
            motor intentarDeNuevo = new motor();
            intentarDeNuevo.inicio();
        } else if (mensaje == 1) {
            JOptionPane.showMessageDialog(null, "Finalizo la ejecucion", "Gracias por usar mi conversor", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
