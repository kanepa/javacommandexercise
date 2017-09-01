package updatedcommand;

import java.util.List;

public class AllLightsCommand implements Command {

	private List<Light> lights;
	
	public AllLightsCommand(List<Light> lights) {
		this.lights = lights;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for(Light light : lights ) {
			if(light.isOn()) {
				light.toggle();
		}

	}

	}
}
