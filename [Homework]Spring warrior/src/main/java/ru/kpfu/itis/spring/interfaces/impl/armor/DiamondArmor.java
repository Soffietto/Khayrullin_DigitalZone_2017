package ru.kpfu.itis.spring.interfaces.impl.armor;

import org.springframework.stereotype.Component;
import ru.kpfu.itis.spring.interfaces.Armor;

@Component
public class DiamondArmor implements Armor {

    public void shine() {
        System.out.println("perfect diamond armor!");
    }
}
