package com.riquelme.behavior.strategy.strategyinterface;

import java.math.BigDecimal;

public class Cheque implements FormaDePagamento{
    @Override
    public void executar(BigDecimal valorTotal) {
        System.out.println("...rodando algoritmo do pagamento em CHEQUE com valor: " + valorTotal);
    }
}