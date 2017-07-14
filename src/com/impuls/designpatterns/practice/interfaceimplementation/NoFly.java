package com.impuls.designpatterns.practice.interfaceimplementation;

import com.impuls.designpatterns.practice.interfaces.FlyInterface;

public class NoFly implements FlyInterface{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Can't fly");
	}

}
