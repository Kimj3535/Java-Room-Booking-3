package cst8284.asgmt3.roomScheduler;
import cst8284.asgmt3.room.*;

public class RoomSchedulerLauncher {

	public static void main(String[] args) {
		Room room = new ComputerLab();
		room.setRoomNumber("B119");
		new RoomScheduler(room).launch();
	}
	
}
