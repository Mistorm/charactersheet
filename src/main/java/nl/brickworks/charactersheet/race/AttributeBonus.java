package nl.brickworks.charactersheet.race;

import nl.brickworks.charactersheet.character.Source;

public class AttributeBonus {

	// Remember: bonuses of the same type don't stack.. Or do they, in this case? The rule book isn't helping us.
	public enum Type {
		racial, template, enchantment, miscellaneousBonus, miscellaneousPenalty
	}

	private final Integer value;
	private final Type type;
	private final Source source;

	public AttributeBonus(final Integer value, final Type type, final Source source) {
		this.value = value;
		this.type = type;
		this.source =  source;
	}

	public Integer getValue() {
		return value;
	}

	public Type getType() {
		return type;
	}

	public Source getSource(){
		return source;
	}

	public boolean differenType(final AttributeBonus bonus) {
		if (this.type.equals(bonus.getType())) {
			return false;
		} else {
			return true;
		}
	}

}
