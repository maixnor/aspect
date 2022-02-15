package at.spengergasse.library.billing;

import java.math.BigDecimal;

public class User {

    public User(Long id) {
        this.id = id;
        amountToPay = BigDecimal.ZERO;
    }

    public Long id;
    public BigDecimal amountToPay;

    public void addAmount(BigDecimal amount) {
        amountToPay = amountToPay.add(amount);
    }

}
