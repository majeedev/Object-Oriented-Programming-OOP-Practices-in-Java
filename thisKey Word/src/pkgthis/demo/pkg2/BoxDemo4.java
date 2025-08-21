
package pkgthis.demo.pkg2;



class Box{
      double wigth ; 
      double height ;
      double depth ; 

     Box() {
        System.out.println("constructing Box using the defult constructor ");
        
       wigth= 10 ; 
       height = 10;
       depth = 10 ;
     
    }

   Box(double wigth, double height, double depth) {
        this.wigth = wigth;
        this.height = height;
        this.depth = depth;
    }

     
    double volume()
    {
    
    return wigth * height * depth ;
            
    }
        
        

}


public class BoxDemo4 {

    public static void main(String[] args) {
        Box mybox1 = new Box(10, 10, 10);
        Box mybox2 = new Box();
        double vol ;
        vol = mybox1.volume();
        System.out.println("Volume of box1  is " + vol);
        vol = mybox2.volume();
        System.out.println("Volume of box2 is " + vol);
        
        
        
        
    }
    
}
