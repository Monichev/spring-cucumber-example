package com.manoj.training.app;

import java.util.ArrayList;

public class Bag {

	private final ArrayList<String> things;

	public Bag() {
		things = new ArrayList<>();
	}

	void add(final String something) {
		things.add(something);
	}

	public ArrayList<String> getThings() {
		return things;
	}

	public boolean isEmpty() {
		return things.isEmpty();
	}

	public void removeEverything() {
		things.clear();
	}
}
