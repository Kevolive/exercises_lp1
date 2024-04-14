package com.cesde;

public class Main {
    public static void main(String[] args) {
        Ejercicios ejercicios = new Ejercicios();

        System.out.println("Ejercicio 1");
        System.out.println(ejercicios.ejercicio1(100, 10));
        System.out.println("-------------------------------------------------");

        System.out.println("Ejercicio 2");
        System.out.println(ejercicios.ejercicio2(3.0));
        System.out.println("-------------------------------------------------");

        System.out.println("Ejercicio 3");
        System.out.println(ejercicios.ejercicio3(70000));
        System.out.println("-------------------------------------------------");

        System.out.println("Ejercicio 4");
        System.out.println(ejercicios.ejercicio4(4, 0, 0, 0, 12));
        System.out.println("-------------------------------------------------"); 

        System.out.println("Ejercicio 5");
        System.out.println(ejercicios.ejercicio5(1,8,14));
        System.out.println("------------------------------------------------_-");

    }
}