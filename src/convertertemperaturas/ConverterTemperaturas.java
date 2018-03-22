/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertertemperaturas;

import javax.swing.*;

/**
 *
 * @author Gabriel
 */
public class ConverterTemperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String temp = JOptionPane.showInputDialog("Digite uma temperatura em Fahrenheit: ");
        Temperatura temperatura1 = new Temperatura(Double.parseDouble(temp));
        JOptionPane.showMessageDialog(null,"Valor da temperatura Fahrenheit: "+ temperatura1.getTempFahrenheit());

        JOptionPane.showMessageDialog(null,"Valor da temperatura Fahrenheit convertida em Celsius: "+ temperatura1.converterParaCelsius());
        JOptionPane.showMessageDialog(null,"Valor da temperatura Fahrenheit convertida em Kelvin: "+ temperatura1.converterParaKelvin());


    }
    
}
