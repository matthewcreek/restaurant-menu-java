package org.java.launchcode.studios.chapter4;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menu = new ArrayList<>();
    String updatedLast;
    MenuItem lastAdded;

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    public void addItem(MenuItem food) {
        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i).equals(food)) {
                System.out.println("\nThe food item is already part of the menu.\n");
                return;
            }
        }
        menu.add(food);
        updatedLast = "\nThe menu was last updated on: " + new Date();
    }

    public void removeItem(MenuItem food) {
        int foodToRemove = menu.indexOf(food);
        menu.remove(foodToRemove);
        updatedLast = "\nThe menu was last updated on: " + new Date();
    }

    public void printMenu() {
        for (MenuItem food : menu) {
            System.out.println(food.getDescription() + " : " + food.getPrice());
        }
        System.out.println(this.updatedLast);
    }

    public void lastItemAdded(ArrayList<MenuItem> aMenu){
        lastAdded = aMenu.get(aMenu.size()-1);
        System.out.println("Newest item on the menu is the " +lastAdded.getDescription() + "!");
    }
}
