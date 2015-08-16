package nl.brickworks.charactersheet.race;

public class FlightSpeed extends Speed {

	//Only flight has a maneuverability value
	public enum  Maneuverability {
		poor, average, descent, good, perfect
	}

	private Maneuverability maneuverability;

	public FlightSpeed(){
		this.setMode(Mode.flight );

	}

	public Maneuverability getManeuverability() {
		return maneuverability;
	}

	public void setManeuverability(final Maneuverability maneuverability) {
		this.maneuverability = maneuverability;
	}


}
