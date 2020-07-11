package AbstractFactory.FastFoodChain.IceCream.KFC;

import AbstractFactory.FastFoodChain.IceCream.IceCream;

public class KFCIceCreamA implements IceCream {


    public IceCream create() {
        System.out.println("Creeating KFCIceCream A. Have a cool day ");
        return new KFCIceCreamA();
    }
}