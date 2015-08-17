package nl.brickworks.charactersheet.character;

import java.util.ArrayList;
import java.util.List;

import nl.brickworks.charactersheet.characterclass.CharacterClass;

public class LevelController {

	private final List<Level> levels = new ArrayList<Level>();

	public void gainClassLevel(final CharacterClass characterclass) {
		final ClassLevel level = new ClassLevel(characterclass);
		levels.add(level);
	}

	public int aggregateHitpoints() {

		Integer total = 0;

		for (final Level level : levels) {
			if (level instanceof HitpointProvider) {
				total += ((HitpointProvider) level).getHitPointIncrease();
			}
		}

		return total;
	}
}
