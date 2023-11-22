
public class Chimera extends Characters {
	
	public Chimera(String characterName, int characterLevel, int characterAttackStat, int characterHealth) {
		super(characterName, characterLevel, characterAttackStat, characterHealth);
		addAttack("FLAMING BREATH", 20);
		addAttack("VENOMOUS TAIL STRIKE", 13);
		addAttack("POISONOUS BREATH", 18);
		addAttack("WING SLASH", 15);
	}
	
}
