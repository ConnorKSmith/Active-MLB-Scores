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
public class ActiveGame {
    
    private  String hscore;
    
    private  String ascore;
    
    private  String period;
    
    private  int gameID;
    
    private String aname;
    
    private String hname;
    
    public ActiveGame (int id, String hname, String hscore, String aname, String ascore, String period){
        this.hscore = hscore;
        this.ascore = ascore;
        this.period = period;
        this.hname = hname;
        this.aname = aname;
        gameID = id;
    }
       
    public String getHscore(){
        return hscore;
    }
    
    public String getAscore(){
        return ascore;
    }
    
    public String getPeriod(){
        return period;
    }
    
    public String getHname(){
        return hname;
    }
    
    public String getAname(){
        return aname;
    }
    
    
}
