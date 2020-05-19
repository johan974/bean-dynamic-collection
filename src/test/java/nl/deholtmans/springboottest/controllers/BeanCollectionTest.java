package nl.deholtmans.springboottest.controllers;

import nl.deholtmans.springboottest.multiparams.BeanCollection;
import nl.deholtmans.springboottest.multiparams.BeanIF;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = BeanListController.class)
public class BeanCollectionTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BeanCollection beanCollection;

    @Test
    public void getAllBeanNames_ShouldGiveAll() throws Exception {
        String output = "Dit is een testje";
        when(beanCollection.getYourChildren()).thenReturn(output);

        mockMvc.perform(get("/beans"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status", is("Dit is een testje")));
    }

}
