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
public class Team {

	private String teamName;
	private Long rank;
	private String win_pct;
        private boolean active;
	
	public Team(String fname, String lname, Long rank, String win_pct){
		teamName = fname + lname;
		this.rank = rank;
		this.win_pct = win_pct;
                active = false;
               
	}
	
	public String getName(){
		return teamName;
	}
	
	public Long getRank(){
		return rank;
	}
	
	public String getPct(){
		return win_pct;
	}
        
        public void setActive(){
            active = true;
        }
}
