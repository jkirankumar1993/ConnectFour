package com.connect4.game;

public class Game {

	public String[][] grid;
	char[] dictionary = "ABCDEFG".toCharArray();
	public void creategame(){
		
		grid = new String[6][7];
		for(int i=0;i<6;i++){
			for(int j=0;j<7;j++){
				String a = "";
				a+=dictionary[i];
				int b = j+1;
				a+=b;
				grid[i][j] = "["+a+"]";
			}
	
		}
	}
	
	public void printgrid(){
		System.out.println();
		for(int i=0;i<6;i++){			
			for(int j=0;j<7;j++){
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public boolean move(String a,int color){
		boolean has = false;;
	First:	for(int i=0;i<6;i++){			
			for(int j=0;j<7;j++){
				if(grid[i][j].equals(a)){
					if(color==1){
						has = true;
						grid[i][j] = "[R]";
						break First;
					}
					else{
						has = true;
						grid[i][j] = "[B]";
						break First;
					}					
				}
			}
		}
		return has;
	}
	
	public boolean checkgrid(){
		boolean has = false;
		
	outer:	for(int i=0;i<6;i++){
			for(int j=0;j<7;j++){
				try{
					if(grid[i][j].equals(grid[i][j+1]) && grid[i][j].equals(grid[i][j+2]) && grid[i][j].equals(grid[i][j+3])){
						has = true;
						break outer;
					}
					else if(grid[i][j].equals(grid[i+1][j]) && grid[i][j].equals(grid[i+2][j]) && grid[i][j].equals(grid[i+3][j])){
						has = true;
						break outer;
					}
					else if(grid[i][j].equals(grid[i+1][j+1]) && grid[i][j].equals(grid[i+2][j+2]) && grid[i][j].equals(grid[i+3][j+3])){
						has = true;
						break outer;
					}
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		return has;
	}
	
	
	
	
}
