public class Room {

	String room;
	String wall;
	String floorType;
	int window;
	
	/**
	 * Initiate the room characteristics
	 * @param room
	 * @param wall
	 * @param floorType
	 * @param window
	 * */
	public Room (String room, String wall, String floorType, int window) {
		this.room = room;
		this.wall=wall;
		this.floorType=floorType;
		this.window=window;	
	}
	public Room(String string, String string2, String string3, String string4) {
		
	}
	/**
	 * Change room name
	 * @param change the room name in String type
	 * */
	public void setRoom(String room){
		this.room=room;
	}
	/**
	 * Modified name
	 * @return 
	 * */
	public String getRoom() {
		return this.room;
	}
	
	/**
	 * Change wall color
	 * @param change wall color in String type
	 * */
	public void setWall(String wall){
		this.wall=wall;
	}
	/**
	 * Changed wall color
	 * @return
	 * */
	public String getWall() {
		return this.wall;
	}
	/**
	 * Change wall type of floor
	 * @param change type of floor in String type
	 * */
	public void setfloor(String floor){
		this.floorType=floor;
	}
	/**
	 * Changed type of floor
	 * @return
	 * */
	public String getFloor() {
		return this.floorType;
	}
	/**
	 * Set number of windows
	 * @param set number of windows in Int type
	 * */
	public void setWindow(int window){
		this.window=window;
	}
	/**
	 * Changed number of windows
	 * @return
	 * */
	public int getWindow(int i) {
		return this.window;
	}
	/**
	 * Returns room characteristics
	 * */
	public String toString(){
		return"Room name: "+this.room + "\n"+
		"Wall color: " + this.wall + "\n" +
		"Floor type:" + this.floorType+ "\n" +
		"Number of windows:" + this.window + "\n";
		}
}