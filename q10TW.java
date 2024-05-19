public class q10TW {
      public static void main(String[] args) {
            Fahrenheit fahrenheit = new Fahrenheit();
            fahrenheit.setTempData(230);
            fahrenheit.changeTemp();
            System.out.println(fahrenheit.temp+" "+fahrenheit.ctemp);
            Celsius celsius = new Celsius();
            celsius.setTempData(100);
            celsius.changeTemp();
            System.out.println(celsius.temp+" "+celsius.ftemp);
      
      }
}

abstract class Temperature{
      public double temp;
      void setTempData(double t){
            temp = t;
      }
      abstract void changeTemp();
}

class Fahrenheit extends Temperature{
      public double ctemp;
      void changeTemp(){
            ctemp = (5/9) * ((float)temp-32);
      }
}
class Celsius extends Temperature{
      public double ftemp;
      public void changeTemp(){
            ftemp = (9/5) * temp+32;
      }
}
