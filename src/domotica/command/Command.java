package domotica.command;

import domotica.model.ElectricityException;

public interface Command {

	public void execute() throws ElectricityException;
	
	public void undo();
}
