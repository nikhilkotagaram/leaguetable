package com.nikhil.league;

public class LeagueMain {

	public static void main(String[] args) {
		LeagueTable footballLeague=new LeagueTable("Football League");
		
		Team<FootballPlayer> manutd=new Team<>("ManchesterUnited");
		Team<FootballPlayer> mancity=new Team<>("ManchesterCity");
		Team<FootballPlayer> chelsea=new Team<>("Chelsea");
		Team<FootballPlayer> lp=new Team<>("Liverpool");
		Team<FootballPlayer> lei=new Team<>("Leicester");
		Team<FootballPlayer> ars=new Team<>("Arsenal");
		
		FootballPlayer a=new FootballPlayer("a");
		FootballPlayer b=new FootballPlayer("b");
		FootballPlayer c=new FootballPlayer("c");
		FootballPlayer d=new FootballPlayer("d");
		FootballPlayer e=new FootballPlayer("e");
		FootballPlayer f=new FootballPlayer("f");
		FootballPlayer g=new FootballPlayer("g");
		FootballPlayer h=new FootballPlayer("h");
		FootballPlayer i=new FootballPlayer("i");
		FootballPlayer j=new FootballPlayer("j");
		FootballPlayer k=new FootballPlayer("k");
		
		manutd.addPlayer(a);
		manutd.addPlayer(i);
		mancity.addPlayer(b);
		mancity.addPlayer(j);
		mancity.addPlayer(k);
		chelsea.addPlayer(c);
		chelsea.addPlayer(d);
		lp.addPlayer(d);
		lei.addPlayer(e);
		lei.addPlayer(f);
		ars.addPlayer(g);
		ars.addPlayer(h);
		
		footballLeague.addTeam(manutd);
		footballLeague.addTeam(mancity);
		footballLeague.addTeam(lp);
		footballLeague.addTeam(lei);
		footballLeague.addTeam(chelsea);
		footballLeague.addTeam(ars);
		
		manutd.game(mancity, 2, 3);
		manutd.game(lp, 2, 2);
		manutd.game(ars, 2, 0);
		manutd.game(lp, 4, 1);
		mancity.game(lp, 2, 3);
		mancity.game(lei, 5, 1);
		mancity.game(chelsea, 4, 4);
		chelsea.game(lp, 2, 1);
		chelsea.game(ars, 2, 3);
		chelsea.game(manutd,4,1);
		manutd.game(mancity, 2, 3);
		ars.game(lei, 2, 5);
		ars.game(manutd, 1, 0);
		lei.game(manutd, 2, 2);

		
		footballLeague.showLeagueTable();

	}

}
