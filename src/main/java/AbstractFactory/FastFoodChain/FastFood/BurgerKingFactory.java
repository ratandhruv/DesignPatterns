package AbstractFactory.FastFoodChain.FastFood;

import AbstractFactory.FastFoodChain.Burger.Burger;
import AbstractFactory.FastFoodChain.Burger.BurgerKing.KingBurgerA;
import AbstractFactory.FastFoodChain.Burger.BurgerKing.KingBurgerB;
import AbstractFactory.FastFoodChain.Burger.BurgerKing.KingBurgerC;
import AbstractFactory.FastFoodChain.IceCream.BurgerKing.KingIceCreamA;
import AbstractFactory.FastFoodChain.IceCream.BurgerKing.KingIceCreamB;
import AbstractFactory.FastFoodChain.IceCream.BurgerKing.KingIceCreamC;
import AbstractFactory.FastFoodChain.IceCream.IceCream;

public class BurgerKingFactory implements FastFoodFactory{

    public Burger createBurger(Character type) throws Exception {
        switch (type) {
            case ('A'):
                return new KingBurgerA().create();
            case ('B'):
                return new KingBurgerB().create();
            case ('C'):
                return new KingBurgerC().create();
            default:
                throw new Exception("Burger Not found. Sorry!");
        }
    }

    public IceCream createIceCream(Character type) throws Exception {
        switch (type) {
            case ('A'):
                return new KingIceCreamA().create();
            case ('B'):
                return new KingIceCreamB().create();
            case ('C'):
                return new KingIceCreamC().create();
            default:
                throw new Exception("Ice Cream Not found. Sorry!");
        }
    }
}