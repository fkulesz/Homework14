package opony;

public class MainWheel {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel("abc123", WheelType.UNIVERSAL, 45 );
        System.out.println(wheel1.toString());
        System.out.println(wheel1.getType());
    }
}
