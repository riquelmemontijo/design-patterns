package com.riquelme.creational.factory;

public class FabricaDePoligono {
    public static Poligono obterPoligono(Integer numeroDeLados) throws InterruptedException {
        switch (numeroDeLados) {
            case 3 -> {
                gerarEfeitoDeFabricacaoDePoligono("triângulo");
                return new Triangulo();
            }
            case 4 -> {
                gerarEfeitoDeFabricacaoDePoligono("quadrado");
                return new Quadrado();
            }
            case 5 -> {
                gerarEfeitoDeFabricacaoDePoligono("pentagono");
                return new Pentagono();
            }
            case 6 -> {
                gerarEfeitoDeFabricacaoDePoligono("hexagono");
                return new Hexagono();
            }
            default ->
                    throw new FormaGeometricaException("A fábrica de conexões não é capaz de fabricar um polígono com essa quantidade de lados");
        }
    }

    private static void gerarEfeitoDeFabricacaoDePoligono(String poligono) throws InterruptedException {
        System.out.print("Fabricando " + poligono + "...\n");
        Thread.sleep(1500);
    }
}
