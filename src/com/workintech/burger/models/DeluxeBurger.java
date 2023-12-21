package com.workintech.burger.models;

import com.workintech.burger.enums.BreadRollType;

public class DeluxeBurger extends Hamburger{

    private Drink drink;
    private Cips cips;

    public DeluxeBurger(Drink drink, Cips cips) {
        super("DELUXE_BURGER", "DOUBLE", 19.10, BreadRollType.DOUBLE_BURGER);
        this.drink = drink;
        this.cips = cips;
    }

    @Override
    public void addAddition(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("DRINK: " + drink.getType() + "\n");
        builder.append("CIPS: " + cips.getCipsType() + "\n");
        System.out.println(builder);
        super.itemizeHamburger();
    }
}