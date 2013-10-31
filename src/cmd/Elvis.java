package cmd;

//Enum singleton - the preferred approach
public enum Elvis {
	INSTANCE;

	public void leaveTheBuilding() {
		System.out.println("calling the instance");
	}

	public void show() {
		System.out.println("show");
	}
}