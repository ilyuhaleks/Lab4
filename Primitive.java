package work4;

public class Primitive implements GraphicObject {
    private  int x;

    private int y;


    public Primitive(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Метод draw з параметрами x="+x+"y="+y);
    }
}
