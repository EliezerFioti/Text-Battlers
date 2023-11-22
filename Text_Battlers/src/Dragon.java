
public class Dragon extends Characters {
	
	public Dragon(String characterName, int characterLevel, int characterAttackStat, int characterHealth) {
		super(characterName, characterLevel, characterAttackStat, characterHealth);
		addAttack("SEARING INFERNO", 30);
		addAttack("THUNDERING ROAR	", 25);
		addAttack("FLAME WAVE", 35);
		addAttack("TAIL SWEEP", 28);
	}
	
}
