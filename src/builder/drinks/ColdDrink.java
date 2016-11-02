package builder;

/**
 * Created by irunika on 11/2/16.
 */
public  abstract class ColdDrink implements Item {

    @Override
    public Packing getPacking() {
        return new Bottle();
    }

}
