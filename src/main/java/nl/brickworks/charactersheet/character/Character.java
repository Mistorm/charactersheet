package nl.brickworks.charactersheet.character;

import java.util.List;

import nl.brickworks.charactersheet.Player;
import nl.brickworks.charactersheet.race.Race;

public final class Character {

	public enum Gender {
		male, female, unspecified
	}

	public enum Alingment {
		LawfullGood, NeutralGood, ChaoticGood, LawfullNeutral, TrueNeutral, ChaoticNeutral, LawfullEvil, NeutralEvil, ChaoticEvil
	}

	private Player player;

	// Most if not all of these values are pure flavor.
	private String name;
	private Gender gender = Gender.unspecified;
	private String deity;
	private String height;
	private String weight;
	private String looks;

	// Not pure flavor but not that important rule-wise: languages
	private List<String> languages;

	// Base Attributes, not for external use. Use effective values instead
	private final Attribute strength;
	private final Attribute dexterity;
	private final Attribute constitution;
	private final Attribute inteligence;
	private final Attribute wisdom;
	private final Attribute charisma;

	private Race race;

	private LevelController levelController;

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

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(final Player player) {
		this.player = player;
	}

	public String getDeity() {
		return deity;
	}

	public void setDeity(final String deity) {
		this.deity = deity;
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

	public String getHeight() {
		return height;
	}

	public void setHeight(final String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(final String weight) {
		this.weight = weight;
	}

	public String getLooks() {
		return looks;
	}

	public void setLooks(final String looks) {
		this.looks = looks;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(final List<String> languages) {
		this.languages = languages;
	}

	public int getMaxHitpoints() {
		return levelController.aggregateHitpoints();
	}
}
