package nl.deholtmans.springboottest.multiparams;

import org.springframework.stereotype.Service;

@Service
public class BeanChild4 implements BeanIF {
    private String whoAmI = "child-bean-4";
    public BeanChild4() {
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
