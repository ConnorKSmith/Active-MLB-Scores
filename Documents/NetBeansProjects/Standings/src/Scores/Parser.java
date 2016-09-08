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

import java.io.IOException;
import java.io.StringReader;
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
    public static void parseLeague(String response, League league) throws org.json.simple.parser.ParseException, ParserConfigurationException, SAXException, IOException
    {
            //Parse JSON response 
            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(response);
            String sport = (String) obj.get("sport");
            
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
                if (node instanceof Element) {
                    aname = node.getAttributes().getNamedItem("display_name").getNodeValue() + " " +
                            node.getAttributes().getNamedItem("nickname").getNodeValue();
                    
                    ascore = node.getAttributes().getNamedItem("score").getNodeValue();
                }

            }
            // grab home team info
            NodeList nodeList1 = document.getElementsByTagName("home-team");
            String hname = "";
            String hscore = "";
            
            for (int i = 0; i < nodeList1.getLength(); i++) {
                Node node1 = nodeList1.item(i);
                if (node1 instanceof Element) {
                    hname = node1.getAttributes().getNamedItem("display_name").getNodeValue() + " " +
                            node1.getAttributes().getNamedItem("nickname").getNodeValue();
                    hscore = node1.getAttributes().getNamedItem("score").getNodeValue();
                }
            }
            // Grab game-state 
            NodeList gamestate = document.getElementsByTagName("gamestate");
            String period = "";
            
            
            Node node1 = gamestate.item(0);
            period = node1.getAttributes().getNamedItem("display_status2").getNodeValue();
                
            
            // Select only active games
            if (!node1.getAttributes().getNamedItem("status").getNodeValue().equals("Final")){
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
    
