package commands;

import interfaces.*;

public class PackageIceCreamCommand implements Command {
	private String _result;
	private double _cost;
	public PackageIceCreamCommand(double cost) {
		_cost = cost;
	}
	@Override
	public void Execute(String state) {
		_result = state+". Pack in glass container, add sticker price & sell for $"+Double.toString(_cost);
	}
	@Override
	public String getResult() {
		return _result;
	}

}
