package builder;

/**
 * Created by irunika on 11/2/16.
 */
public class CocaCola extends ColdDrink {
    @Override
    public String getName() {
        return "Coca Cola";
    }

    @Override
    public int cost() {
        return 50;
    }
}
