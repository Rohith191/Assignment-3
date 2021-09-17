package iceCreams;

import core.*;
import interfaces.IceCream;

public class Vanilla extends IceCreamMaker implements IceCream  {
   @Override
   public void flavour() {
      System.out.println("Vanilla");
   }

	@Override
	public String makeIceCream() {
		return super.makeIceCream("VANILLA");
	}
}
