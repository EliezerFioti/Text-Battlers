
public class Orc extends Characters{
	
	public Orc(String characterName, int characterLevel, int characterAttackStat, int characterHealth) {
		super(characterName, characterLevel, characterAttackStat, characterHealth);
		addAttack("BRUTE SMASH", 16);
		addAttack("CHARGE", 11);
		addAttack("WILD SWING", 14);
		addAttack("STOMP", 10);
	}
	
}
