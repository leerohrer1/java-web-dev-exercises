package exercises.technology;

public class Laptop extends Computer {
    private boolean purchasedMouse = false;

    public Laptop(String aScreenSize, String aBrand) {
        super(aScreenSize, aBrand);
    }

    private boolean togglePurchasedMouse() {
        return !purchasedMouse;
    }
}
