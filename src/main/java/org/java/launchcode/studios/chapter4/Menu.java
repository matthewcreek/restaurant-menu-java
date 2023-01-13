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
        menu.add(food);
        updatedLast = "The menu was last updated on: " + new Date();
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
