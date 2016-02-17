package org.achraf.example;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class TransitionA implements Transition {

	static Logger log = Logger.getLogger(TransitionA.class);

	@Override
	public void doTransition() {
		log.debug("Transition A");

	}

	@Override
	public boolean canDoTransition() {
		return true;
	}

}
