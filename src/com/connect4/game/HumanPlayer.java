package com.connect4.game;

import java.util.ArrayList;
import java.util.Arrays;

public class HumanPlayer extends Player {

	public HumanPlayer(String name, int color) {
		super(name, color);
	}

	@Override
	public String[] move(Game g) {
		// TODO Auto-generated method stub
		ArrayList<String> moves = new ArrayList<>();
		for(int i=0;i<6;i++){
			for(int j=0;j<7;j++){
				if(!g.grid[i][j].equals("[R]")){
					
					if(!g.grid[i][j].equals("[B]")){
						moves.add(g.grid[i][j]);
					}	
					
				}
			}
		}
		
		String[] moveList = moves.toArray(new String[moves.size()]);
/*		String[] validmoves = new String[moves.size()];
		for(int i=0;i<validmoves.length;i++){
			validmoves[i] = moves.get(i);
		}*/
		
		return moveList;
	}

	
	

	
   
}
