package org.launchcode.java.studios.restaurantmenu;
import java.util.Date;

public class Menu {
    private Date menuLastUpdatedDate = new Date();
//    private MenuItem pistachios = new MenuItem(1.50, "They are green.", "Appetizer");
//    private MenuItem cashewButterSandwich = new MenuItem(4.50, "A tasty cashew butter sandwich made on " +
//            "homemade wheat bread.", "Main");
//    private MenuItem slicedApples = new MenuItem(1.50, "A full honeycrisp apple, sliced into 8 pieces",
//            "Dessert");

   private String newItemFlag() {
        return "This is a new Item.";
    };

   private String displayLastUpdatedDate() {
       return "The menu was last updated " + menuLastUpdatedDate + ".";
   }

   private MenuItem createNewMenuItem(double cost, String description, String category) {
       return new MenuItem(cost, description, category);
   }
}
