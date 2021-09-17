package commands;

import interfaces.*;

public class VanillaPackageIceCreamCommand implements ICommand {
	public Object State;
	@Override
	public void Execute(Object state) {
		String processedIngredients = (String)state;
		State = processedIngredients + " Pack in Plastic Container, Add Sticker Price & Sell for $25";
	}
	@Override
	public Object getState() {
		return State;
	}

}
