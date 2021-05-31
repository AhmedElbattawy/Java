/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
/**
 *
 * @author MedOo
 */
public class Utility {

   public static String betterString1(String  n1, String n2, BiPredicate<String, String> p) {
       if( p.test(n1,n2))
               return n1;
       else 
           return n2;
}
  
   public static void main(String[] args) {
      String string1 = new String("hello");
           String string2 = new String("welcome");

       
String longer = Utility.betterString1(string1, string2, (n1, n2) -> n1.length() > n2.length()); 
String first = Utility.betterString1(string1, string2, (n1, n2) -> true);
System.out.println(longer);

   }
}