package commands;

import interfaces.*;

public class ProcessIngredientsCommand implements Command {
	private String _result;
	private int _wait;
	public ProcessIngredientsCommand(int wait) {
		_wait = wait;
	}
	@Override
	public void Execute(String state) {
		_result = state+" mix them then wait "+ Integer.toString(_wait)+" minutes";
	}
	@Override
	public String getResult() {
		return _result;
	}

}
