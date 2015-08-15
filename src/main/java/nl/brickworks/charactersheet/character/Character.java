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

	private Race race = new Race();

	private final List<CharacterClass> classes = new ArrayList<CharacterClass>();

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
