package AbstractFactory.FastFoodChain.IceCream.KFC;

import AbstractFactory.FastFoodChain.IceCream.IceCream;

public class KFCIceCreamB implements IceCream {


    public IceCream create() {
        System.out.println("Creeating KFCIceCream B. Have a cool day ");
        return new KFCIceCreamB();
    }
}