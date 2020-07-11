package AbstractFactory.FastFoodChain.FastFood;

import AbstractFactory.FastFoodChain.Burger.Burger;
import AbstractFactory.FastFoodChain.Burger.KFC.KFCBurgerA;
import AbstractFactory.FastFoodChain.Burger.KFC.KFCBurgerB;
import AbstractFactory.FastFoodChain.Burger.KFC.KFCBurgerC;
import AbstractFactory.FastFoodChain.IceCream.IceCream;
import AbstractFactory.FastFoodChain.IceCream.KFC.KFCIceCreamA;
import AbstractFactory.FastFoodChain.IceCream.KFC.KFCIceCreamB;

public class KFCFactory implements FastFoodFactory{

    public Burger createBurger(Character type) throws Exception {
        switch (type) {
            case ('A'):
                return new KFCBurgerA().create();
            case ('B'):
                return new KFCBurgerB().create();
            case ('C'):
                return new KFCBurgerC().create();
            default:
                throw new Exception("Burger Not found. Sorry!");
        }
    }

    public IceCream createIceCream(Character type) throws Exception {
        switch (type) {
            case ('A'):
                return new KFCIceCreamA().create();
            case ('B'):
                return new KFCIceCreamB().create();
            default:
                throw new Exception("Ice Cream Not found. Sorry!");
        }
    }
}