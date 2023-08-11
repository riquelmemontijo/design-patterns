package com.riquelme.behavior.strategy.strategyenum;

import org.junit.jupiter.api.Test;

public class TestStrategyComEnum {

    @Test
    public void totalTest(){
        var pagamentoStrategyComEnum = new PagamentoStrategyComEnum();
        pagamentoStrategyComEnum.pagar(FormasDePagamentoEnum.DINHEIRO);
        pagamentoStrategyComEnum.pagar(FormasDePagamentoEnum.CARTAO);
        pagamentoStrategyComEnum.pagar(FormasDePagamentoEnum.CHEQUE);
    }

}
