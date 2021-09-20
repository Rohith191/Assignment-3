package commands;

import interfaces.*;

public class ListIngredientsCommand implements Command{
	private String _result;
	private String _flavour;
	
	public ListIngredientsCommand(String flavour) {
		_flavour = flavour;
	}
	@Override
	public void Execute(String state) {
		// TODO Auto-generated method stub
		_result = "Fetch "+_flavour+", milk, sugar, ice";
	}
	@Override
	public String getResult() {
		// TODO Auto-generated method stub
		return _result;
	}


}