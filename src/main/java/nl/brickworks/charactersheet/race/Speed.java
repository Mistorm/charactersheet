package nl.brickworks.charactersheet.race;

public abstract class Speed {

	// TODO: these mode should match, check in D&D rule book
	public enum Mode {
		land, flight, burrow, swim, undefined
	}

	private final static Integer SQUARE_SIZE_IN_FOOT = 5;

	private Mode mode = Mode.undefined;
	private Integer footPerRound = 0;

	public Mode getMode() {
		return mode;
	}

	protected void setMode(final Mode mode) {
		this.mode = mode;
	}

	public Integer getFootPerRound() {
		return footPerRound;
	}

	public void setFootPerRound(final Integer footPerRound) {
		this.footPerRound = footPerRound;
	}

	public Integer squaresPerRound() {
		return footPerRound / SQUARE_SIZE_IN_FOOT;
	}

	public boolean differentMode(final Speed speed) {
		if (this.mode.equals(speed.getMode())) {
			return true;
		} else {
			return false;
		}
	}

}
