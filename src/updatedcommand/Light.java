package updatedcommand;

//receiver
public class Light {
	
	private boolean isOn = false;
	
	public boolean isOn() {
		return isOn;
		
	}
	
	public void toggle() {
		if(isOn) {
			off();
			isOn = false;
		}
		else {
			on();
			isOn = true;
		}
	}
	
	public void on() {
		System.out.println("Light swtiched on.");
	}

	public void off() {
		System.out.println("Light Switched off.");
	}
	public void balance() {
		System.out.println("Light Switched on the balance.");
	}
	
}
