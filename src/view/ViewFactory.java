package view;

import java.io.IOException;

import controller.BaseController;
import controller.MainWindowController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewFactory {
	
	public PharmacyManager pharmacyManager;
	
	public ViewFactory(PharmacyManager pharmacyManager) {
		this.pharmacyManager = pharmacyManager;
	}

	public void showMainWindow() {
		BaseController controller = new MainWindowController(pharmacyManager, this, "MainWindow.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}

	private Stage initializeStage(BaseController controller) {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setController(controller);
		fxmlLoader.setLocation(getClass().getResource(controller.getFxmlName()));
		Parent parent;
		try {
			parent = fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
		return stage;
	}
	
	public void closeStage(Stage stage) {
		stage.close();
	}
}
