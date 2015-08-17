package nl.brickworks.charactersheet.characterclass;

public class CharacterClass {

	private String name;
	private Boolean prestige;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Boolean getPrestige() {
		return prestige;
	}

	public void setPrestige(final Boolean prestige) {
		this.prestige = prestige;
	}

	@Override
	public boolean equals(final Object object) {

		if (object instanceof CharacterClass) {
			final CharacterClass otherClass = (CharacterClass) object;

			// TODO: This is too simple. Expand when possible.
			if (this.name.equals(otherClass.getName())) {
				return true;
			}
		}

		return false;
	}
}
