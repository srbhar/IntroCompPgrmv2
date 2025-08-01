package surviveTheNight;

public class Player {
	
	private int power;
	private boolean leftDoorClosed;
	private boolean rightDoorClosed;
	
	public Player() {
		
	}
	
	public void useCamera() {
		
	}
	
	public void closeLeftDoor() {
		leftDoorClosed = true;
	}
	public void openLeftDoor() {
		leftDoorClosed = false;
	}
	public void closeRightDoor() {
		rightDoorClosed = true;
	}
	public void openRightDoor() {
		rightDoorClosed = false;
	}
	public void waitTurn() {
		
	}
	public boolean isLeftDoorClosed() {
		return leftDoorClosed;
	}
	public boolean isRightDoorClosed() {
		return rightDoorClosed;
	}
	public int getPower() {
		return power;
	}

}
