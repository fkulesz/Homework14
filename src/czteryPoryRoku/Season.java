package czteryPoryRoku;

import java.util.Arrays;

public enum Season {
    AUTUMN("jesien", new String[]{"wrzesien", "pazdziernik", "listopad"}),
    SPRING("wiosna",  new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("lato", new String[]{"czerwiec", "lipiec", "sierpien"}),
    WINTER("zima", new String[]{"grudzien", "styczen", "luty"});


    private  String[] months;
    private final String name;

    Season(String name, String[] months) {
        this.name = name;
        this.months = months;
    }

    public String[] getMonths() {
        return months;
    }

    public String getName() {
        return name;
    }
}
