package interface_implement;

interface Drawable{

    void draw();

}
class Rectangle implements Drawable{
public void draw()
{
    System.out.println("drawing Rectangler");
}

}

class Circle implements Drawable{
    public void draw()
{
    System.out.println("drawing Circle");
}

}


public class Interface_implement {
    
    public static void main(String[] args) {
        Circle d = new Circle();
        d.draw();
        Rectangle r = new Rectangle();
        r.draw();
        
        
    }
    
}
