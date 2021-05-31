
package pyramids;
import java.util.List;

public interface pyramidsDAO {
    public List<Pyramids> getAllPyramids();
    public List<Pyramids> sort_height();
    public void map();
    /*public Pyramids getPharoh_Name();
    public Pyramids getAncient_Name();
    public Pyramids getModerm_Name();
    public Pyramids get_Site();
    public Pyramids get_Height();

    public void setPharoh_Name(String name);
    public void setAncien_tName(String name);
    public void setModerm_Name(String name);
    public void set_Site(String name);
    public void set_Height(double height);*/
}
