package nl.brickworks.charactersheet.race;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import nl.brickworks.charactersheet.character.Character;
import nl.brickworks.charactersheet.character.CharacterVisitor;
import nl.brickworks.charactersheet.characterclass.AttributeName;
import nl.brickworks.charactersheet.race.AttributeBonus.Type;

public class Race implements CharacterVisitor {

	// These are the common player race sizes
	public enum Size {
		small, medium, large
	}

	private final String name;
	private final Size size;
	private final List<Speed> speeds = new ArrayList<Speed>();
	private final Map<AttributeName, AttributeBonus> AttributeBonuses = new HashMap<AttributeName, AttributeBonus>();

	/**
	 * Constructor
	 *
	 * @param name
	 * @param size
	 * @param speed
	 *            A race always has at least one mode of movement
	 */
	public Race(final String name, final Size size, final Speed speed) {
		this.name = name;
		this.size = size;

		this.speeds.add(speed);
	}

	public String getName() {
		return name;
	}

	public Size getSize() {
		return size;
	}

	/**
	 * Add the given integer value as bonus or penalty to the race. Will be
	 * applied to the Character object when visiting.
	 *
	 * @param attribute
	 * @param value
	 * @throws DuplicateAttributeBonusException
	 *             When adding an bonus for an AttributeName that has already
	 *             been added before
	 */
	public void addAttributeBonus(final AttributeName attribute,
			final Integer value) throws DuplicateAttributeBonusException {
		if (AttributeBonuses.containsKey(attribute)) {
			throw new DuplicateAttributeBonusException();
		} else {
			// All bonuses applied by a race are racial
			AttributeBonuses.put(attribute, new AttributeBonus(value,
					Type.racial));
		}
	}

	public void addSpeed(final Speed speed) throws DuplicateSpeedException {

		for (final Speed currentSpeed : speeds) {
			if (currentSpeed.differentMode(speed) == false) {
				throw new DuplicateSpeedException();
			}
		}

		speeds.add(speed);
	}

	@Override
	public void visit(final Character character) {
		final Set<Entry<AttributeName, AttributeBonus>> entrySet = AttributeBonuses
				.entrySet();
		for (final Entry<AttributeName, AttributeBonus> entry : entrySet) {
			character.addAttributeBonus(entry.getKey(), entry.getValue());
		}
	}

}
