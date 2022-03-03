package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Coche miCoche = new Coche ();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puertas);
    }
}
class Coche {
    public int puertas = 0;
    public void AgregarPuerta () {
        this.puertas++;
    }
}