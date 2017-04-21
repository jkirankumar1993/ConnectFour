package com.connect4.game;

import java.util.ArrayList;

public class ComputerPlayer extends Player {

	public ComputerPlayer(String name, int color) {
		super(name, color);
	}

	@Override
	public String[] move(Game g) {
		// TODO Auto-generated method stub
		ArrayList<String> moves = new ArrayList<>();
		for(int i=0;i<6;i++){
			for(int j=0;j<7;j++){
				if(g.grid[i][j]!="[R]"||g.grid[i][j]!="[B]"){
					moves.add(g.grid[i][j]);
				}
			}
		}
		
		String[] moveList = moves.toArray(new String[moves.size()]);		
		return moveList;
	}


	

}
