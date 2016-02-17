package org.achraf.example;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class TransitionB implements Transition {

	static Logger log = Logger.getLogger(TransitionB.class);

	@Override
	public void doTransition() {
		log.debug("Transition B");

	}

	@Override
	public boolean canDoTransition() {
		return true;
	}

}
