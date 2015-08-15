package nl.brickworks.charactersheet.characterclass;

public class CharacterClass {

	private String name;
	private Integer level;
	private Boolean prestige;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(final Integer level) {
		this.level = level;
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

			if (this.name.equals(otherClass.getName())
					&& (this.level == otherClass.level)) {
				return true;
			}
		}

		return false;
	}
}
