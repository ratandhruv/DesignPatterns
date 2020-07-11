package AbstractFactory.FastFoodChain.FastFood;

import AbstractFactory.FastFoodChain.Burger.Burger;
import AbstractFactory.FastFoodChain.IceCream.IceCream;

public interface FastFoodFactory {

    Burger createBurger(Character type) throws Exception;

    IceCream createIceCream(Character type) throws Exception;

}