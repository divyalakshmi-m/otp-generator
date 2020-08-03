import java.util.*;
class Otpgenerator {

   
    public static void main(String[] args) {
      String numbers = "1234567890";
      Random random = new Random();
      char[] otp = new char[4];

      for(int i = 0; i< 4 ; i++) {
         otp[i] = numbers.charAt(random.nextInt(numbers.length()));
      }
      System.out.println("The otp is:");
      System.out.println(otp);
        
    }
    
}
