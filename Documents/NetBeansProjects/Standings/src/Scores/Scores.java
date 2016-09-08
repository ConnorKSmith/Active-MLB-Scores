/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scores;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Connor
 */
public class Scores {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException, org.json.simple.parser.ParseException, ParserConfigurationException, SAXException {
        // Find current date, add to URL to find current day scores
        URL url;
        String DATE_FORMAT = "yyyyMMdd";
        SimpleDateFormat sdf =
        new SimpleDateFormat(DATE_FORMAT);
        Calendar c1 = Calendar.getInstance(); // today
        url = new URL("http://scores.nbcsports.msnbc.com/ticker/data/gamesMSNBC.js.asp?jsonp=true&sport=MLB&period=" + sdf.format(c1.getTime()));
        String query = "";

        //make connection
        URLConnection urlc = url.openConnection();

        //use post mode
        urlc.setDoOutput(true);
        urlc.setAllowUserInteraction(false);

        //send query
        PrintStream ps = new PrintStream(urlc.getOutputStream());
        ps.print(query);
        ps.close();

        
        //get result
        BufferedReader br = new BufferedReader(new InputStreamReader(urlc
            .getInputStream()));
        String l = null;
        
        //Repair JSON data and skip first and last lines returned 
        String information = "{";
        int n = 0;
        while ((l=br.readLine())!=null) {
            if (n != 0){
                information = information + l;
            }
            n++;
            
        
        }
        information = information.substring(0, information.length() - 2);
        
        
        
        // Call parser to parse JSON data
        Parser.parseLeague(information);
        br.close();
    }
    
}
