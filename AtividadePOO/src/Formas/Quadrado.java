package Formas;

import java.util.Scanner;

public class Quadrado extends Forma {
    Scanner sc = new Scanner(System.in);

    private double lado;

    @Override
    public void inserirInformações() {
        System.out.println("Insira o tamanho do lado do quadrado: ");
        this.lado = this.sc.nextDouble();
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {

        return lado * 4;
    }
}
