package nl.deholtmans.springboottest.multiparams;

import org.springframework.stereotype.Service;

@Service
public class BeanChild1 implements BeanIF {
    private String whoAmI = "child-bean-1";
    public BeanChild1() {
    }

    @Override
    public String getName() {
        return whoAmI;
    }

    @Override
    public String whoAmI() {
        return "I am a child bean: " + whoAmI;
    }

    public void setWhoAmI(String whoAmI) {
        this.whoAmI = whoAmI;
    }

}
