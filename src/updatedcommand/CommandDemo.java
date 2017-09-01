package updatedcommand;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {

	public static void main(String[] args) {
		
		Light light = new Light();
		Light bedroomLight = new Light();
		Light kitchenLight = new Light();
		Switch lightSwitch = new Switch();
		
		Command toggleCommand = new ToggleCommand(light);
		
		lightSwitch.storeAndExecute(toggleCommand);
		lightSwitch.storeAndExecute(toggleCommand);
		lightSwitch.storeAndExecute(toggleCommand);

		List<Light> lights = new ArrayList<>();
		lights.add(kitchenLight);
		lights.add(bedroomLight);
		Command allLightsCommand = new AllLightsCommand(lights);
		
		lightSwitch.storeAndExecute(allLightsCommand);
		
	}

}
