package builder;

/**
 * Created by irunika on 11/2/16.
 */
public class ChikenBurger extends Burger {
    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public int cost() {
        return 100;
    }
}
