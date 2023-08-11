package com.riquelme.behavior.strategy.strategyinterface;

import java.math.BigDecimal;

public class PagamentoStrategyComInterface {

    public void pagar(FormaDePagamento formaDePagamento){
        BigDecimal valor = somaValorTotalDoCarrinhoDeCompra();
        formaDePagamento.executar(valor);
    }

    // Método que ilustra o que, no mundo real,
    // seria a soma do valor total da compra.
    private BigDecimal somaValorTotalDoCarrinhoDeCompra() {
        return new BigDecimal("100");
    }

}
