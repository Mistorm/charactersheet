package nl.brickworks.charactersheet.race;

public class AttributeBonus {

	// Remember: bonuses of the same type don't stack.. Or do they, in this case? The rule book isn't helping us.
	public enum Type {
		racial, enchantment, miscellaneousBonus, miscellaneousPenalty
	}

	private final Integer value;
	private final Type type;

	public AttributeBonus(final Integer value, final Type source) {
		this.value = value;
		this.type = source;
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
