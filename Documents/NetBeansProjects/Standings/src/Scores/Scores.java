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
        // Find current date
        
        String DATE_FORMAT = "yyyyMMdd";
        SimpleDateFormat sdf =
        new SimpleDateFormat(DATE_FORMAT);
        Calendar c1 = Calendar.getInstance(); // today
        
        
        
        
        // initiate main page to select sport
        new MainPage(sdf.format(c1.getTime())).setVisible(true);

        
        
        
    }
    
}
