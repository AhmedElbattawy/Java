/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//import javafx.scene.chart.PieChart;
//import javafx.scene.chart.*;
//import org.knowm.xchart.CategoryChart;
//import org.knowm.xchart.CategoryChartBuilder;
//import org.knowm.xchart.SwingWrapper;
//import org.knowm.xchart.style.Styler;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;


public class main {
    //read data from json file 
    public static List<Chart> getPassengersFromJsonFile() throws FileNotFoundException, IOException{
List<Chart> allPassengers = new ArrayList<Chart> ();
ObjectMapper objectMapper = new ObjectMapper ();
objectMapper.configure (DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
InputStream input = new FileInputStream ("D:\\Ahmed Projects\\ITI\\java\\Materials\\Day6\\titanic_csv.json");
//Read JSON file
allPassengers = objectMapper.readValue (input, new TypeReference<List<Chart>> () { });
return allPassengers;
}
    //take ages and names in new lists
    public static void graphPassengerAges(List<Chart> passengerList) {
//filter to get an array of passenger ages
List<Float> pAges = passengerList.stream ().map (Chart::getAge).limit (8).collect (Collectors.toList ());
List<String> pNames = passengerList.stream ().map (Chart::getName).limit (8).collect (Collectors.toList ());

CategoryChart chart = new CategoryChartBuilder ().width (1024).height (768).title ("Age Histogram").xAxisTitle ("Names").yAxisTitle
("Age").build ();
// 2.Customize Chart
chart.getStyler ().setLegendPosition (Styler.LegendPosition.InsideNW);
chart.getStyler ().setHasAnnotations (true);
chart.getStyler ().setStacked (true);
// 3.Series
chart.addSeries ("Passenger's Ages", pNames, pAges);
// 4.Show it
new SwingWrapper (chart).displayChart ();
    }
    
    
public  void graphPassengerClass(List<Chart> passengerList) {
//filter to get a map of passenger class and total number of passengers in each class
Map<String, Long> result =
passengerList.stream ().collect (
Collectors.groupingBy (Chart::getPclass, Collectors.counting () ) );

// Create Chart
PieChart chart = new PieChartBuilder().width (800).height (600).title (getClass ().getSimpleName ()).build ();
// Customize Chart
Color[] sliceColors = new Color[]{new Color (180, 68, 50), new Color (130, 105, 120), new Color (80, 143, 160)};
chart.getStyler ().setSeriesColors (sliceColors);
// Series
chart.addSeries ("First Class", result.get ("1"));
chart.addSeries ("Second Class", result.get ("2"));
chart.addSeries ("Third Class", result.get ("3"));
// Show it
new SwingWrapper (chart).displayChart ();

}

public   void graphServived(List<Chart> passengerList) {
//filter to get a map of passenger class and total number of passengers in each class
Map<String, Long> result =
passengerList.stream ().collect (
Collectors.groupingBy (Chart::getSurvived, Collectors.counting () ) );

// Create Chart
PieChart chart = new PieChartBuilder().width (800).height (600).title (getClass ().getSimpleName ()).build ();
// Customize Chart
Color[] sliceColors = new Color[]{new Color (180, 68, 50), new Color (130, 105, 120)};
chart.getStyler ().setSeriesColors (sliceColors);
// Series
chart.addSeries ("not_servived", result.get ("0"));
chart.addSeries ("servived", result.get ("1"));
// Show it
new SwingWrapper (chart).displayChart ();

}

public void graphServivedGender(List<Chart> passengerList) {
//filter to get a map of passenger class and total number of passengers in each class
Map<String, Long> result =
passengerList.stream ().filter(b->b.getSurvived().equals("1")).collect (
Collectors.groupingBy (Chart::getSex, Collectors.counting () ) );

// Create Chart

    PieChart    chart = new PieChartBuilder().width (800).height (600).title (getClass ().getSimpleName ()).build ();
// Customize Chart
Color[] sliceColors = new Color[]{new Color (180, 68, 50), new Color (130, 105, 120)};
chart.getStyler ().setSeriesColors (sliceColors);
// Series
chart.addSeries ("female", result.get ("female"));
chart.addSeries ("male", result.get ("male"));
// Show it
new SwingWrapper (chart).displayChart ();

}
public static void main(String[] args) throws IOException {

List<Chart> allPassengers;
allPassengers = getPassengersFromJsonFile();
    //System.err.println(allPassengers);
    graphPassengerAges(allPassengers);
    //graphServivedGender(allPassengers);
    main x = new main();
    x.graphServived(allPassengers);
    x.graphServivedGender(allPassengers);
}
}


