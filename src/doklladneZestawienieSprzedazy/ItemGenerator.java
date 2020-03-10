package doklladneZestawienieSprzedazy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ItemGenerator {
    public static List<Item> generateItems(){
        List<Item> items = new ArrayList<>();
        Item item1 = new Item("telewizor", BigDecimal.valueOf(1200.40),BigDecimal.valueOf(20));
        Item item2 = new Item("krzeslo", BigDecimal.valueOf(550.20), BigDecimal.valueOf(10));
        Item item3 = new Item("stol", BigDecimal.valueOf(10000.01), BigDecimal.valueOf(22));
        items.add(item1);
        items.add(item2);
        items.add(item3);

        return items;
    }
}
