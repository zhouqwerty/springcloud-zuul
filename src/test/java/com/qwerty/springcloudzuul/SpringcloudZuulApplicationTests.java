package com.qwerty.springcloudzuul;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudZuulApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println(StringUtils.isEmpty(" "));
		System.out.println(StringUtils.isBlank(" "));
	}

}
