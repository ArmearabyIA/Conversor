package com.armearaby.conversor.machine;


//importaciones java
import javax.swing.JOptionPane;


public class motor {

    public void inicio() {

        Object [] opciones ={"Convertir divisa", "Convertir Temperatura"};
        Object opcionEleccion = JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion de divisa:", "Menu Principal",JOptionPane.QUESTION_MESSAGE,null,opciones, opciones[0]);
        String opcionSeleccionada = (String)opcionEleccion;

        if(opcionSeleccionada!=null){

            switch (opcionSeleccionada){
                case "Convertir divisa" :

                    ConversorDivisa divisaConvertir = new ConversorDivisa();
                    divisaConvertir.getData();
                    break;

                /*case "Conversor de Temperatura":

                    ConversorTemperatura temperaturaConvertir = new ConversorTemperatura();
                    temperaturaConvertir.getData();
                    break;
*/
                default:
                    break;
            }
        }
    }

}
