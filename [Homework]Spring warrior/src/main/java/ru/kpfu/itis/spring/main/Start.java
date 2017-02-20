package ru.kpfu.itis.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.kpfu.itis.spring.AppConfig;
import ru.kpfu.itis.spring.interfaces.impl.warrior.SimpleVillager;

public class Start {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Object obj = context.getBean("simpleVillager");

        if (obj instanceof SimpleVillager) {
            SimpleVillager simpleVillager = (SimpleVillager) obj;
            simpleVillager.attack();
            simpleVillager.defend();
        }
    }
}
