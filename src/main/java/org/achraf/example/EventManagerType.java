package org.achraf.example;

public enum EventManagerType {
	A(TransitionA.class), B(TransitionB.class), AB(TransitionA.class,
			TransitionB.class);
	private Class<?>[] classes;

	private EventManagerType(Class<?>... classes) {
		this.classes = classes;
	}

	public Class<?>[] getClasses() {
		return classes;
	}
}
