package com.connect4.game;

import java.util.Random;
import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		Game g = new Game();
		g.creategame();
		Scanner inp = new Scanner(System.in);
		System.out.println("Hello User....");
		System.out.println();
		System.out.println("Please Enter Your Name : ");
		String name = inp.next();
		System.out.println("Hello "+name+". Welcome to Connect Four...");
		System.out.println("pick your color:");
		System.out.println("1.Red 2.Black");
		System.out.println("Please enter 1 for red, 2 for black and any other key to quit the game...");
		try{
			Random ran = new Random();
			int choice = inp.nextInt();
			if(choice==1 || choice==2){
				if(choice==1){
					HumanPlayer human = new HumanPlayer(name, choice);
					ComputerPlayer computer = new ComputerPlayer("Jordan", 2);
					boolean gameover = false;
					int turn = 0;
					while(gameover==false){
						if(turn==0){
							System.out.println(name+ " It's your turn...");
							System.out.println("We are suggesting the valid moves...");
							String[] validmoves = human.move(g);
							if(validmoves.length==0){
								System.out.println("No more moves.... It's a tie.");
								break;
							}
							for(int i=0;i<validmoves.length;i++){
								System.out.print(validmoves[i]+" ");
							}
							System.out.println();
							System.out.println("Please enter a valid move... you do have to enter braces..(Sample input : [A1] )..");
							String move = inp.next();
							boolean validmove = g.move(move, human.getColor());
							if(validmove==true){
								g.printgrid();
								boolean checkinggame = g.checkgrid();
								if(checkinggame==true){
									System.out.println("You have won the game...");
									gameover = true;
								}
								else{
									turn = 1;
								}
							}
							else{
								System.out.println("Invalid Move game ...");
							}
						}
						else{
							System.out.println("Now it's our turn...");
							String[] validcomputermoves = computer.move(g);
							if(validcomputermoves.length==0){
								System.out.println("No more moves.... It's a tie.");
								break;
							}
							int index = ran.nextInt(validcomputermoves.length);
							boolean validmove = g.move(validcomputermoves[index], computer.getColor());
							if(validmove==true){
								g.printgrid();
								boolean checkinggame = g.checkgrid();
								if(checkinggame==true){
									System.out.println("We have won the game...");
									gameover = true;
								}
								else{
									turn = 0;
								}
							}
						}
					}
					
				}
				else{
					
					HumanPlayer human = new HumanPlayer(name, choice);
					ComputerPlayer computer = new ComputerPlayer("Jordan", 1);
					boolean gameover = false;
					int turn = 0;
					while(gameover==false){
						if(turn==0){
							System.out.println(name+ " It's your turn...");
							System.out.println("We are suggesting the valid moves...");
							String[] validmoves = human.move(g);
							if(validmoves.length==0){
								System.out.println("No more moves.... It's a tie.");
								break;
							}
							for(int i=0;i<validmoves.length;i++){
								System.out.print(validmoves[i]+" ");
							}
							System.out.println();
							System.out.println("Please enter a valid move... you do have to enter braces..(Sample input : [A1] )..");
							String move = inp.next();
							boolean validmove = g.move(move, human.getColor());
							if(validmove==true){
								g.printgrid();
								boolean checkinggame = g.checkgrid();
								if(checkinggame==true){
									System.out.println("You have won the game...");
									gameover = true;
								}
								else{
									turn = 1;
								}
							}
							else{
								System.out.println("Invalid Move game ...");
							}
						}
						else{
							System.out.println("Now it's our turn...");
							String[] validcomputermoves = computer.move(g);
							if(validcomputermoves.length==0){
								System.out.println("No more moves.... It's a tie.");
								break;
							}
							int index = ran.nextInt(validcomputermoves.length);
							boolean validmove = g.move(validcomputermoves[index], computer.getColor());
							if(validmove==true){
								g.printgrid();
								boolean checkinggame = g.checkgrid();
								if(checkinggame==true){
									System.out.println("We have won the game...");
									gameover = true;
								}
								else{
									turn = 0;
								}
							}
						}
					}
				}
				
				
				
			}
			else{
				System.out.println("Looks like you are not in a mood to play... Come Again.");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Looks like you are not in a mood to play... Come Again.");
		}
		
		
		
		
		inp.close();
	}
}
