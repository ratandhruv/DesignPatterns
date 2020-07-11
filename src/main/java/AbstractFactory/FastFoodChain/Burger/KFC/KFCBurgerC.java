package AbstractFactory.FastFoodChain.Burger.KFC;

import AbstractFactory.FastFoodChain.Burger.Burger;

public class KFCBurgerC implements Burger {

    public Burger create() {
        System.out.print("Creating KFCBurger B. Thank You!");
        return new KFCBurgerC();
    }
}