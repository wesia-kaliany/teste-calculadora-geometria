package geometria;

public class TesteCalculoArea {

    private static void testarQuadrado() {
        Quadrado q = new Quadrado(4);
        System.out.println("Área do quadrado: " + q.calcularArea());
    }

    private static void testarRetangulo() {
        Retangulo r = new Retangulo(5, 3);
        System.out.println("Área do retângulo: " + r.calcularArea());
    }

    private static void testarTriangulo() {
        Triangulo t = new Triangulo(3, 3, 5);
        System.out.println("Tipo do triângulo: " + t.avaliarTipo());
    }
}

