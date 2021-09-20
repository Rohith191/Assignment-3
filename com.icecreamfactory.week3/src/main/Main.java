package main;

import commands.*;
import iceCreams.*;
import interfaces.*;

public class Main {

	public static void main(String[] args) {
		
		IceCream v = new Vanilla();
		
		Command listIngredientsCommand = new ListIngredientsCommand(v.getFlavour());
		Command processIngredientsCommand = new ProcessIngredientsCommand(v.getWaitTime());
		Command packageIceCreamCommand = new PackageIceCreamCommand(v.getPrice());
		
		listIngredientsCommand.Execute(null);
		String ingredients = listIngredientsCommand.getResult();
		
		processIngredientsCommand.Execute(ingredients);
		String processed = processIngredientsCommand.getResult();
		
		packageIceCreamCommand.Execute(processed);
		String result = packageIceCreamCommand.getResult();
		
		System.out.println("Vanilla ice cream result: "+result);
	}

}
