public class WrapperClasses {
      public static void main(String args[])
      {
            int num = 7;
            // Integer num1 = new Integer(8);
            //Integer num1 = 8
            // Integer num1 = new Integer(num);    //boxing
            Integer num1 = num;    //auto boxing

            // int num2 = num1.intValue();  //unboxing
            int num2 = num1;       //auto unoxing            

            System.out.println(num1);
            System.out.println(num2);
      }
}
