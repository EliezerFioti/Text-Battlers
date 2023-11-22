import java.util.ArrayList;
import java.util.List;

public class Hero extends Characters {
	
	private List<Characters> heroes;
	
	public Hero(String characterName, int characterLevel, int characterAttackStat, int characterHealth) {
		super(characterName, characterLevel, characterAttackStat, characterHealth);
		
		heroes = new ArrayList<>();
		
		Assassin assassin = new Assassin("ASSASSIN", 1, 100 ,80);
		Paladin paladin = new Paladin("PALADIN", 1, 90, 110);
		Mage mage = new Mage("MAGE", 1, 110, 80);
		Knight knight = new Knight("KNIGHT", 1, 95, 100);
		Archer archer = new Archer("ARCHER", 1, 85, 70);
		
		assassin.addAttack("BACKSTAB", 5);
        assassin.addAttack("SHADOW STRIKE", 7);
        assassin.addAttack("EVISCERATE", 9);

        paladin.addAttack("HOLY STRIKE", 6);
        paladin.addAttack("DIVINE SHIELD", 8);
        paladin.addAttack("SMITE", 10);

        mage.addAttack("FIREBALL", 8);
        mage.addAttack("ICE SHARD", 7);
        mage.addAttack("ARCANE MISSILE", 9);

        knight.addAttack("SLASH", 6);
        knight.addAttack("BLOCK", 7);
        knight.addAttack("CHARGE", 8);

        archer.addAttack("ARROW SHOT", 7);
        archer.addAttack("PRECISE AIM", 6);
        archer.addAttack("RAPID FIRE", 9);
		
		heroes.add(assassin);
		heroes.add(paladin);
		heroes.add(mage);
		heroes.add(knight);
		heroes.add(archer);
	}
	
	//print the attributes of each hero class
	public void printHeroes() {
		int heroIndex = 1;
		for (Characters hero : heroes) {
			String output = String.format("\t%-1d) %-10s LEVEL: %-10d ATTACK: %-10d HEALTH: %-10d\n",
                    heroIndex, hero.getCharacterName(), hero.getCharacterLevel(),
                    hero.getCharacterAttackStat(), hero.getCharacterHealth());
            System.out.println(output);
            heroIndex++;
        }
	}
	
	public void reduceHeroesHealth(int damage) {
		int currentHealth = getCharacterHealth() - damage;
		setCharacterHealth(Math.max(currentHealth, 0));     
	}

}
