
public class Mage extends Characters {
	
	public Mage(String characterName, int characterLevel, int characterAttackStat, int characterHealth) {
		super(characterName, characterLevel, characterAttackStat, characterHealth);
		addAttack("FROST NOVA", 7);
		addAttack("CHAIN LIGHTNING", 9);
		addAttack("ARCANE EXPLOSION", 11);
	}
	
}
