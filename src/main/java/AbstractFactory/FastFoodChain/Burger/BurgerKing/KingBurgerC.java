package AbstractFactory.FastFoodChain.Burger.BurgerKing;

import AbstractFactory.FastFoodChain.Burger.Burger;

public class KingBurgerC implements Burger {

    public Burger create() {
        System.out.print("Creating KingBurger C. Thank You!");
        return new KingBurgerC();
    }
}