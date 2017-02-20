package ru.kpfu.itis.spring.interfaces.impl.weapon;

import org.springframework.stereotype.Component;
import ru.kpfu.itis.spring.interfaces.Weapon;

@Component
public class WoodenSword implements Weapon {
    public void hit() {
        System.out.println("Pretty bad damage with wooden sword :(");
    }
}
