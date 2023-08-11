package com.riquelme.behavior.strategy.strategyenum;

import java.math.BigDecimal;

public class PagamentoStrategyComEnum {

    public void pagar(FormasDePagamentoEnum formasDePagamentoEnum){
        BigDecimal valorTotalDaCompra = somaValorTotalDaCompra();
        formasDePagamentoEnum.executar(valorTotalDaCompra);
    }

    // Método que ilustra o que, no mundo real,
    // seria a soma do valor total da compra
    private BigDecimal somaValorTotalDaCompra() {
        return new BigDecimal("100");
    }

}
