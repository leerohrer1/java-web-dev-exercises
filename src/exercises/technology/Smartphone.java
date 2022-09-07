package exercises.technology;

public class Smartphone extends Computer {
    private boolean purchasedHeadphones = false;

    public Smartphone(String aScreenSize, String aBrand) {
        super(aScreenSize, aBrand);
    }

    private boolean togglePurchasedHeadphones() {
        return !purchasedHeadphones;
    }
}
