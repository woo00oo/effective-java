package com.example.effectivejava.chapter01.item08.finalizer_attack;

import java.math.BigDecimal;

public class BrokenAccount extends Account {

    public BrokenAccount(String accountId) {
        super(accountId);
    }

    @Override
    protected void finalize() throws Throwable {
        this.transfer(BigDecimal.valueOf(1000000), "keesun");
    }
}
