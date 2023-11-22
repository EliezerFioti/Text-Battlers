
public class Knight extends Characters {
	
	public Knight(String characterName, int characterLevel, int characterAttackStat, int characterHealth) {
		super(characterName, characterLevel, characterAttackStat, characterHealth);
		addAttack("SHIELD SLAM", 7);
		addAttack("CHARGE", 8);
		addAttack("SWORD SWEEP", 9);
	}

}
