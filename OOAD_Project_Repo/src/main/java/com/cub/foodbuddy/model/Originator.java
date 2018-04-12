package com.cub.foodbuddy.model;

class Originator
{
	private String state;
	public void setState(String state)
	{
		this.state = state;
	}
	public Memento saveToMemento()
	{
		return new Memento(state);
	}
	public void restoreFromMemento(Memento m)
	{
		state = m.getSavedState();
	}
}
