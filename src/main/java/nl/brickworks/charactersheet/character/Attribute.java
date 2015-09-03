package nl.brickworks.charactersheet.character;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.brickworks.charactersheet.race.AttributeBonus;
import nl.brickworks.charactersheet.race.AttributeBonus.Type;

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
	 * Returns the computed attribute value, it recomputes the value in case any
	 * value is changed.
	 *
	 * @return
	 */
	public Integer getEffectiveValue() {
		Integer effectiveValue = value;

		final Map<Type, Integer> MaxBonusPerType = new HashMap<Type, Integer>();

		for (final AttributeBonus currentBonus : bonuses) {

			if (MaxBonusPerType.containsKey(currentBonus.getType())) {

				if (MaxBonusPerType.get(currentBonus.getType()) < currentBonus
						.getValue()) {
					MaxBonusPerType.put(currentBonus.getType(),
							currentBonus.getValue());
				}
			} else {
				MaxBonusPerType.put(currentBonus.getType(),
						currentBonus.getValue());
			}

			for (final Integer value : MaxBonusPerType.values()) {
				effectiveValue += value;
			}
		}

		return effectiveValue;
	}

	/**
	 * Add the given bonus to this attribute value
	 *
	 * @param bonus
	 */
	public void addBonus(final AttributeBonus bonus) {
		bonuses.add(bonus);
	}

	/**
	 * Remove the given bonus from this attribute value, return true if the
	 * bonus is removed, false if nothing changed.
	 *
	 * @param bonus
	 * @return
	 */
	public boolean removeBonus(final AttributeBonus bonus) {
		if (bonuses.contains(bonus)) {
			bonuses.remove(bonus);
			return true;
		}

		return false;
	}
}
