package app.cleancode.chess.arena;

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

}
