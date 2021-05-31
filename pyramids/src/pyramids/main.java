/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MedOo
 */
public class main {
   public static pyramidsDAO py = new pyramidsDaoImpl();
   
    public static void printPyramid(){
       
                  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

          int i=0;
      for (Pyramids ph: py.getAllPyramids())
      {
          System.out.println("#"+(i++)+"-"+ph);
      }
      }
    public static void printSorted(){
          
                  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

          int i=0;
      for (Pyramids ph: py.sort_height())
      {
          System.out.println("#"+(i++)+"-"+ph);
      }
      
      }
      

    public static void main(String[] args) {
       //Pyramids pclass;
      //py.getAllPyramids();
      printPyramid();
      printSorted();
   	py.map();
   }
}
