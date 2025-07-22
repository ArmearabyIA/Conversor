package com.armearaby.conversor.machine;

import javax.swing.JOptionPane;

public class ConversorDivisa extends Operador {

    public void getData(){

        Object [] opcionesDivisa={"Dolar Estadounidense a Peso Mexicano", "Euro a Peso Mexicano", "Dolar Canadiense a Peso Mexicano", "Peso Mexicano a Dolar Estadounidense", "Peso Mexicano a Euros", "Peso Mexicano a Dolar Canadiense", "Peso Mexicano a Peso Colombiano"};
        Object opcionesEleccionDivisa = JOptionPane.showInputDialog(null,"Seleccione una opcion:","Inicio/menu",JOptionPane.QUESTION_MESSAGE,null,opcionesDivisa, opcionesDivisa[0]);
        //System.out.println(opcionesEleccionDivisa);
        String opcionDivisaElegida = (String)opcionesEleccionDivisa;

        if(opcionesEleccionDivisa == null){
            MensajeFin mensajeFin = new MensajeFin();
            mensajeFin.fin();
            System.exit(0);
            //este IF termina el proceso cuando el usuario no hace ningina seleccion de opcion
        }

        try {

            String opcionCantidad = JOptionPane.showInputDialog("Ingrese el valor que va a convertir \n Opcion que escogio: " + opcionDivisaElegida);
            ConversorDivisa convertir = new ConversorDivisa();
            convertir.resultado(opcionDivisaElegida, opcionCantidad);
            //este TRY hace una prueba sobre la opcion elegida y la opcion ingresada en el formulario java swing
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Valor invalido","Error",JOptionPane.ERROR_MESSAGE);
            motor reintentar = new motor();
            reintentar.inicio();
            //catch error de java total (java exception 'e')
            
        }
    }
}
