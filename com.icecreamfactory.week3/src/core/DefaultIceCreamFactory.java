package core;

import iceCreams.*;
import interfaces.*;

public class DefaultIceCreamFactory implements IceCreamFactory {
   public IceCream getIceCream(String IceCreamType){    
      if(IceCreamType.equalsIgnoreCase("VANILLA")){
         return new Vanilla();         
      }else if(IceCreamType.equalsIgnoreCase("CARAMEL")){
         return new Caramel();
      }	 
      return null;
   }
}