import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class GameUserInterface {
	
	Hero hero = new Hero("Default", 0, 0, 0);
	Monster monster = new Monster("Default", 0, 0, 0);
	Scanner in = new Scanner(System.in);
	Random random = new Random();
	
	protected List<Hero> heroes;
	private Hero selectedHero;
	
	protected List<Monster> monsters;
	private Monster selectedMonster;
	
	public GameUserInterface() {
        // Initialize the heroes list
        heroes = new ArrayList<>();
        
        // Populate the heroes list with instances of Hero
        Hero assassin = new Hero("ASSASSIN", 1, 100 ,80);
        Hero paladin = new Hero("PALADIN", 1, 90, 110);
        Hero mage = new Hero("MAGE", 1, 110, 80);
        Hero knight = new Hero("KNIGHT", 1, 95, 100);
        Hero archer = new Hero("ARCHER", 1, 85, 70);
        
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
		
		// Initialize the monsters list
        monsters = new ArrayList<>();
        
        Monster goblin = new Monster("GOBLIN", 5, 60, 90);
        Monster skeleton = new Monster("SKELETON", 10, 90, 150);
        Monster orc = new Monster("ORC", 15, 120, 210);
        Monster chimera = new Monster("CHIMERA", 15, 150, 300);
        Monster dragon = new Monster("DRAGON", 20, 240, 450);
        
        goblin.addAttack("CLUB BASH", 8);
	goblin.addAttack("BITE", 5);
	goblin.addAttack("CRUSHING BLOW", 10);
	goblin.addAttack("GALE SWIPE", 7);
        
        skeleton.addAttack("RUSTY STRIKE", 12);
        skeleton.addAttack("SHIELD BASH", 6);
        skeleton.addAttack("GRAVE STRIKE", 15);
        skeleton.addAttack("BONE SHATTER", 8);
        
        orc.addAttack("BRUTE SMASH", 16);
	orc.addAttack("CHARGE", 11);
	orc.addAttack("WILD SWING", 14);
	orc.addAttack("STOMP", 10);
		
	chimera.addAttack("FLAMING BREATH", 20);
	chimera.addAttack("VENOMOUS TAIL STRIKE", 13);
	chimera.addAttack("POISONOUS BREATH", 18);
	chimera.addAttack("WING SLASH", 15);
		
	dragon.addAttack("SEARING INFERNO", 30);
	dragon.addAttack("THUNDERING ROAR	", 25);
	dragon.addAttack("FLAME WAVE", 35);
	dragon.addAttack("TAIL SWEEP", 28);
		
	monsters.add(goblin);
	monsters.add(skeleton);
	monsters.add(orc);
	monsters.add(chimera);
	monsters.add(dragon);
    }
	
	public void displayWelcomeMessage() {
		System.out.println("********************************************************************");
	        System.out.println("\n                        WELCOME TO TEXT BATTLERS                  ");
	        System.out.println("          TEXT BATTLERS IS A TEXT-BASED TURNED BASED BATTLER      \n");     
	        System.out.println("********************************************************************");
	}
	
	int heroSelcetionNum;
	
	public void displayHeroClasses() { 
		System.out.println("                            SELECT YOUR CLASS                     \n");
		hero.printHeroes();
		System.out.println("********************************************************************");
		System.out.print("\nSELECT HERO: ");
		heroSelcetionNum = in.nextInt();
		selectedHero = getHero(heroSelcetionNum);
		System.out.println("\n> " + selectedHero.getCharacterName() + " HAS BEEN CHOSEN");
	}	
	
	int selectionOptionNum;
	
	public void displayUserOption() {
		System.out.println("\n********************************************************************");
		System.out.println("                              PICK AN OPTION                        ");
		System.out.println("                                                                    ");
		System.out.println("                    1.BATTLE                 2.SHOP                 ");
		System.out.println("                                                                    ");
		System.out.println("                    3.BAG                    4.QUIT                 ");
		System.out.println("                                                                    ");
		System.out.println("********************************************************************");
		
		System.out.print("\nSELECT OPTION: ");
		selectionOptionNum = in.nextInt();	
	}
	
	int monsterSelcetionNum;
	
	public void displayMonster() {
		switch(selectionOptionNum) {
		case 1: 
			System.out.println("\n********************************************************************");
			System.out.println("\n                              SELECT MONSTER                     \n"); 
			monster.printMonster();
			System.out.println("*********************************************************************");
			
			System.out.print("\nSELECT A MONSTER: ");
			monsterSelcetionNum = in.nextInt();
			
			selectedMonster = getMonster(monsterSelcetionNum);
			
			displayBattle(monsterSelcetionNum);
		}
	}
	
	int battleOptionNum;
	
	public void displayBattle(int optionNum) {
		Monster selectedMonster = getMonster(optionNum);
		System.out.println("\n********************************************************************"); 
		System.out.println("                                 " + selectedMonster.getCharacterName());
	    System.out.println("                                 HP: " + selectedMonster.getCharacterHealth());
	    System.out.println("\n\n                               " + selectedHero.getCharacterName());
	    System.out.println("                                HP: " + selectedHero.getCharacterHealth() + "\n");
	    System.out.println("\n                     FIGHT                   BAG");
	    System.out.println("                                  RUN                                      \n");
	    System.out.println("********************************************************************");
	    
	    System.out.print("\nSELECT OPTION: ");
	    battleOptionNum = in.nextInt();
	    
	    displayFight(monsterSelcetionNum);
	    
	}
	
	public void displayFight(int optionNum) {
		Monster selectedMonster = getMonster(optionNum);
	    
	    while(selectedMonster.getCharacterHealth() >= 1 || selectedHero.getCharacterHealth() >= 1) {
	    	System.out.println("\n********************************************************************");
			System.out.println("\n                                " + selectedMonster.getCharacterName());
		    System.out.println("                                HP: " + selectedMonster.getCharacterHealth());
		    System.out.println("\n\n                               " + selectedHero.getCharacterName());
		    System.out.println("                                HP: " + selectedHero.getCharacterHealth() + "\n");
		    
		    Map<String, Integer> heroAttacks = selectedHero.getAttack();
		    for (Map.Entry<String, Integer> entry : heroAttacks.entrySet()) {
		        System.out.printf("\t\t\t\t%-15s %d\n", entry.getKey(), entry.getValue());
		    }
		    
		    System.out.println("\n********************************************************************");
		    
		    System.out.print("\nSELECT MOVE: ");
		    int moveOptionNum = in.nextInt();
		    
		    System.out.println("\n> " + selectedHero.getCharacterName() + " USED ");
		    
		    System.out.println("\n> " + selectedMonster.getCharacterName() + " USED ");
		    
		    battleLogic(moveOptionNum, selectedMonster);
		    monsterBattleLogic(selectedHero);
		    
		    displayBattle(monsterSelcetionNum);
		    
	    }
	}
	
	public void battleLogic(int moveOptionNum, Monster selectedMonster) {
		Map<String, Integer> heroAttacks = selectedHero.getAttack();
		
		//validating hero's move Options 
		if(moveOptionNum >= 1 && moveOptionNum <= heroAttacks.size()) {
			String selectedMove = new ArrayList<>(heroAttacks.keySet()).get(moveOptionNum - 1);
			
			int damage = heroAttacks.get(selectedMove);
			selectedMonster.reduceMonstersHealth(damage);
			
			System.out.println("\n> " + selectedHero.getCharacterName() + " DID " + damage + " DAMAGE");
		}
	}
	
	public void monsterBattleLogic(Hero selectedHero) {
		int attackChoice = random.nextInt(selectedMonster.getAttack().size());
		Map<String, Integer> monsterAttacks = selectedMonster.getAttack();
		
		//validating monster's move Options 
		if(attackChoice >= 1 && attackChoice <= monsterAttacks.size()) {
			String selectedMove = new ArrayList<>(monsterAttacks.keySet()).get(attackChoice);
			int damage = monsterAttacks.get(selectedMove);
			selectedHero.reduceHeroesHealth(damage);
			
			System.out.println("\n> " + selectedMonster.getCharacterName() + " DID " + damage + " DAMAGE");
		}
		
	}
	
	public Hero getHero(int index) {
		if (index >= 1 && index <= heroes.size()) {
			return heroes.get(index - 1);
		} else {
			return null;
		}
	}
	
	public Monster getMonster(int index) {
		if (index >= 1 && index <= monsters.size()) {
			return monsters.get(index - 1);
		} else {
			return null;
		}
	}
	
}
