package com.nikhil.league;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team> {
	
	private String name;
	private ArrayList<T> teams;
	
	public LeagueTable(String name) {
		this.name=name;
		this.teams=new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public boolean addTeam(T team) {
		if(teams.contains(team)) {
			System.out.println("Team already in league");
			return false;
		}
		teams.add(team);
		return true;
	}
	
	public void showLeagueTable() {
		Collections.sort(teams);
		System.out.println(this.getName());
		for(T t: teams) {
			System.out.println(t.getName()+"  W-"+t.getWin()+"  L-"+t.getLoss()+
					"  T-"+t.getTie()+" Points-"+t.points());
			
		}
	}

}
