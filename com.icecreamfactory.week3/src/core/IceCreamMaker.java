package core;

import interfaces.ICommand;

public class IceCreamMaker {
	public String makeIceCream(String flavor) {
		CommandFactory commandFactory = CommandFactory.getCommandFactory(flavor);
		
		ICommand listIngredients = commandFactory.getCommand("List");
		listIngredients.Execute(null);
		Object ingredients = listIngredients.getState();
		
		ICommand processIngredients = commandFactory.getCommand("Process");
		processIngredients.Execute(ingredients);
		Object processed = processIngredients.getState();
		
		ICommand packageIceCream = commandFactory.getCommand("Package");
		packageIceCream.Execute(processed);
		Object finalResult = packageIceCream.getState();
		
		return (String)finalResult;
	}
}
