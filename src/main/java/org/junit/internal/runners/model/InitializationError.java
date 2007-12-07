package org.junit.internal.runners.model;

import java.util.Arrays;
import java.util.List;

// TODO: (Nov 14, 2007 12:03:52 PM) Does this belong here?


public class InitializationError extends Exception {
	private static final long serialVersionUID= 1L;
	private final List<Throwable> fErrors;

	public InitializationError(List<Throwable> errors) {
		fErrors= errors;
	}

	public InitializationError(Throwable... errors) {
		this(Arrays.asList(errors));
	}
	
	public InitializationError(String string) {
		this(new Exception(string));
	}

	public List<Throwable> getCauses() {
		return fErrors;
	}
}