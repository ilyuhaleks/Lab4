package work4;

public class Main {
    public static void main(String[] args) {
        GraphicObjectsFactory factory = new GraphicObjectsFactory();

        GraphicObject object1 = factory.getGraphicObject("Circle");
        GraphicObject object2 = factory.getGraphicObject("Square");
        GraphicObject object3 = factory.getGraphicObject("Triangle");

        GraphicObject object4 = factory.getGraphicObject("Circle");

        object1.draw();
        object2.draw();
        object3.draw();

        object4.draw(); //перевірка правильності кешу

        Primitive primitive1 = new Primitive(10, 20);
        Primitive primitive2 = new Primitive(5, 15);


        primitive1.draw();
        primitive2.draw();
    }

}
