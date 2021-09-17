package commands;

import interfaces.*;

public class CaramelListIngredientsCommand implements ICommand{
	public Object State;
	@Override
	public void Execute(Object state) {
		// TODO Auto-generated method stub
		State = new String[] {"caramel", "milk", "sugar", "ice"};
	}
	@Override
	public Object getState() {
		// TODO Auto-generated method stub
		return State;
	}


}