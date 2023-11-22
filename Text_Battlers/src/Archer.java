
public class Archer extends Characters {

	public Archer(String characterName, int characterLevel, int characterAttackStat, int characterHealth) {
		super(characterName, characterLevel, characterAttackStat, characterHealth);
		addAttack("PERSISION SHOOT", 6);
		addAttack("POSION ARROW", 7);
		addAttack("ARROW RAIN", 8);
	}
	
}
