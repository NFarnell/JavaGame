public class Knight extends Character {

public Knight() {
    setLvl(1);
    setHp(1000);
    setDef(250);
    setPower(100);
    setIntelligence(20);
}
 

public void swordAttack(Character enemy)
{
    enemy.setHp(enemy.getHp() - (this.getPower() + 10 - enemy.getDef()));
}
}