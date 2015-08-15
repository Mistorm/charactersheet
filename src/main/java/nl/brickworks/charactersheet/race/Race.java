package nl.brickworks.charactersheet.race;

import java.util.ArrayList;
import java.util.List;

public class Race {

	public enum Size {
		small, medium, large
	}

	private String name;
	private Size size;
	private final List<Speed> speeds = new ArrayList<Speed>();

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
