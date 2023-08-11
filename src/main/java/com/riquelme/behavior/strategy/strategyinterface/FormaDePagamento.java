package com.riquelme.behavior.strategy.strategyinterface;

import java.math.BigDecimal;

public interface FormaDePagamento {
    void executar(BigDecimal valorTotal);
}
