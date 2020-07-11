package AbstractFactory.FastFoodChain.Burger.BurgerKing;

import AbstractFactory.FastFoodChain.Burger.Burger;

public class KingBurgerA implements Burger {

    public Burger create() {
        System.out.print("Creating KingBurger A. Thank You!");
        return new KingBurgerA();
    }
}