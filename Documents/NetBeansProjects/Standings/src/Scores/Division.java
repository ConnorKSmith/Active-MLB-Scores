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

public class Division {

	
	private ArrayList<Team> teams;
	private String divisionName;
	
	public Division(String divisionName){
		this.divisionName = divisionName;
		teams = new ArrayList<Team>();
	}
	
	public void addTeam(Team t){
		teams.add(t);
	}
	
	
	
	
	
}
