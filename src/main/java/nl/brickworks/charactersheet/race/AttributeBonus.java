package nl.brickworks.charactersheet.race;

public class AttributeBonus {

	// Remember: bonuses of the same type don't stack.. Or do they, in this case? The rule book isn't helping us.
	public enum Type {
		racial, template, enchantment, miscellaneousBonus, miscellaneousPenalty
	}

	private final Integer value;
	private final Type type;

	public AttributeBonus(final Integer value, final Type type) {
		this.value = value;
		this.type = type;
	}

	public Integer getValue() {
		return value;
	}

	public Type getType() {
		return type;
	}

	public boolean differenType(final AttributeBonus bonus) {
		if (this.type.equals(bonus.getType())) {
			return false;
		} else {
			return true;
		}
	}

}
