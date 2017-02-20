package ru.kpfu.itis.spring.interfaces.impl.warrior;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.spring.interfaces.Armor;
import ru.kpfu.itis.spring.interfaces.Warrior;
import ru.kpfu.itis.spring.interfaces.Weapon;

@Component
public class SimpleVillager implements Warrior {


    private Armor armor;
    private Weapon weapon;

    @Autowired
    public SimpleVillager(@Qualifier(value = "diamondArmor") Armor armor, @Qualifier(value = "diamondSword") Weapon weapon) {
        this.armor = armor;
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        System.out.print("Villager is trying to attack: ");
        weapon.hit();
    }

    public void defend() {
        System.out.print("Villager is trying to defend himself: ");
        armor.shine();
    }
}
