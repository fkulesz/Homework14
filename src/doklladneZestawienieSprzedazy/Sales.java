package doklladneZestawienieSprzedazy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class Sales {
    static List<Item> items=  ItemGenerator.generateItems();
    BigDecimal sumNetto  = countSales();
    BigDecimal sumGross = countGrossSales();
    BigDecimal sumVat = countTax();



    public static BigDecimal countSales(){

        BigDecimal sum = BigDecimal.ZERO;
        for (Item item: items)
        {
          sum  = sum.add(item.getPrice());

        }
        System.out.println("suma sprzedazy: " + sum);
        return sum;
    }

    public static BigDecimal countGrossSales(){
        BigDecimal sum = BigDecimal.ZERO;
        for (Item item: items)
        {
            sum  = sum.add(item.getBruttoPrice());

        }
        System.out.println("suma sprzedazy brutto: " + sum);

        return sum;
    }
    public static BigDecimal countTax(){
        BigDecimal sumTax = BigDecimal.ZERO;
        for (Item item: items)
        {
            sumTax  = sumTax.add(item.getTax());

        }
        System.out.println("suma podatku vat: " + sumTax);

        return sumTax;
    }
}
