public class Circle extends Shape {
  
    double radi;
    Circle(double radi){
        this.radi = radi;
    }
    @Override
      
    double area(){
        return Math.PI * radi *radi;
    }
}
