/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scores;


/**
 *
 * @author Connor
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Parser {
    // Prepare URL to parse using user-selected sport and date in yyMMdd format
    public static void prepareToParse(String sport, String date)throws 
            MalformedURLException, IOException, org.json.simple.parser.ParseException, 
            ParserConfigurationException, SAXException{
        
        URL url;
        url = 
          new URL("http://scores.nbcsports.msnbc.com/ticker/data/gamesMSNBC.js.asp?jsonp=true&sport="
                  + sport + "&period=" + date);
        
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
    
    
    public static void parseLeague(String response) throws org.json.simple.parser.ParseException, ParserConfigurationException, SAXException, IOException
    {
            //Parse JSON response and create league matching sport
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(response);
            String sport = (String) obj.get("sport");
            
            League league = new League(sport);
            
            // Each game sent to parseGame as xml data
            JSONArray games = (JSONArray) obj.get("games");
            for (int x = 0; x < games.size(); x++){
                String xml = (String) games.get(x);
                parseGame(xml, league, x);
            }
           
            
            //Display active games
            league.displayActiveGames();
            
  
    }	
    
    public static void parseGame(String game, League league, int ID) throws SAXException, IOException, ParserConfigurationException{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new InputSource(new StringReader(game)));
            
            
            // grab visiting team info
            NodeList nodeList = document.getElementsByTagName("visiting-team");
            String aname = "";
            String ascore = "";
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                aname = node.getAttributes().getNamedItem("display_name").getNodeValue() + " " +
                        node.getAttributes().getNamedItem("nickname").getNodeValue();
                    
                ascore = node.getAttributes().getNamedItem("score").getNodeValue();
                

            }
            // grab home team info
            NodeList nodeList1 = document.getElementsByTagName("home-team");
            String hname = "";
            String hscore = "";
            
            for (int i = 0; i < nodeList1.getLength(); i++) {
                Node node1 = nodeList1.item(i);
                hname = node1.getAttributes().getNamedItem("display_name").getNodeValue() + " " +
                        node1.getAttributes().getNamedItem("nickname").getNodeValue();
                hscore = node1.getAttributes().getNamedItem("score").getNodeValue();
                
            }
            // Grab game-state 
            NodeList gamestate = document.getElementsByTagName("gamestate");
            String period = "";
            
            
            Node node1 = gamestate.item(0);
            period = node1.getAttributes().getNamedItem("display_status2").getNodeValue();
                
            
            // Select only active games
            if (!node1.getAttributes().getNamedItem("status").getNodeValue().equals("Final")
                    && !node1.getAttributes().getNamedItem("status").getNodeValue().equals("Pre-Game")){
                if (node1.getAttributes().getNamedItem("status").getNodeValue().equals("Delayed")){
                    league.addActiveGame(
                        new ActiveGame(
                           ID,
                           hname,
                           hscore,
                           aname,
                           ascore,
                           "Delayed"     
                        )
                    );
                    return;
                }
                
                 league.addActiveGame(
                   new ActiveGame(
                           ID,
                           hname,
                           hscore,
                           aname,
                           ascore,
                           period     
                   )
                 );
            }
            
    }
    
}
    
