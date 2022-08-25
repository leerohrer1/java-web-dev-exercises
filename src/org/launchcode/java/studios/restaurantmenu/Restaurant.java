package org.launchcode.java.studios.restaurantmenu;

import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        Menu restaurantMenu = new Menu();
        Date dateMenuLastUpdated = restaurantMenu.getMenuLastUpdatedDate();
        System.out.println(dateMenuLastUpdated);
    }
}
