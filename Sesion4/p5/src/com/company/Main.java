package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var estacion = "PRIMAVERA";

        switch(estacion) {
            case "VERANO":
                System.out.println("es verano");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("no se cual es mi estacion");
                break;
        }
    }
}
