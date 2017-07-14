package com.impuls.designpatterns.practice.duckstest;

import com.impuls.designpatterns.practice.abstractclasses.Duck;
import com.impuls.designpatterns.practice.abstractclasses.Decoy;
import com.impuls.designpatterns.practice.classimplementation.WildDuck;
import com.impuls.designpatterns.practice.classimplementation.DuckModel;
import com.impuls.designpatterns.practice.classimplementation.DecoyImp;
import com.impuls.designpatterns.practice.interfaceimplementation.FlyingCuzIHaveWings;
import com.impuls.designpatterns.practice.interfaceimplementation.DecoyQuack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duck duck1 = new WildDuck();
		duck1.doQuack();
		duck1.doFly();
		duck1.show();
		duck1.swim();
		System.out.println();
		Duck duckModel = new DuckModel();
		duckModel.doQuack();
		duckModel.doFly();
		duckModel.show();
		System.out.println("CHANGING DUCK SO IT CAN FLY");
		duckModel.setFlyInterface(new FlyingCuzIHaveWings());
		duckModel.doFly();
		System.out.println("Flying !!! Wooohoooo");
		System.out.println();
		System.out.println("DECOY!!!");
		Decoy wabik = new DecoyImp();
		wabik.doQuack();
		wabik.setQuackInterface(new DecoyQuack());
		System.out.println("Setting decoy: ");
		wabik.doQuack();
		
		
	}

}
