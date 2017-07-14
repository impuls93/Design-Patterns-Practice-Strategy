package com.impuls.designpatterns.practice.classimplementation;

import com.impuls.designpatterns.practice.abstractclasses.Decoy;
import com.impuls.designpatterns.practice.interfaceimplementation.NoQuacking;

public class DecoyImp extends Decoy{

	public DecoyImp()
	{
		quackinterface = new NoQuacking();
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Implementing decoy...");
	}

}
