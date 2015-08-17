package nl.brickworks.charactersheet.characterclass;

public class Skill {

	public enum KeyAbility {
		Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma
	}

	private KeyAbility keyAblility;
	private int miscellaneousModifier;

	public KeyAbility getKeyAblility() {
		return keyAblility;
	}

	public void setKeyAblility(final KeyAbility keyAblility) {
		this.keyAblility = keyAblility;
	}

	public int getMiscellaneousModifier() {
		return miscellaneousModifier;
	}

	public void setMiscellaneousModifier(final int miscellaneousModifier) {
		this.miscellaneousModifier = miscellaneousModifier;
	}

}
