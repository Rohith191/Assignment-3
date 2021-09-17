package interfaces;

public interface ICommand {
	Object getState();
	void Execute(Object state);
}
