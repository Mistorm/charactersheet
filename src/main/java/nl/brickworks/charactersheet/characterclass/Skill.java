package nl.brickworks.charactersheet.characterclass;

public class Skill {

	// Name of the skill, must be unique
	private final String name;

	// An optional, short description
	private String description;

	// All skills have a governing ability score, the modifier value of the
	// ability score is added to the total
	private final AttributeName keyAblility;

	// Some races, classes or templates provided bonus to skills. List those
	// here.
	private int miscellaneousModifier;

	public Skill(final String name, final AttributeName keyAblility) {
		this.name = name;
		this.keyAblility = keyAblility;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public AttributeName getKeyAblility() {
		return keyAblility;
	}

	public int getMiscellaneousModifier() {
		return miscellaneousModifier;
	}

	public void setMiscellaneousModifier(final int miscellaneousModifier) {
		this.miscellaneousModifier = miscellaneousModifier;
	}

}
