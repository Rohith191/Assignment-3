package iceCreams;

import core.IceCreamMaker;
import interfaces.IceCream;

public class Caramel extends IceCreamMaker implements IceCream  {
	   @Override
	   public void flavour() {
	      System.out.println("Caramel");
	   }

		@Override
		public String makeIceCream() {
			return super.makeIceCream("CARAMEL");
		}
	}
