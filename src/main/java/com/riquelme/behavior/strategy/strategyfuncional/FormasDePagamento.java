package com.riquelme.behavior.strategy.strategyfuncional;

import java.math.BigDecimal;

public class FormasDePagamento {

    public static void dinheiro(BigDecimal valorTotal){
        System.out.println("...rodando algoritmo do pagamento em DINHEIRO com valor: " + valorTotal);
    }

    public static void cartao(BigDecimal valorTotal){
        System.out.println("...rodando algoritmo do pagamento em CARTAO com valor: " + valorTotal);
    }

    public static void cheque(BigDecimal valorTotal){
        System.out.println("...rodando algoritmo do pagamento em CHEQUE com valor: " + valorTotal);
    }

}
