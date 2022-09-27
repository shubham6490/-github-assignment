public class NumbersSwap{
   public static void main(String[] args){
      int value_1 , value_2, my_temp;
      System.out.println("The required packages have been imported");
      value_1 = 45;
      value_2 = 70;
      System.out.println("----Before swap----");
      System.out.println("The first number is " + value_1 + " and the second number is " + value_2 );
      my_temp = value_1;
      value_1 = value_2;
      value_2 = my_temp;
      System.out.println("----After swap----");
      System.out.println("The first number is " + value_1 + " and the second number is " + value_2 );
   }
}
