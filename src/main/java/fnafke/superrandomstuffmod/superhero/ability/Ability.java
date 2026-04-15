package fnafke.superrandomstuffmod.superhero.ability;

public abstract class Ability {
    private String name;
    private String description;
    private int damage = 0;

    public Ability(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void impl() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
