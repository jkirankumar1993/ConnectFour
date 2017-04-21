package com.connect4.game;

public abstract class Player {

	private String name;
	private int color;

	public Player(String name, int color) {
            this.name = name;
            this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getColor() {
		return color;
	}
	
	public abstract String[] move(Game g);
}
