

public  class Character {
	

	
	private int hp;
	private int def;
	private int power;
	private int intelligence;
	private int lvl;
	private int xp;
	private int maxhp;
	
	public Character() {
		hp = maxhp;
		lvl = 1;
		

	}

	public void levelUp() {
		lvl += 1;
		hp *= 2;
		def *= 2;
		power *= 2;
		intelligence *= 2;
	}
	

	public void basicalAttack(Character enemy) {
		hp = hp - (power - def);
	}

	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;

	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}
	
	public boolean isAlive(){
	    return hp > 0;
	}

	    
	public void checkLevel(int xp, int lvl, Character a) {

        int[] levelArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1200, 1400, 1600, 1800, 2000, 2200,
                2400, 2600, 2800, 3000, 3500, 4000, 4500, 5000, 5500, 6000, 6500, 7000, 7500, 8000 }; // 30

        if (xp >= levelArray[lvl]) {
            // level up player
            if (xp >= levelArray[lvl + 1]) {
                a.setXp(levelArray[lvl]);
            } else {
                System.out.println("Level up!");
                a.setLvl(lvl + 1);
            }

	}
	}





	public static void print1(String lvl2) {
		// TODO Auto-generated method stub
		
	}
}


	


