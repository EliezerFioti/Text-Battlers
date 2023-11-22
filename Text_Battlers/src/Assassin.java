
public class Assassin extends Characters {

	public Assassin(String characterName, int characterLevel, int characterAttackStat, int characterHealth) {
		super(characterName, characterLevel, characterAttackStat, characterHealth);
		addAttack("BACKSTAB", 5);
		addAttack("SHADOW STRIKE", 7);
		addAttack("EVISCERATE", 9);
	}
	
}
