package com.armearaby.conversor.machine;

import javax.swing.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class APIConversor implements LogicaAPI {

    public double get(String fechaFormateada, String montoDivisa,String cambiarDe, String pasarA) {
        double valorFinal = 0;

        try {
            System.out.println("API Excecution in progress... connecting API ExchangeRates");
            URL url = new URL("https://api.apilayer.com/exchangerates_data/convert?to=" + pasarA + "&from=" + cambiarDe + "&amount=" + montoDivisa + "&apikey=6oEYypXV2u8ywvcmW5PRgnhG1Ben81Fu");
            HttpURLConnection connectionAPI = (HttpURLConnection) url.openConnection();
            connectionAPI.setRequestMethod("GET");
            connectionAPI.setRequestProperty("apikey", "6oEYypXV2u8ywvcmW5PRgnhG1Ben81Fu");

            if (connectionAPI.getResponseCode() == 200) {
                List informationString = new ArrayList();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.add(scanner.nextLine());
                }
                scanner.close();

                String valor = (String) informationString.get(12);
                valor = valor.replaceAll("\"result\": ", "");
                valorFinal = Double.parseDouble(valor);
                System.out.println("El resultado es: " + valorFinal);
            } else {
                System.out.println("Error de respuesta recibido..." + connectionAPI.getResponseCode());
            }
            connectionAPI.disconnect();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en obtencion de datos de API", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            motor reintentar = new motor();
            reintentar.inicio();
        }
        return valorFinal;
    }
}
