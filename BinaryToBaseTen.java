//name: Sara Russert
//date: 1/21/24
//file: BinaryToBaseTen.java

import javax.swing.JOptionPane;

public class BinaryToBaseTen {
   public static void main(String[] args) {
      
      // Declare all the variables needed by the program
      String inputString;
      int inputStringLength;
      boolean binaryStringIsValid = true;
      int baseTenVal = 0;
      byte expVal;
      
      do {
         if (!binaryStringIsValid)
            JOptionPane.showMessageDialog(null,"You entered invalid binary chars, try again");
         binaryStringIsValid = true;
         // Collect user input for the inputString
         inputString = JOptionPane.showInputDialog("Enter a binary number (with no spaces):  ");
         inputStringLength = inputString.length();
         // loop through binary number to check for invalid chars
         for (int i = 0; i < inputStringLength; i++) {
            char currentChar = inputString.charAt(i);
            if (currentChar != '0' && currentChar != '1') {
               System.out.println(currentChar + " is invalid");
               binaryStringIsValid = false;
            }
         }
      } while (!binaryStringIsValid);
      
      // number is now confirmed valid
      System.out.println("Binary: " + inputString);
      
      
      // max exp val
      expVal = (byte)(inputStringLength - 1);
      
      // loop through string to accumulate the value of each character
      for (int i = 0; i < inputStringLength; i++) {
         char currentChar = inputString.charAt(i);
         byte charValue = Byte.parseByte(Character.toString(currentChar));
         baseTenVal += charValue * (int)Math.pow(2, expVal--);                
      }
      
      // print base 10 conversion to user
      
      System.out.println("Is Base Ten: " + baseTenVal);
      System.exit(0);
       
   }
}