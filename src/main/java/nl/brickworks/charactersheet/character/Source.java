package nl.brickworks.charactersheet.character;

/**
 * Many bonuses and penalties in D&D have an origin that is relevant: Things
 * might be temporary or might have to be undone
 */
public abstract class Source {

	@Override
	public boolean equals(final Object object) {
		// Can this be done?
		if (object.getClass() == this.getClass()) {
			return true;
		}
		return false;
	}

}
