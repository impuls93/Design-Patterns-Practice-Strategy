package com.impuls.designpatterns.practice.classimplementation;

import com.impuls.designpatterns.practice.abstractclasses.Duck;
import com.impuls.designpatterns.practice.interfaceimplementation.Quack;
import com.impuls.designpatterns.practice.interfaceimplementation.NoFly;

public class DuckModel extends Duck{

	public DuckModel()
	{
		quackinterface = new Quack();
		flyinginterface = new NoFly();
	}
	
	
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("I'm duck model");
	}

	
	
	
}
