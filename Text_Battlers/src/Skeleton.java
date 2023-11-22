
public class Skeleton extends Characters {
	
	public Skeleton(String characterName, int characterLevel, int characterAttackStat, int characterHealth) {
		super(characterName, characterLevel, characterAttackStat, characterHealth);
		addAttack("RUSTY STRIKE", 12);
		addAttack("SHIELD BASH", 6);		
		addAttack("GRAVE STRIKE", 15);
		addAttack("BONE SHATTER", 8);
	}

}
