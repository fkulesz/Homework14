package taliaKart;

public enum Color {
    KARO("dzwonek", "diamonds"),
    KIER("serce", "hearts"),
    TREFL("żołądż", "clubs"),
    PIK("wino", "spades");

    private final String desriptionPL;
    private final String descriptionEN;

    Color(String desriptionPL, String descriptionEN) {
        this.desriptionPL = desriptionPL;
        this.descriptionEN = descriptionEN;
    }

    void showEngName(){
        System.out.println(descriptionEN);
    }
    void showPLName(){
        System.out.println(desriptionPL);
    }

}
