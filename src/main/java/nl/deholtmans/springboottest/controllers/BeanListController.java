package nl.deholtmans.springboottest.controllers;

import nl.deholtmans.springboottest.multiparams.BeanCollection;
import nl.deholtmans.springboottest.multiparams.BeanIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanListController {
    private BeanCollection beanCollection;

    @Autowired
    public BeanListController( BeanCollection beanCollection) {
        this.beanCollection = beanCollection;
    }

    @GetMapping(value = "/beans")
    ResponseEntity<String> getBeans() {
        String whoAreYourChildren = beanCollection.getYourChildren();
        return new ResponseEntity<String>("{\"status\":\"" + whoAreYourChildren + "\"}", HttpStatus.OK);
    }

    @GetMapping(value = "/beans/{name}")
    ResponseEntity<String> getBeanByName( @PathVariable String name) {
        BeanIF child = beanCollection.getBeanByName( name);
        return new ResponseEntity<String>("{\"status\":\"" + child.whoAmI() + "\"}", HttpStatus.OK);
    }
}
