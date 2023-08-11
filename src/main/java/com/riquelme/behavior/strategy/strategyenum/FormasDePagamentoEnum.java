package com.riquelme.behavior.strategy.strategyenum;

import java.math.BigDecimal;

public enum FormasDePagamentoEnum {
    DINHEIRO {
        @Override
        void executar(BigDecimal valorTotalDaCompra) {
            System.out.println("...rodando algoritmo do pagamento em DINHEIRO com valor: " + valorTotalDaCompra);
        }
    },
    CARTAO {
        @Override
        void executar(BigDecimal valorTotalDaCompra) {
            System.out.println("...rodando algoritmo do pagamento em CARTAO com valor: " + valorTotalDaCompra);
        }
    },
    CHEQUE {
        @Override
        void executar(BigDecimal valorTotalDaCompra) {
            System.out.println("...rodando algoritmo do pagamento em CHEQUE com valor: " + valorTotalDaCompra);
        }
    };

    abstract void executar(BigDecimal valorTotalDaCompra);
}
