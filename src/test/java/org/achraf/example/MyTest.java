package org.achraf.example;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class MyTest {
	static Logger log = Logger.getLogger(MyTest.class);

	@Autowired
	private EventManager eventManager;

	@Test
	public void doEvent() {
		eventManager.doEvent(EventManagerType.A);
		eventManager.doEvent(EventManagerType.AB);
	}

}
