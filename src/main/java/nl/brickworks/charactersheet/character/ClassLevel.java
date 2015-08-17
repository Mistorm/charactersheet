package nl.brickworks.charactersheet.character;

import java.util.List;

import nl.brickworks.charactersheet.characterclass.CharacterClass;
import nl.brickworks.charactersheet.characterclass.Rank;

public class ClassLevel extends Level implements HitpointProvider {

	private final CharacterClass characterClass;

	private Integer hitpointIncrease;

	private Integer baseAttackBonusIncrease;
	private Integer fortituteSavingThrowIncrease;
	private Integer reflexSavingThrowIncrease;
	private Integer willSavingThrowIncrease;

	private List<Rank> SkillRanks;

	public ClassLevel(final CharacterClass characterClass) {
		this.characterClass = characterClass;
	}

	@Override
	public Integer getHitPointIncrease() {
		return hitpointIncrease;
	}

	@Override
	public void setHitPointIncrease(final Integer increase) {
		hitpointIncrease = increase;
	}

	public Integer getHitpointIncrease() {
		return hitpointIncrease;
	}

	public void setHitpointIncrease(final Integer hitpointIncrease) {
		this.hitpointIncrease = hitpointIncrease;
	}

	public Integer getBaseAttackBonusIncrease() {
		return baseAttackBonusIncrease;
	}

	public void setBaseAttackBonusIncrease(final Integer baseAttackBonusIncrease) {
		this.baseAttackBonusIncrease = baseAttackBonusIncrease;
	}

	public Integer getFortituteSavingThrowIncrease() {
		return fortituteSavingThrowIncrease;
	}

	public void setFortituteSavingThrowIncrease(
			final Integer fortituteSavingThrowIncrease) {
		this.fortituteSavingThrowIncrease = fortituteSavingThrowIncrease;
	}

	public Integer getReflexSavingThrowIncrease() {
		return reflexSavingThrowIncrease;
	}

	public void setReflexSavingThrowIncrease(
			final Integer reflexSavingThrowIncrease) {
		this.reflexSavingThrowIncrease = reflexSavingThrowIncrease;
	}

	public Integer getWillSavingThrowIncrease() {
		return willSavingThrowIncrease;
	}

	public void setWillSavingThrowIncrease(final Integer willSavingThrowIncrease) {
		this.willSavingThrowIncrease = willSavingThrowIncrease;
	}

	public List<Rank> getSkillRanks() {
		return SkillRanks;
	}

	public void setSkillRanks(final List<Rank> skillRanks) {
		SkillRanks = skillRanks;
	}

	public CharacterClass getCharacterClass() {
		return characterClass;
	}

}
