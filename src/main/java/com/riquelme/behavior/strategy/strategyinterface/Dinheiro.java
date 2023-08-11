package com.riquelme.behavior.strategy.strategyinterface;

import java.math.BigDecimal;

public class Dinheiro implements FormaDePagamento{
    @Override
    public void executar(BigDecimal valorTotal) {
        System.out.println("...rodando algoritmo do pagamento em DINHEIRO com valor: " + valorTotal);
    }
}
