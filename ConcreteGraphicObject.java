package work4;

public class ConcreteGraphicObject implements GraphicObject{
    private String key;

    public ConcreteGraphicObject(String key) {
        this.key = key;
    }

    @Override

    public void draw() {
        System.out.println("Drawing " + key);

    }
    public String toString(){
        return key;
    }
}
