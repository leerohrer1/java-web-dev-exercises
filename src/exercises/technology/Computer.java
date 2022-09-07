package exercises.technology;

public class Computer {
    private String brand;
    private String screenSize;
    private boolean safetyCase = false;
    private boolean purchased = false;

    public Computer(String aScreenSize, String aBrand) {
        screenSize = aScreenSize;
        brand = aBrand;
    }

    private boolean toggleSafetyCase() {
        return !safetyCase;
    }

    private boolean togglePurchased() {
        return !purchased;
    }
}
