package entry;

import core.*;
import interfaces.*;

public class Entry {

	public static void main(String[] args) {
		IceCreamFactory factory = new DefaultIceCreamFactory();
		
		IceCream vanilla = factory.getIceCream("VANILLA");
		String vanillaIceCream = vanilla.makeIceCream();
		System.out.println("Result of Vanilla IceCream: "+vanillaIceCream);
		
		IceCream caramel = factory.getIceCream("CARAMEL");
		String caramelIceCream = caramel.makeIceCream();
		System.out.println("Result of Caramel IceCream: "+caramelIceCream);
	}

}
