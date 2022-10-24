package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    @Autowired
    public Egg6(Needle needle) {
        this.needle = needle;
    }

    private Needle needle;


    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
