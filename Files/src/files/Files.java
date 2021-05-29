/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package files;
import java.io.BufferedWriter;
import java.io.BufferedReader;

import java.io.FileWriter;
import java.io.FileReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/**
 *
 * @author MedOo
 */
public class Files {

public static void main(String[] args)throws IOException {
        
String key = "";
InputStreamReader r = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(r);
FileWriter file = new FileWriter("D:\\Ahmed Projects\\ITI\\java\\Files\\test.txt");
BufferedReader read = new BufferedReader(new FileReader("D:\\Ahmed Projects\\ITI\\java\\Files\\test.txt"));
while(!key.equals("stop")) {
    System.out.println("enter data till stop word");
    key = br.readLine();
    System.out.println("You entered " + key);
    file.write(key + "\n");
    
}
 file.close();
 String line = "";
 System.out.println("The whole data you entered is:");
 do{
line = read.readLine();
if(line != null)
{
    System.out.println(line);
}
 }while(line !=null);
}
    }
    

