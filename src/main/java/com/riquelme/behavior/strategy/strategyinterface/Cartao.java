package com.riquelme.behavior.strategy.strategyinterface;

import java.math.BigDecimal;

public class Cartao implements FormaDePagamento{
    @Override
    public void executar(BigDecimal valorTotal) {
        System.out.println("...rodando algoritmo do pagamento em CARTAO com valor: " + valorTotal);
    }
}