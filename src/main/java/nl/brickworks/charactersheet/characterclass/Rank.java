package nl.brickworks.charactersheet.characterclass;

public class Rank {

	private final Skill skill;
	private int ranks = 0;

	public Rank(final Skill skill) {
		this.skill = skill;
	}

	public Skill getSkill() {
		return skill;
	}

	public int getRanks() {
		return ranks;
	}

	public void setRanks(final int ranks) {
		this.ranks = ranks;
	}
}
