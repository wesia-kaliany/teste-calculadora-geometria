package geometria;

public class Triangulo{

    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public String avaliarTipo() {

        if (lado1 == lado2 && lado2 == lado3)
            return "EQUILATERO";

        if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
            return "ISOSCELES";

        return "ESCALENO";
    }
}

