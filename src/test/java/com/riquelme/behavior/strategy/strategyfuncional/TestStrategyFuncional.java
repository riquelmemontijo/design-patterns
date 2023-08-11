package com.riquelme.behavior.strategy.strategyfuncional;

import org.junit.jupiter.api.Test;

public class TestStrategyFuncional {

    @Test
    public void totalTest(){
        var pagamentoStrategyFuncional = new PagamentoStrategyFuncional();
        pagamentoStrategyFuncional.pagar(FormasDePagamento::cartao);
        pagamentoStrategyFuncional.pagar(FormasDePagamento::dinheiro);
        pagamentoStrategyFuncional.pagar(FormasDePagamento::cheque);
    }

}
