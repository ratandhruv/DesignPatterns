package AbstractFactory.FastFoodChain;

import AbstractFactory.FastFoodChain.Burger.Burger;
import AbstractFactory.FastFoodChain.FastFood.FastFoodFactory;
import AbstractFactory.FastFoodChain.IceCream.IceCream;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Client {

    private String name;
    private FastFoodFactory fastFoodFactory;


    Burger getBurgerA() throws Exception{
        return fastFoodFactory.createBurger('A');
    }

    Burger getBurgerB() throws Exception{
        return fastFoodFactory.createBurger('B');
    }

    Burger getBurgerC() throws Exception{
        return fastFoodFactory.createBurger('C');
    }

    IceCream getIceCreamA() throws Exception{
        return fastFoodFactory.createIceCream('A');
    }

    IceCream getIceCreamB() throws Exception{
        return fastFoodFactory.createIceCream('B');
    }

    IceCream getIceCreamC() throws Exception{
        return fastFoodFactory.createIceCream('C');
    }




}