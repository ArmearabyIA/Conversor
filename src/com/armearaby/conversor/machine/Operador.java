package com.armearaby.conversor.machine;


import java.text.DecimalFormat;

import javax.swing.*;

public class Operador implements LogicaAPI{

        public void resultado(String tipoDivisa, String montoDivisa) {
                String datosAPI[];
                datosAPI = new String[5];
                String cambiarDe = "", pasarA = ""; //cambiarDe y pasarA usan el formato que el API entiende para recibir respuesta del servidor

                switch (tipoDivisa) { //este switch obtiene la opcion seleccionada en conversorDivisa.getData por lo que tienen que ser iguales
                        case "Dolar Estadounidense a Peso Mexicano":

                                cambiarDe = "USD";
                                pasarA = "MXN";
                                break;

                        case "Euro a Peso Mexicano":

                                cambiarDe = "EUR";
                                pasarA = "MXN";
                                break;
                        case "Dolar Canadiense a Peso Mexicano":

                                cambiarDe = "CAD";
                                pasarA = "MXN";
                                break;
                        case "Peso Mexicano a Dolar Estadounidense":

                                cambiarDe = "MXN";
                                pasarA = "USD";
                                break;
                        case "Peso Mexicano a Euros":

                                cambiarDe = "MXN";
                                pasarA = "EUR";
                                break;
                        case "Peso Mexicano a Dolar Canadiense":

                                cambiarDe = "MXN";
                                pasarA = "CAD";
                                break;
                        case "Peso Mexicano a Peso Colombiano":

                                cambiarDe = "MXN";
                                pasarA = "COP";
                                break;

                        default:
                                break;
                }
                datosAPI[0] = fechaFormateada;
                datosAPI[1] = montoDivisa;
                datosAPI[2] = cambiarDe;
                datosAPI[3] = pasarA;

                APIConversor respuesta = new APIConversor();
                double valorConvertido = respuesta.get(datosAPI[0],datosAPI[1],datosAPI[2],datosAPI[3]);

                double valorOriginal = valorConvertido;
                DecimalFormat df = new DecimalFormat("#.##");
                String valorFormateado = df.format(valorOriginal);
                double valorRedondeado = Double.parseDouble(valorFormateado);

                JOptionPane.showMessageDialog(null,"El resultado de la conversion $ " + montoDivisa + " " + tipoDivisa + " es : $ " + valorRedondeado + " al dia " + fechaFormateada);
                MensajeFin mensajeFin = new MensajeFin();
                mensajeFin.fin();


        }
}