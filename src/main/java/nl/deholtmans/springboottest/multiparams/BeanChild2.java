package nl.deholtmans.springboottest.multiparams;

import org.springframework.stereotype.Service;

@Service
public class BeanChild2 implements BeanIF {
    private String whoAmI = "child-bean-2";
    public BeanChild2() {
    }

    @Override
    public String getName() {
        return "I am a child bean: " + whoAmI;
    }

    @Override
    public String whoAmI() {
        return "I am a child bean: " + whoAmI;
    }

    public void setWhoAmI(String whoAmI) {
        this.whoAmI = whoAmI;
    }

}
