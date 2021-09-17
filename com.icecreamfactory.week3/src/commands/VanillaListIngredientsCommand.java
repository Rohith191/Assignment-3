package commands;

import interfaces.*;

public class VanillaListIngredientsCommand implements ICommand{
	public Object State;
	
	
	@Override
	public void Execute(Object state) {
		State = new String[] {"vanilla", "milk", "sugar", "ice"};
	}


	@Override
	public Object getState() {
		return State;
	}

}
