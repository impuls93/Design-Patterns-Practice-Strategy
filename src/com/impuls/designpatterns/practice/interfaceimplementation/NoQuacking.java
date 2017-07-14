package com.impuls.designpatterns.practice.interfaceimplementation;

import com.impuls.designpatterns.practice.interfaces.QuackInterface;

public class NoQuacking implements QuackInterface{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("silent!");
	}

}
