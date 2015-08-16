package nl.brickworks.charactersheet.character;

import java.util.ArrayList;
import java.util.List;

import nl.brickworks.charactersheet.race.AttributeBonus;

public class Attribute {

	private final Integer value;
	private final List<AttributeBonus> bonuses = new ArrayList<AttributeBonus>();

	public Attribute(final Integer value) {
		this.value = value;
	}

	/**
	 * You might want getEffectiveValue(): this returns the attribute value with
	 * the different bonuses added.
	 *
	 * @return
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * Returns the computed attribute value
	 * @return
	 */
	public Integer getEffectiveValue() {
		Integer effectiveValue = value;
		for (final AttributeBonus currentBonus : bonuses) {
			effectiveValue += currentBonus.getValue();
		}

		return effectiveValue;
	}

	// TODO: Revisit this code: it doens't track bonuses of the same type from
	// different sources. We need that.
	public void addBonus(final AttributeBonus bonus) {

		for (AttributeBonus currentBonus : bonuses) {
			if (currentBonus.differenType(bonus) == false) {
				if (currentBonus.getValue() < bonus.getValue()) {
					currentBonus = bonus;
				}
				return;
			}
		}

		// If this code is reached, the type of bonus given isn't used for this
		// type argument yet and should be added
		bonuses.add(bonus);
	}
}
