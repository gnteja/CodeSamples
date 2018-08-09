package com.learngn.springdependencyinjection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.learngn.springdependencyinjection.entity.EntityTobeAutowired;
import com.learngn.springdependencyinjection.service.AutowireService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDependencyInjectionLearnApplicationTests {

	@Test
	public void contextLoads() {
	}

}
