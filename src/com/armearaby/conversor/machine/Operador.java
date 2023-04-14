package com.armearaby.conversor.machine;


import javax.swing.*;

public class Operador implements LogicaAPI{

        public void resultado(String tipoDivisa, String montoDivisa) {
                String datosAPI[];
                datosAPI = new String[5];
                String cambiarDe = "", pasarA = "";

                switch (tipoDivisa) {
                        case "De MXN a Dolares":

                                cambiarDe = "MXN";
                                pasarA = "USD";
                                break;

                        case "De MXN a Euro":

                                cambiarDe = "MXN";
                                pasarA = "EUR";
                                break;
                        case "De MXN a Yen Japones":

                                cambiarDe = "MXN";
                                pasarA = "JPY";
                                break;
                        case "De MXN a Won SurCOreano":

                                cambiarDe = "MXN";
                                pasarA = "KRW";
                                break;
                        case "De MXN a Peso Colombiano":

                                cambiarDe = "MXN";
                                pasarA = "COP";
                                break;
                        case "De Dolares a MXN":

                                cambiarDe = "USD";
                                pasarA = "MXN";
                                break;
                        case "De Euro a MXN":

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

                JOptionPane.showMessageDialog(null,"El resultado de la conversion " + tipoDivisa + " es : $ " + valorFormateado);
                MensajeFin mensajeFin = new MensajeFin();
                mensajeFin.fin();


        }
}