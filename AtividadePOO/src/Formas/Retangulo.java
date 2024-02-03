package Formas;

import java.util.Scanner;

public class Retangulo extends Forma {
    Scanner sc = new Scanner(System.in);

    private double lado1, lado2;

    @Override
    public String inserirInformações() {
        System.out.println("Insira o tamanho do lado 1 do retângulo: ");
        this.lado1 = this.sc.nextDouble();

        System.out.println("Insira o tamanho do lado 2 do retângulo: ");
        this.lado2 = this.sc.nextDouble();
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (lado1 + lado2);
    }
}
