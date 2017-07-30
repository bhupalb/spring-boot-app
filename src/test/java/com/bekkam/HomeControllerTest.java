/**
 * 
 */
package com.bekkam;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
/**
 * @author BEKKAMB
 *
 */ 
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HomeControllerTest {

	@Autowired
	private  MockMvc mockMvc;
	
	
	@Test
	public void getHome() throws Exception
	{ 
		mockMvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
			.andExpect(content().string(equalTo("Welcome Bhupal")));
		
	}
	
	@Test
	public void getAbout() throws Exception
	{ 
		mockMvc.perform(MockMvcRequestBuilders.get("/about").accept(MediaType.APPLICATION_JSON))
			.andExpect(content().string(equalTo("This is About Us Page !!")));
		
	}
	
	@Test
	public void getContact() throws Exception
	{ 
		mockMvc.perform(MockMvcRequestBuilders.get("/contact").accept(MediaType.APPLICATION_JSON))
			.andExpect(content().string(equalTo("This is Contatct Us Page !!")));
		
	}
}
