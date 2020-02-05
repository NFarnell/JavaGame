public class Playable extends Character {
private String name;
private Character playable;
public Playable(String name, String job) {
    this.setName(name);
    switch (job)
    {
        case "Knight" :
            setPlayable(new Knight());
            break;
          
        case "Wizard" :
        	setPlayable(new Wizard());
        	break;
       
    }
}

public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

public Character getPlayable() {
    return playable;
}
public void setPlayable(Character playable) {
    this.playable = playable;
}

}