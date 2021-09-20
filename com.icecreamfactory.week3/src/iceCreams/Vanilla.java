package iceCreams;

import interfaces.IceCream;

public class Vanilla implements IceCream {
	
	
	@Override
	public String getFlavour() {
		// TODO Auto-generated method stub
		return "Vanilla";
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return 55d;
	}

	@Override
	public Integer getWaitTime() {
		// TODO Auto-generated method stub
		return 20;
	}
}
