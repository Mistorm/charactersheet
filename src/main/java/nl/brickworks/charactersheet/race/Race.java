package nl.brickworks.charactersheet.race;

import java.util.ArrayList;
import java.util.List;

public class Race {

	// These are the common player race sizes
	public enum Size {
		small, medium, large
	}

	private final String name;
	private final Size size;
	private final List<Speed> speeds = new ArrayList<Speed>();

	/**
	 * Constructor
	 *
	 * @param name
	 * @param size
	 * @param speed
	 *            A race always has at least one mode of movement
	 */
	public Race(final String name, final Size size, final Speed speed) {
		this.name = name;
		this.size = size;

		this.speeds.add(speed);
	}

	public String getName() {
		return name;
	}

	public Size getSize() {
		return size;
	}

	public void addSpeed(final Speed speed) throws DuplicateSpeedException {

		for (final Speed currentSpeed : speeds) {
			if (currentSpeed.differentMode(speed) == false) {
				throw new DuplicateSpeedException();
			}
		}

		speeds.add(speed);
	}

}
