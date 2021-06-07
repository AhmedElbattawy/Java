/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smilee;


import org.apache.commons.csv.CSVFormat;
import smile.data.DataFrame;
import smile.data.measure.NominalScale;



public class main {

    public static DataFrame readCSV(String path) {
    
CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader ();
DataFrame df = null;
//df = spark.read.format("csv").option("header", "true").load(path);
//df = Read.CSV(path,format);
df = readCSV(path);
System.out.println(df.summary ());
df = df.select ("Name", "Pclass", "Age", "Sex", "Survived");
System.out.println(df.summary ());
    DataFrame passengerDataFrame = df;
return df; 
}
    
public static int[] encodeCategory(DataFrame df, String columnName) {
String[] values = df.stringVector (columnName).distinct ().toArray (new String[]{});
int[] pclassValues = df.stringVector (columnName).factorize (new NominalScale (values)).toIntArray ();
return pclassValues;
}

public static void main(String [] args)
{
    DataFrame df = null;
   df =readCSV("D:\\Ahmed Projects\\ITI\\java\\Materials\\Day6\\titanic_csv.json");
}

}
