package commands;

import interfaces.*;

public class CaramelPackageIceCreamCommand implements ICommand {
	public Object State;
	@Override
	public void Execute(Object state) {
		String processedIngredients = (String)state;
		State = processedIngredients + " Pack in Glass Container, Add Sticker Price & Sell for $55";
	}
	@Override
	public Object getState() {
		return State;
	}

}
