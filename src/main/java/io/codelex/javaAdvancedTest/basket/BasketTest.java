package io.codelex.javaAdvancedTest.basket;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {
    Basket<Apple> appleBasket = new Basket<>();
    Basket<Mushroom> mushroomBasket = new Basket<>();
    @Test
    public void testCreateAndAddOrRemoveAppleBasket() throws BasketFullException, BasketEmptyException {
        Apple apple = new Apple();

        appleBasket.addToBasket(apple);
        appleBasket.addToBasket(apple);
        appleBasket.addToBasket(apple);
        assertEquals(3, appleBasket.getCurrentItems());

        appleBasket.removeFromBasket(apple);
        assertEquals(2, appleBasket.getCurrentItems());
    }

    @Test
    public void testExceptionsAppleBasket() throws BasketFullException{
        Apple apple = new Apple();
        assertThrows(BasketEmptyException.class, () -> appleBasket.removeFromBasket(apple));

        for (int i = 0; i < 10; i++) {
            Apple apple1 = new Apple();
            appleBasket.addToBasket(apple1);
        }


        assertThrows(BasketFullException.class, () -> appleBasket.addToBasket(apple));
    }

    @Test
    public void testCreateAndAddOrRemoveMushroomBasket() throws BasketFullException, BasketEmptyException {
        Mushroom mushroom = new Mushroom();

        mushroomBasket.addToBasket(mushroom);
        mushroomBasket.addToBasket(mushroom);
        mushroomBasket.addToBasket(mushroom);

        assertEquals(3, mushroomBasket.getCurrentItems());

        mushroomBasket.removeFromBasket(mushroom);
        assertEquals(2, mushroomBasket.getCurrentItems());
    }

    @Test
    public void testExceptionsMushroomBasket() throws BasketFullException{
        Mushroom mushroom = new Mushroom();
        assertThrows(BasketEmptyException.class, () -> mushroomBasket.removeFromBasket(mushroom));

        for (int i = 0; i < 10; i++) {
            Mushroom mushroom1 = new Mushroom();
            mushroomBasket.addToBasket(mushroom1);
        }
        assertThrows(BasketFullException.class, () -> mushroomBasket.addToBasket(mushroom));
    }
}
