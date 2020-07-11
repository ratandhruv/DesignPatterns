package AbstractFactory.FastFoodChain.IceCream.BurgerKing;

import AbstractFactory.FastFoodChain.IceCream.IceCream;

import java.text.MessageFormat;

public class KingIceCreamA implements IceCream {


    public IceCream create() {
        System.out.println(MessageFormat.format("Creating {0} Have a cool day", this.getClass().getSimpleName()));
        return new KingIceCreamA();
    }
}