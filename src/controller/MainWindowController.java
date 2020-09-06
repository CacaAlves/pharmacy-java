package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import view.PharmacyManager;
import view.ViewFactory;

public class MainWindowController extends BaseController implements Initializable{

	public MainWindowController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
}
