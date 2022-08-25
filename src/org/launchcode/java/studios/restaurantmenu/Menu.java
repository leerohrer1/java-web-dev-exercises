package org.launchcode.java.studios.restaurantmenu;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    public Date menuLastUpdatedDate = new Date();
    public ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
//    private MenuItem pistachios = new MenuItem(1.50, "They are green.", "Appetizer");
//    private MenuItem cashewButterSandwich = new MenuItem(4.50, "A tasty cashew butter sandwich made on " +
//            "homemade wheat bread.", "Main");
//    private MenuItem slicedApples = new MenuItem(1.50, "A full honeycrisp apple, sliced into 8 pieces",
//            "Dessert");

   public String newItemFlag() {
        return "This is a new Item.";
    };

   public String displayLastUpdatedDate() {
       return "The menu was last updated " + menuLastUpdatedDate + ".";
   }

   public MenuItem createNewMenuItem(double cost, String description, String category) {
       return new MenuItem(cost, description, category);
   }

    public Date getMenuLastUpdatedDate() {
        return menuLastUpdatedDate;
   }

    public void addMenuItem(MenuItem item) {
       this.menuItems.add(item);
    }

    public ArrayList<MenuItem> getMenuItems() {
       return this.menuItems;
    }

    public MenuItem getMenuItem(MenuItem item) {
        return this.menuItems.get(this.menuItems.indexOf(item));
    }

    public void deleteMenuItem(MenuItem item) {
       this.menuItems.remove(this.menuItems.indexOf(item));
    }

}

