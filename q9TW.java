/* 
      NAME: SANYAM RAWAT
      SECTION: D
      ROLL NO: 58
*/


public class q9TW {
    public static void main(String[] args) {
            Area a = new Area();
            System.out.println("\t\t\t******OUTPUT******");
            a.rectangleArea(10, 2);
            a.circleArea(10);
            a.squareArea(5);
      }
  }
  
  abstract class Shape {
      public abstract void rectangleArea(int l, int b);
      public abstract void circleArea(int r);
      public abstract void squareArea(int s);
    }
    
    class Area extends Shape {
        @Override
      public void rectangleArea(int l, int b) {
          System.out.println("Area of rectangle is " + (l * b));
        }
        
      @Override
      public void circleArea(int r) {
          System.out.println("Area of circle is " + (Math.PI * r * r));
      }
  
      @Override
      public void squareArea(int s) {
          System.out.println("Area of Square is " + (s * s));
      }
  }
  