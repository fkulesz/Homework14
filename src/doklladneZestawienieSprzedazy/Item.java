package doklladneZestawienieSprzedazy;

import java.math.BigDecimal;

import java.math.MathContext;

public class Item {
    private String name;
    private BigDecimal price;
    private BigDecimal vat;

    public Item(String name, BigDecimal price, BigDecimal vat) {
        this.name = name;
        this.price = price;
        this.vat = vat;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getVat() {
        return vat;
    }

    BigDecimal getTax() {
        return price.multiply(vat.divide((new BigDecimal(100)), MathContext.DECIMAL64));
    }
    BigDecimal getBruttoPrice(){
        return price.add(getTax());
    }


}
