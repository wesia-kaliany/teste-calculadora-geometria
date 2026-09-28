
    package geometria;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class TesteGeometria {

        static Quadrado quadrado;
        static Retangulo retangulo;
        static Triangulo equilatero;
        static Triangulo isosceles;
        static Triangulo escaleno;

        @BeforeAll
        static void setup() {
            quadrado = new Quadrado(4);
            retangulo = new Retangulo(5, 2);
            equilatero = new Triangulo(3, 3, 3);
            isosceles = new Triangulo(3, 3, 5);
            escaleno = new Triangulo(3, 4, 5);
        }

        @Test
        void testeAreaQuadrado() {
            assertEquals(16, quadrado.calcularArea());
        }

        @Test
        void testeAreaRetangulo() {
            assertEquals(10, retangulo.calcularArea());
        }

        @Test
        void testeTrianguloEquilatero() {
            assertEquals("EQUILATERO", equilatero.avaliarTipo());
        }

        @Test
        void testeTrianguloIsosceles() {
            assertEquals("ISOSCELES", isosceles.avaliarTipo());
        }

        @Test
        void testeTrianguloEscaleno() {
            assertEquals("ESCALENO", escaleno.avaliarTipo());
        }
    }

