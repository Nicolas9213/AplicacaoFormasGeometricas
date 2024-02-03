package Formas;

public class Circulo extends Forma {

    private double raio, diametro;

    @Override
    public String inserirInformações() {
        return String.format("Círculo - Raio: %.2f | Diâmetro: %.2f | Área: %.2f | Perimetro: %.2f, raio",
                raio, raio * 2, calcularArea(), calcularPerimetro());
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
