package app.cleancode.chess;

import app.cleancode.chess.arena.Arena;
import javafx.application.Application;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class App extends Application {
public static void main(String[] args) {
	launch (args);
}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("5d Chess");
		primaryStage.setFullScreen(true);
		primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
		System.out.println(Arena.init().equals(Arena.instance()));
		Arena.init();
		primaryStage.show();
	}

}
