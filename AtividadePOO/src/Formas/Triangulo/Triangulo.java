package Formas.Triangulo;

import Formas.Forma;

public abstract class Triangulo extends Forma {

    private double ladoA, ladoB, ladoC;

    private String verificarTipoTriangulo() {
        if (ladoA == ladoB && ladoB == ladoC) {
            return "Equilátero";
        } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}
