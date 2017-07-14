package com.impuls.designpatterns.practice.abstractclasses;

import com.impuls.designpatterns.practice.interfaces.QuackInterface;
import com.impuls.designpatterns.practice.interfaces.FlyInterface;

public abstract class Duck {
	
	protected QuackInterface quackinterface;
	protected FlyInterface flyinginterface;
	
	public void doFly()
	{
		flyinginterface.fly();
	}
	public void doQuack()
	{
		quackinterface.quack();
	}
	
	public abstract void show();
	
	public void swim()
	{
		System.out.println("Every duck swim...");
	}
	
	public void setFlyInterface(FlyInterface li)
	{
		flyinginterface = li;
	}
	public void setQuackInterface(QuackInterface ki)
	{
		quackinterface = ki;
	}
	
}
