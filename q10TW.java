/* 
      NAME: SANYAM RAWAT
      SECTION: D
      ROLL NO: 58
*/


public class q10TW {
      public static void main(String[] args) {
            System.out.println("\t\t\t******OUTPUT******");
            Fahrenheit fahrenheit = new Fahrenheit();
            fahrenheit.setTempData(230);
            fahrenheit.changeTemp();
            System.out.println("Fahrenheit temperatue: "+fahrenheit.temp+" "+"Celsius Temperature: "+fahrenheit.ctemp);
            Celsius celsius = new Celsius();
            celsius.setTempData(100);
            celsius.changeTemp();
            System.out.println("Celsius temperatue: "+celsius.temp+" "+"Fahrenheit Temperature: "+celsius.ftemp);
      
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
            ctemp = (5.0/9.0) * ((float)temp-32);
      }
}
class Celsius extends Temperature{
      public double ftemp;
      public void changeTemp(){
            ftemp = (9.0/5.0) * temp+32;
      }
}
