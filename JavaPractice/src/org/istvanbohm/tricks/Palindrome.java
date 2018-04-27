package org.istvanbohm.tricks;

public class Palindrome
{
  public static void main(String[] args)
  {
    String input = "a mam amaam mm m mamaa";
    palindrome(input);
  }
  
  public static void palindrome(String input)
  {
    int size = input.length();
    String palindrome;
    for(int i=1;i<size-1;++i){
      // single char in the middle
      palindrome=""+input.charAt(i);
      for(int j=1;i+j<size && i-j>0;++j){
        char left = input.charAt(i-j);
        char right = input.charAt(i+j);
        if(left!=right) {
          break;
        }
        palindrome=left+palindrome+right;
        System.out.print("\""+palindrome+"\", ");
      }
      // two char in the middle
      if(input.charAt(i)==input.charAt(i+1)){
       palindrome=""+input.charAt(i)+input.charAt(i+1);
        for(int j=1;i+j+1<size && i-j>0;++j){
          char left = input.charAt(i-j);
          char right = input.charAt(i+j+1);
          if(left!=right) {
            break;
          }
          palindrome=left+palindrome+right;
          System.out.print("\""+palindrome+"\", ");
        }
      }
    }
  }
}
