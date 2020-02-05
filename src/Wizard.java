public class Wizard extends Character {

public Wizard() {
    setLvl(1);
    setHp(500);
    setDef(50);
    setPower(150);
    setIntelligence(100);
}

public void Fireball(Character enemy)
{
    enemy.setHp(enemy.getHp() - (this.getPower() + 20 - enemy.getDef()));
}
}