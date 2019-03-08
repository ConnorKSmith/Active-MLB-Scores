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
import java.util.ArrayList;
public class League {

	
	private ArrayList<Division> divisions;
	private String leagueName;
        private ArrayList<ActiveGame> activeGames;
        
	
	public League(String leagueName){
		this.leagueName = leagueName;
		divisions = new ArrayList<Division>();
                activeGames = new ArrayList<ActiveGame>();
	}
	
	public void addDivision(Division d){
		divisions.add(d);
	}
	
	public Division getDivision(int index){
		return divisions.get(index);
	}
        
        public void addActiveGame(ActiveGame ag){
            activeGames.add(ag);
        }
        
        public void displayActiveGames(){
            new ActiveGamesDisplay(this, activeGames, 1).setVisible(true);
        }
        
        public String getName(){
            return leagueName;
        }
}
