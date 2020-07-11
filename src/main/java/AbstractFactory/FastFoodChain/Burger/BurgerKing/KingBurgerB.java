package AbstractFactory.FastFoodChain.Burger.BurgerKing;

import AbstractFactory.FastFoodChain.Burger.Burger;

public class KingBurgerB implements Burger {

    public Burger create() {
        System.out.print("Creating KingBurger B. Thank You!");
        return new KingBurgerB();
    }
}