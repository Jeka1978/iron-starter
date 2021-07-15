package com.perion.ironstarter;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

/**
 * @author Evgeny Borisov
 */

public class HelloWorldService {

    @EventListener(ContextRefreshedEvent.class)
    public void sayHello(){
        System.out.println("HELLO PERION!!!!");
    }
}
