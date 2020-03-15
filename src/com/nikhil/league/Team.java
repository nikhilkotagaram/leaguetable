package com.nikhil.league;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team <T>> {
	
	private String name;
	private int win=0;
	private int tie=0;
	private int loss=0;
	private int played=0;
	private ArrayList<T> players;
	
	public Team(String name) {
		this.name=name;
		this.players=new ArrayList<>();
	}
	
	public boolean addPlayer(T player) {
		if(players.contains(player)) {
			System.out.println("Player already in team");
			return false;
		}
		players.add(player);
		return true;
	}
	
	public int numPlayers() {
		return this.players.size();
	}
	public String getName() {
		return name;
	}
	public ArrayList<T> getPlayers() {
		return players;
	}
	public int getWin() {
		return win;
	}
	public int getTie() {
		return tie;
	}
	public int getLoss() {
		return loss;
	}
	public void game(Team<T> opponent,int ourscore,int oppscore) {
	if(opponent!=null) {
		this.played++;
		opponent.played++;
		if(ourscore>oppscore) {
			this.win++;
			opponent.loss++;
		}
		else if(ourscore<oppscore) {
			this.loss++;
			opponent.win++;
		}
		else if(ourscore==oppscore){
			this.tie++;
			opponent.tie++;
		}
	}
	return;
	}
	
	public int points() {
		return (win*2)+tie;
	}
	
	
	//here I'm sorting based on points obtained by a team and if both has same number
	//of points then I'm comparing their names using String compareTo() method.

	@Override
	public int compareTo(Team<T> team) {
		if(this.points()>team.points())
			return -1;
		else if(this.points()<team.points())
			return 1;
		else
			return this.getName().compareToIgnoreCase(team.getName());
	}
	
}
