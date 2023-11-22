
public class Paladin extends Characters {
	
	public Paladin(String characterName, int characterLevel, int characterAttackStat, int characterHealth) {
		super(characterName, characterLevel, characterAttackStat, characterHealth);
		addAttack("BACKSTAB", 5);
		addAttack("DIVINE SMITE", 5);
		addAttack("SHIELD BASH", 7);
	}

}
