package factory;

/**
 * Created by irunika on 11/2/16.
 * Creational Design Pattern
 * In Factory pattern, we create object without exposing the creation
 *  logic to the client and refer to newly created object using a common interface.
 */
public class ShapeFactory {
    public Shape getShape(String shape){
        if(shape == null) return null;

        else if(shape.equalsIgnoreCase("circle")){
            return new Circle();
        }
        else if(shape.equalsIgnoreCase("square")){
            return new Square();
        }
        else if(shape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }

        return null;
    }
}
