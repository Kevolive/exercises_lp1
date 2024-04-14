package com.cesde;

import java.util.Scanner;

public class Ejercicios {
    Scanner scanner = new Scanner(System.in);
    
    public String ejercicio1(int num1, int num2) {
        if (num1>num2) {
            return "El número mayor es: num1";
        } else if (num2>num1) {
            return "El número mayor es: num2";
        } else {
            return "Los números son iguales.";
        }
        
    }
    
    public String ejercicio2(double calificacion) {
       if (calificacion >=3.5) {
        return "¡Felicidades! Usted aprobó.";
       } else if (calificacion<3.5) {
        return "Lo siento, usted ha reprobado";
       } else {
        return "Calificación inválida";
       }
    
        
    }

    
        public double ejercicio3(double precio) {
        double descuento = (precio >=50000) ? precio *0.1: precio*0.0;
        double precioFinal = precio - descuento; 
        if (precio>=50000) {

            
       return precioFinal;
    }
    return precioFinal; }

    public String ejercicio4(int tipoFigura, double ladoCuadrado, double baseTriangulo, double alturaTriangulo,
    double radioCirculo) {
    
        switch (tipoFigura) {
            case 1:
            System.out.println("El área de la figura es: " + (ladoCuadrado*ladoCuadrado));
            break;
            case 2: 
            System.out.println("El área de la figura es: " + (baseTriangulo*alturaTriangulo)/2);
            break;
            case 3: 
            System.out.println("El área de la figura es: " + (3.1416 * radioCirculo));
            break;
            default:
            System.out.println("Tipo de figura no válida");
        } return "";
        }
    
    
    
    public int ejercicio5(int num1, int num2, int num3) {
        if (num1<num2 && num1<num3) {
            return num1;
        } else if (num2<num3 && num2<num1) {
            return num2;
        } else {
            return num3;
        }
        
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
