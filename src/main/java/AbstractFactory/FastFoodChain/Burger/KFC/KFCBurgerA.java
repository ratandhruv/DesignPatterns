package AbstractFactory.FastFoodChain.Burger.KFC;

import AbstractFactory.FastFoodChain.Burger.Burger;

public class KFCBurgerA implements Burger {

    public Burger create() {
        System.out.print("Creating KFCBurger A. Thank You!");
        return new KFCBurgerA();
    }
}