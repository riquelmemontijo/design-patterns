package com.riquelme.behavior.strategy.strategylambda;

import java.math.BigDecimal;

public interface FormaDePagamento {
    void executar(BigDecimal valorTotal);
}
