package com.riquelme.behavior.strategy.strategyinterface;

import org.junit.jupiter.api.Test;

public class TestStrategyComInterface {

    @Test
    public void totalTest(){
        var pagamentoStrategyComInterface = new PagamentoStrategyComInterface();
        pagamentoStrategyComInterface.pagar(new Dinheiro());
        pagamentoStrategyComInterface.pagar(new Cartao());
        pagamentoStrategyComInterface.pagar(new Cheque());
    }

}
