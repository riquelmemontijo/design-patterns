package com.riquelme.behavior.strategy.strategylambda;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class TestStrategyComLambda {

    @Test
    public void totalTest(){
        var pagamentoComStrategyLambda = new PagamentoComStrategyLambda();
        var valorTotal = new BigDecimal("100");
        pagamentoComStrategyLambda.pagar(v -> System.out.println("...rodando algoritmo do pagamento em DINHEIRO com valor: " + valorTotal));
        pagamentoComStrategyLambda.pagar(v -> System.out.println("...rodando algoritmo do pagamento em CARTAO com valor: " + valorTotal));
        pagamentoComStrategyLambda.pagar(v -> System.out.println("...rodando algoritmo do pagamento em CHEQUE com valor: " + valorTotal));
    }

}
