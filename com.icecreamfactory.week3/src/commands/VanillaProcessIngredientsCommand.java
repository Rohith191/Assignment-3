package commands;

import interfaces.*;

public class VanillaProcessIngredientsCommand implements ICommand {
	public Object State;
	
	@Override
	public void Execute(Object state) {
		String[] ingredients = (String[])state;
		String mixed = "mix ";
		for(int i = 0;i < ingredients.length;i++) {
			mixed = mixed + ingredients[i]+" and ";
		}
		State = mixed + "wait for 10 minutes";
	}
	@Override
	public Object getState() {
		return State;
	}

}
