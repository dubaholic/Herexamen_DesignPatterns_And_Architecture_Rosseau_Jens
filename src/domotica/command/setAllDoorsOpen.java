package domotica.command;

import java.util.List;

import domotica.model.ElectricityException;
import domotica.model.Room;

public class setAllDoorsOpen implements Command {

	List<Room> theRooms;
	
	public setAllDoorsOpen(List<Room> newRoom) {
			
			theRooms = newRoom;
		}
		
		@Override
		public void execute() throws ElectricityException {
			for(Room room : theRooms) {
				if(room.isDoorClosed() == true) {
					room.setDoorsClosed(!room.isDoorClosed());
				}
			}
		}
		
		@Override
		public void undo() {
			for(Room room : theRooms) {
				room.closeRoom();
			}
		}
	
	

}
