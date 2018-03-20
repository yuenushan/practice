package ioc.autowiring.impl;

import ioc.autowiring.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * Created by chenjing28 on 18/3/20.
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "七里香";
    private String author = "周杰伦";


    @Override
    public void play() {
        System.out.println("play " + title + "by " + author);
    }
}
