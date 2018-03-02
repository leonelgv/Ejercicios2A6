package Ejercicio1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonel González Vidales
 */
public class Circulo {
    // Declaración de los atributos
    // Sintáxis es la siguiente:
    // metodoAcceso tipoDato nombreAtributo
    // metodoAcceso: public, private, protected
    private double radio;
    private double perimetro;
    private double area;
    
    public void setRadio(double radio){
        if(radio <= 0 ){
            this.radio = 0;
        } else {
            this.radio = radio;
        }
    }
    
    public double getArea(){
        return this.area;
    }
    
    public double getPerimetro(){
        return this.perimetro;
    }
    
    public double getRadio(){
        return this.radio;
    }
    
    public void calcularArea(){
        this.area = Math.PI * (this.radio * this.radio);
    }
    
    public void calcularPerimetro(){
        this.perimetro = 2 * Math.PI * this.radio;
    }
}