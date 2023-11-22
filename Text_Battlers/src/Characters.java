import java.util.HashMap;
import java.util.Map;

public class Characters {
	
	private String characterName;
	private int characterLevel;
	private int characterHealth;
	private int characterAttackStat;
	private Map<String, Integer> attacks;
	
	public Characters(String characterName, int characterLevel, int characterAttackStat, int characterHealth) {
		this.characterName = characterName;
		this.characterLevel = characterLevel;
		this.characterAttackStat = characterAttackStat;
		this.characterHealth = characterHealth;
		this.attacks = new HashMap<>();
	}
	
	public Map<String, Integer> getAttack() {
		return attacks;
	}
	
	public void addAttack(String attackName, int attackDamage) {
		attacks.put(attackName, attackDamage);
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public int getCharacterLevel() {
		return characterLevel;
	}

	public void setCharacterLevel(int characterLevel) {
		this.characterLevel = characterLevel;
	}

	public int getCharacterAttackStat() {
		return characterAttackStat;
	}

	public void setCharacterAttackStat(int characterAttackStat) {
		this.characterAttackStat = characterAttackStat;
	}

	public int getCharacterHealth() {
		return characterHealth;
	}

	public void setCharacterHealth(int characterHealth) {
		this.characterHealth = characterHealth;
	}
}
