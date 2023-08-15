package com.riquelme.creational.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFactory {

    @Test
    public void testFactory() throws InterruptedException {
        String triangulo = FabricaDePoligono.obterPoligono(3)
                                            .obterNomeDaFormaGeometrica();

        String quadrado = FabricaDePoligono.obterPoligono(4)
                                           .obterNomeDaFormaGeometrica();

        String pentagono = FabricaDePoligono.obterPoligono(5)
                                            .obterNomeDaFormaGeometrica();

        String hexagono = FabricaDePoligono.obterPoligono(6)
                                           .obterNomeDaFormaGeometrica();

        // Testando casos onde o polígono é gerado com sucesso

        Assertions.assertEquals("Triângulo", triangulo);
        Assertions.assertEquals("Quadrado", quadrado);
        Assertions.assertEquals("Pentagono", pentagono);
        Assertions.assertEquals("Hexagono", hexagono);

        // Testando casos onde o polígono não é gerado e uma exception é lançada

        String exceptionMessage = "A fábrica de conexões não é capaz de fabricar um polígono com essa quantidade de lados";

        Assertions.assertThrows(FormaGeometricaException.class,
                                () -> FabricaDePoligono.obterPoligono(1),
                                exceptionMessage);

        Assertions.assertThrows(FormaGeometricaException.class,
                                () -> FabricaDePoligono.obterPoligono(7),
                                exceptionMessage);
    }

}
