/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.lang.*;
import Ejercicio1.Circulo;

/**
 *
 * @author Leonel Gonzalez Vidales
 */
public class Principal {
    public static void main(String[] args){
        double radio = 0;
        boolean esNumero = true;
        Circulo circulo = new Circulo();
        do{
            try {
            radio = Double.parseDouble(JOptionPane.showInputDialog(
                null, 
                "Ingresa el radio del circulo", 
                "Ingresando el radio",
                JOptionPane.QUESTION_MESSAGE));
            esNumero = true;
            circulo.setRadio(radio);
            System.out.println(esNumero);
            } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, 
                "Bebé, escribe números, porfi",
                "Cuidado bebé", 
                JOptionPane.INFORMATION_MESSAGE);
            esNumero = false;   
            System.out.println(esNumero);
        }
        } while(esNumero != true);
        circulo.calcularPerimetro();
        circulo.calcularArea();
        JOptionPane.showMessageDialog(null, 
                "El perimetro es: " + String.format("%1$,.6f",circulo.getPerimetro()) + 
                        "\nEl área es: " + String.format("%1$,.6f",circulo.getArea()),
                "Resultados", 
                JOptionPane.INFORMATION_MESSAGE);
        
    }
}
