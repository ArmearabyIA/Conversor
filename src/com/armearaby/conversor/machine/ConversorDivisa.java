package com.armearaby.conversor.machine;

import javax.swing.JOptionPane;

public class ConversorDivisa extends Operador {

    public void getData(){

        Object [] opcionesDivisa={"MXN a USD", "MXN a EUR", "MXN a Yen Japones", "MXN a Won SurCoreano", "MXN a peso Colombiano", "USD a MXN", "EUR a MXN"};
        Object opcionesEleccionDivisa = JOptionPane.showInputDialog(null,"Seleccione una opcion:","Inicio/menu",JOptionPane.QUESTION_MESSAGE,null,opcionesDivisa, opcionesDivisa[0]);
        System.out.println(opcionesEleccionDivisa);
        String opcionDivisaElegida = (String)opcionesEleccionDivisa;

        if(opcionesEleccionDivisa == null){
            MensajeFin mensajeFin = new MensajeFin();
            mensajeFin.fin();
            System.exit(0);
        }

        try {

            String opcionCantidad = JOptionPane.showInputDialog("Ingrese el valor que va a convertir \n Opcion que escogio: " + opcionDivisaElegida);
            ConversorDivisa convertir = new ConversorDivisa();
            convertir.resultado(opcionDivisaElegida, opcionCantidad);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Valor invalido","Error",JOptionPane.ERROR_MESSAGE);
            motor reintentar = new motor();
            reintentar.inicio();
        }
    }
}
