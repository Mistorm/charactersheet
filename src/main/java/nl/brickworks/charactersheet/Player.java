package nl.brickworks.charactersheet;

/**
 * The actual human owner/user of a character.
 */
public class Player {

	private String name;

	public Player(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}
}
