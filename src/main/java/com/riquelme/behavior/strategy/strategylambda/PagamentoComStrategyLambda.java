package com.riquelme.behavior.strategy.strategylambda;

import java.math.BigDecimal;

public class PagamentoComStrategyLambda {

    public void pagar(FormaDePagamento formaDePagamento){
        BigDecimal valorTotalDaCompra = somaValorTotalDaCompra();
        formaDePagamento.executar(valorTotalDaCompra);
    }

    // Método que ilustra o que, no mundo real,
    // seria a soma do valor total da compra.
    private BigDecimal somaValorTotalDaCompra() {
        return new BigDecimal("100");
    }
}
