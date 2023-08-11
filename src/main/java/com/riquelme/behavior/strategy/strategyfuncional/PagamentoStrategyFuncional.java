package com.riquelme.behavior.strategy.strategyfuncional;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class PagamentoStrategyFuncional {

    public void pagar(Consumer<BigDecimal> method){
        BigDecimal valor = somaValorTotalDoCarrinhoDeCompra();
        method.accept(valor);
    }

    // Método que ilustra o que, no mundo real,
    // seria a soma do valor total da compra.
    private BigDecimal somaValorTotalDoCarrinhoDeCompra() {
        return new BigDecimal("100");
    }

}
