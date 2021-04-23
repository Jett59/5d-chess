package app.cleancode.chess.arena;

import javafx.stage.Stage;

public class Arena {
private static Arena instance;

public static synchronized Arena init () {
	if (instance != null) {
		throw new RuntimeException("Arena already initialized");
	}
	return (instance = new Arena());
}
public static Arena instance () {
	if (instance == null) {
		throw new RuntimeException ("arena not initialized");
	}
	return instance;
}

private Stage stage;
private boolean running;

private Arena () {}

public synchronized Arena bind (Stage stage) {
	if (this.stage != null) {
		throw new RuntimeException ("arena already bound");
	}
	this.stage = stage;
	return this;
}

public synchronized Arena start () {
	if (running) {
		throw new RuntimeException ("arena already running");
	}
	running = true;
	return this;
}
}
