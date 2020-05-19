package nl.deholtmans.springboottest.multiparams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BeanCollection {
    private Map<String,BeanIF> beanChildren = new HashMap<>();

    @Autowired
    public BeanCollection(BeanIF... children) {
        for( BeanIF child : children) {
            System.out.println( "BeanCollection: imported in constructor: " + child.whoAmI());
            beanChildren.put( child.getName(), child);
        }
    }

    public BeanIF getBeanByName( String name) {
        return beanChildren.get( name);
    }

    public String getYourChildren() {
        StringBuffer sb = new StringBuffer();
        for( BeanIF child : beanChildren.values()) {
            sb.append( "Child: " + child.whoAmI() + "\n");
        }
        return sb.toString();
    }
}
