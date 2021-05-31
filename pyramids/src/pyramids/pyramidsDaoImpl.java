/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.HashMap;
import java.util.Map;

public class pyramidsDaoImpl implements pyramidsDAO{
    
    List<Pyramids> p;
    int counter =0;

   public pyramidsDaoImpl(){
      FileReader fr = null;
       try {
           p = new ArrayList<Pyramids>();
           // 1. open file for read
           fr = new FileReader("D:\\Ahmed Projects\\ITI\\java\\Materials\\day3\\pyramids.csv");
           BufferedReader br = new BufferedReader(fr);
           String line;
           String[] parts;
           Pyramids pclass;
           line = br.readLine();
           do {
                line = br.readLine();
                if (line != null) {
                    System.out.println(line);
                  
                    parts=line.split(",");
                    
                    
                    if(parts[7].isEmpty())
                    {parts[7]= "0";}
                    
                    
                    pclass = new Pyramids(parts[0],parts[1],parts[2],parts[4],Double.parseDouble(parts[7]));
                    p.add(pclass);
                    
                }
            } while (line != null);
            br.close();
            fr.close();
           
           
           
           
//      Student student1 = new Student("Robert",0);
//      Student student2 = new Student("John",1);
//      students.add(student1);
//      students.add(student2);		
       } catch (FileNotFoundException ex) {
           Logger.getLogger(pyramidsDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(pyramidsDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
       } finally {
       }
   }

    @Override
    public List<Pyramids> getAllPyramids() {
       return p;
    }

    @Override
    public List<Pyramids> sort_height() {
        List<Pyramids> ph;
        Collections.sort(p ,comparing(Pyramids::getHeight));
        return p;
    }

    @Override
    public void map() {
        HashMap<String,Integer> map = new HashMap<>();
for(Pyramids s: p)
{
    String key = s.getSite();
    System.out.println(key);
    if(map.get(key)==null)
    {
        map.put(key, 1);
    }
    else
        map.put(key,(map.get(key)+1));
    /*if (map.keySet().contains(key))
    {
        map.put(key,(map.get(key)+1));
    }
    else
        map.put(key, 1);*/
}

map.forEach((key,value) -> System.out.println(key + ":" + value));
    }

}
