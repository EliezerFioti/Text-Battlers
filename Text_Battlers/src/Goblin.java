
public class Goblin extends Characters {
	
	public Goblin(String characterName, int characterLevel, int characterAttackStat, int characterHealth) {
		super(characterName, characterLevel, characterAttackStat, characterHealth);
		addAttack("CLUB BASH", 8);
		addAttack("BITE", 5);
		addAttack("CRUSHING BLOW", 10);
		addAttack("GALE SWIPE", 7);
	}

}
