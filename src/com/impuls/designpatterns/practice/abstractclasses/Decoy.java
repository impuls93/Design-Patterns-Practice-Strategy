package com.impuls.designpatterns.practice.abstractclasses;

import com.impuls.designpatterns.practice.interfaces.QuackInterface;

public abstract class Decoy {

	protected QuackInterface quackinterface;
	
	public abstract void show(); 
	
	public void doQuack()
	{
		quackinterface.quack();
	}
	
	public void setQuackInterface(QuackInterface ki)
	{
		quackinterface = ki;
	}
}
