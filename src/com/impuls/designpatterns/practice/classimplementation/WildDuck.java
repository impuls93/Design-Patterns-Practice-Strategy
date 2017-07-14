package com.impuls.designpatterns.practice.classimplementation;

import com.impuls.designpatterns.practice.abstractclasses.Duck;
import com.impuls.designpatterns.practice.interfaceimplementation.Quack;
import com.impuls.designpatterns.practice.interfaceimplementation.FlyingCuzIHaveWings;

public class WildDuck extends Duck{

	
	public WildDuck()
	{
		quackinterface = new Quack();
		flyinginterface = new FlyingCuzIHaveWings();
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("I'm wild duck");
	}

}
