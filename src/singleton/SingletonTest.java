package singleton;

/**
 * Created by irunika on 11/2/16.
 * Test class for the Singleton pattern
 */
public class SingletonTest {
    public static void main(String[] args){
        SingleObject obj1 = SingleObject.getInstance();
        System.out.println(obj1.getValue());

        obj1.setValue(12);

        SingleObject obj2 = SingleObject.getInstance();
        System.out.println(obj2.getValue());

        obj2.setValue(5);
        System.out.println(obj1.getValue());
    }

}
