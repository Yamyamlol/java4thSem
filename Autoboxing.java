public class Autoboxing {
      
      public static void main(String[] args) {
            
            int num = 8;
            
            System.out.println("num: "+num);     
            
            Integer num1 = num; // auto boxing

            System.out.println("num1: "+num1);

            int num2 = num1; // auto unboxing
            
            System.out.println("num2: "+num2);
      }

}
