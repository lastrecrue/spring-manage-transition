package org.achraf.example;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class EventManager {
	static Logger log = Logger.getLogger(EventManager.class);

	@Autowired
	private ApplicationContext applicationContext;

	public void doEvent(EventManagerType eventManagerType) {
		Class<?>[] classs = eventManagerType.getClasses();
		for (Class<?> class1 : classs) {
			Transition transition = (Transition) applicationContext
					.getBean(class1);
			transition.doTransition();
		}
	}
}
