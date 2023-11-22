import java.util.ArrayList;
import java.util.List;

public class Monster extends Characters {
	
	private List<Characters> monsters;
	
	public Monster(String characterName, int characterLevel, int characterAttackStat, int characterHealth) {
		super(characterName, characterLevel, characterAttackStat, characterHealth);
		
		monsters = new ArrayList<>();
		
		Goblin goblin = new Goblin("GOBLIN", 5, 60, 90);
		Skeleton skeleton = new Skeleton("SKELETON", 10, 90, 150);
		Orc orc = new Orc("ORC", 15, 120, 210);
		Chimera chimera = new Chimera("CHIMERA", 15, 150, 300);
		Dragon dragon = new Dragon("DRAGON", 20, 240, 450);
		
		monsters.add(goblin);
		monsters.add(skeleton);
		monsters.add(orc);
		monsters.add(chimera);
		monsters.add(dragon);
	}
	
	public void printMonster() {
		int monsterIndex = 1;
		for (Characters monster : monsters) {
			String output = String.format("\t\t%-2d) %-20s LEVEL: %-5d Health: %-5d\n", monsterIndex, monster.getCharacterName(), monster.getCharacterLevel(), monster.getCharacterHealth());
	        System.out.println(output);
            monsterIndex++;
        }
	}
	
	public void reduceMonstersHealth(int damage) {
		int currentHealth = getCharacterHealth() - damage;
		setCharacterHealth(Math.max(currentHealth, 0));
	}

}
