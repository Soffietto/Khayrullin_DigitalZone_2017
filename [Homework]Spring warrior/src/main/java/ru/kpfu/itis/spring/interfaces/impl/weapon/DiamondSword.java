package ru.kpfu.itis.spring.interfaces.impl.weapon;

import org.springframework.stereotype.Component;
import ru.kpfu.itis.spring.interfaces.Weapon;

@Component
public class DiamondSword implements Weapon {

    public void hit() {
        System.out.println("100 damage with diamond sword!");
    }
}
