package core;

import commands.*;
import interfaces.ICommand;

import java.util.HashMap;
public class CommandFactory {
	 	HashMap<String, ICommand> _commands = new HashMap<>(); 
	 	
	    public void Register(String commandName, ICommand command)
	    {
	    	_commands.put(commandName, command); 
	    }

	    public ICommand getCommand(String commandName)
	    {
	        return _commands.get(commandName);
	    }
	    
	    public static CommandFactory getCommandFactory(String flavour) {
	    	if(flavour == "VANILLA") {
	    		CommandFactory vcf = new CommandFactory();
	    		vcf.Register("List", new VanillaListIngredientsCommand());
	    		vcf.Register("Process", new VanillaProcessIngredientsCommand());
	    		vcf.Register("Package", new VanillaPackageIceCreamCommand());
	    		return vcf;
	    	} else if(flavour == "CARAMEL") {
	    		CommandFactory ccf = new CommandFactory();
	    		ccf.Register("List", new CaramelListIngredientsCommand());
	    		ccf.Register("Process", new CaramelProcessIngredientsCommand());
	    		ccf.Register("Package", new CaramelPackageIceCreamCommand());
	    		return ccf;
	    	} else
	    		return null;
	    }
}
