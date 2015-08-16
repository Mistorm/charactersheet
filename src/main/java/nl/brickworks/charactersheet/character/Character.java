package nl.brickworks.charactersheet.character;

import java.util.ArrayList;
import java.util.List;

import nl.brickworks.charactersheet.characterclass.CharacterClass;
import nl.brickworks.charactersheet.race.Race;

public final class Character {

	public enum Gender {
		male, female, unspecified
	}

	private String name;
	private Gender gender = Gender.unspecified;
	private String god;

	// Base Attributes, not for external use. Use effective values instead
	private final Attribute strength;
	private final Attribute dexterity;
	private final Attribute constitution;
	private final Attribute inteligence;
	private final Attribute wisdom;
	private final Attribute charisma;

	private Race race;

	private final List<CharacterClass> classes = new ArrayList<CharacterClass>();

	/**
	 * A character will also need a race and a class besides attribute scores!
	 * These are not included in this constructor for readability
	 *
	 * @param strength
	 * @param dexterity
	 * @param constitution
	 * @param inteligence
	 * @param wisdom
	 * @param charisma
	 */
	public Character(final Integer strength, final Integer dexterity,
			final Integer constitution, final Integer inteligence,
			final Integer wisdom, final Integer charisma) {

		this.strength = new Attribute(strength);
		this.dexterity = new Attribute(dexterity);
		this.constitution = new Attribute(constitution);
		this.inteligence = new Attribute(inteligence);
		this.wisdom = new Attribute(wisdom);
		this.charisma = new Attribute(charisma);
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getGod() {
		return god;
	}

	public void setGod(final String god) {
		this.god = god;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(final Gender gender) {
		this.gender = gender;
	}

	public void setRace(final Race race) {
		this.race = race;
	}

	public Race getRace() {
		return race;
	}

	public List<CharacterClass> getClasses() {
		return classes;
	}

	public Attribute getStrength() {
		return strength;
	}

	public Attribute getDexterity() {
		return dexterity;
	}

	public Attribute getConstitution() {
		return constitution;
	}

	public Attribute getInteligence() {
		return inteligence;
	}

	public Attribute getWisdom() {
		return wisdom;
	}

	public Attribute getCharisma() {
		return charisma;
	}

	public void addClass(final CharacterClass characterClass)
			throws DuplicateClassException {

		// A character cannot have duplicate classes with the same name.
		for (final CharacterClass currentClass : classes) {
			// TODO: am not complete happy with this: think and improve
			if (currentClass.getName().equals(characterClass.getName())) {
				throw new DuplicateClassException();
			}
		}

		classes.add(characterClass);
	}

	public boolean hasClass(final String className) {
		for (final CharacterClass currentClass : classes) {
			if (currentClass.getName().equals(className)) {
				return true;
			}
		}

		// Class not found, return false
		return false;
	}

	public CharacterClass fetchClass(final String className)
			throws CharacterClasssNotFoundException {

		for (final CharacterClass currentClass : classes) {
			if (currentClass.getName().equals(className)) {
				return currentClass;
			}
		}

		// If the code hasn't returned by now, there was no class with the given
		// name found. Throw an exception.
		throw new CharacterClasssNotFoundException();
	}
}
