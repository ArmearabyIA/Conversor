package com.armearaby.conversor.machine;


import javax.swing.*;

public class Operador implements LogicaAPI{

        public void resultado(String tipoDivisa, String montoDivisa) {
                String datosAPI[];
                datosAPI = new String[5];
                String cambiarDe = "", pasarA = "";

                switch (tipoDivisa) {
                        case "MXN a USD":

                                cambiarDe = "MXN";
                                pasarA = "USD";
                                break;

                        case "MXN a EUR":

                                cambiarDe = "MXN";
                                pasarA = "EUR";
                                break;
                        case "MXN a Yen Japones":

                                cambiarDe = "MXN";
                                pasarA = "JPY";
                                break;
                        case "MXN a Won SurCoreano":

                                cambiarDe = "MXN";
                                pasarA = "KRW";
                                break;
                        case "MXN a peso Colombiano":

                                cambiarDe = "MXN";
                                pasarA = "COP";
                                break;
                        case "USD a MXN":

                                cambiarDe = "USD";
                                pasarA = "MXN";
                                break;
                        case "EUR a MXN":

                                cambiarDe = "EUR";
                                pasarA = "MXN";
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

                double valorFormateado = 0;
                valorFormateado = Math.round((valorConvertido * 100.0)/100.0);

                JOptionPane.showMessageDialog(null,"El resultado de la conversion $ " + montoDivisa + " " + tipoDivisa + " es : $ " + valorFormateado + " al dia " + fechaFormateada);
                MensajeFin mensajeFin = new MensajeFin();
                mensajeFin.fin();


        }
}