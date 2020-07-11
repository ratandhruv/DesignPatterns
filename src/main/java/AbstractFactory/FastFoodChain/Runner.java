package AbstractFactory.FastFoodChain;

import AbstractFactory.FastFoodChain.FastFood.BurgerKingFactory;
import AbstractFactory.FastFoodChain.FastFood.FastFoodFactory;
import AbstractFactory.FastFoodChain.FastFood.KFCFactory;

public class Runner {

    public static FastFoodFactory kfcFactory = new KFCFactory();
    public static FastFoodFactory burgerKingFactory = new BurgerKingFactory();

    public static void main(String[] args) throws Exception{
        Client client = new Client("ABC", kfcFactory);
        client.getBurgerA();
        client.getBurgerB();
        client.getIceCreamB();

        client = new Client("ABC",burgerKingFactory);
        client.getIceCreamC();
        client.getBurgerB();
    }
}