import java.awt.image.DataBufferUShort;
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        Dish soup = new Soup();
        Dish steak = new Steak();

        ArrayList<Dish> dishes = new ArrayList<>();
        dishes.add(soup);
        dishes.add(steak);

        for (Dish dish : dishes) {
            if (dish instanceof Soup){
                Soup mySoup = (Soup) dish;
                mySoup.cook();
            }
            else if (dish instanceof Steak){
                Steak mySteak = (Steak) dish;
                mySteak.cook();
            }
            System.out.println("-----------------------------------------------");
        }
    }
}

interface Dish{
    void cook();
}

class Soup implements Dish{

    @Override
    public void cook() {
        System.out.println("Готуємо зупу");
    }
}

class Steak implements Dish {

    @Override
    public void cook() {
        System.out.println("Готуємо стейк");
    }
}
