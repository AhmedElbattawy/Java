/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

/**
 *
 * @author MedOo
 */
public class Pyramids {
private String pharoh_name;
private String ancient_name;
private String modern_name;
private String site;
private double height = 0;

Pyramids(String pharoh_name,String ancient_name,String modern_name, String site, double height){
      this.pharoh_name = pharoh_name;
      this.ancient_name = ancient_name;
      this.modern_name = modern_name;
      this.site = site;
      this.height = height;
   }

   public String getPharohName() {
       return pharoh_name;
   }

   public void setPharohName(String name) {
      this.pharoh_name = name;
   }
    public String getAncientName() {
      return ancient_name;
   }

   public void setAncientName(String name) {
      this.ancient_name = name;
   }
    public String getModernName() {
      return modern_name;
   }

   public void setModernName(String name) {
      this.modern_name = name;
   }
   public String getSite() {
      return site;
   }

   public void setSite(String site) {
      this.site = site;
   }
      
   public double getHeight() {
      return height;
   }

   public void setHeight(double number) {
      this.height = number;
   }

    @Override
    public String toString() {
        return  pharoh_name + "," + ancient_name + "," + modern_name + "," + site + "," + height ;
    }
   
}
