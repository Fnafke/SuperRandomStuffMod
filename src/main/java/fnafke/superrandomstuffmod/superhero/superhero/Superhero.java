package fnafke.superrandomstuffmod.superhero.superhero;


import fnafke.superrandomstuffmod.superhero.ability.Ability;

import java.util.HashSet;
import java.util.Set;

public abstract class Superhero {
    private String name;
    private String description;
    private Set<Ability> abilities = new HashSet<>();

    public Superhero(String name, String description) {
        this.name = name;
        this.description = description;
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

    public Set<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(Set<Ability> abilities) {
        this.abilities = abilities;
    }

    public void addAbility(Ability ability) {
        this.abilities.add(ability);
    }
}
