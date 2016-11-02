package builder;

/**
 * Created by irunika on 11/2/16.
 */
public class VegiBurger extends Burger {
    @Override
    public String getName() {
        return "Vegi Burger";
    }

    @Override
    public int cost() {
        return 70;
    }
}
