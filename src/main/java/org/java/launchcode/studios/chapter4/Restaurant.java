package org.java.launchcode.studios.chapter4;

public class Restaurant {
    public static void main(String[] args) {

        Menu restaurant = new Menu();
        MenuItem food1 = new MenuItem(12.99, "Hamburger with tomato jam and melted gouda cheese", "Entree");
        MenuItem food2 = new MenuItem(14.99, "Fried Catfish", "Entree");

        restaurant.addItem(food1);
//        System.out.println(food1.getDateInitialized());
        restaurant.addItem(food2);
//        System.out.println(food2.getDateInitialized());

        restaurant.printMenu();

        restaurant.addItem(food2);

        restaurant.lastItemAdded(restaurant.getMenu());

        restaurant.removeItem(food2);
        restaurant.printMenu();
        restaurant.lastItemAdded(restaurant.getMenu());

        System.out.println(food1);



    }
}