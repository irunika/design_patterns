package singleton;

/**
 * Created by irunika on 11/2/16.
 */
public class SingleObject {

    private static SingleObject singleObj = new SingleObject();
    private int value = 0;

    private SingleObject(){} // This makes the class avoid to create object using new method

    /**
     *
     * @return single instance all the time. Avoid creating new objects
     */
    public static SingleObject getInstance(){
        return singleObj;
    }

    /**
     * @return value
     */
    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

}
