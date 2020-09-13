package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.HTMLEditor;
import view.PharmacyManager;
import view.ViewFactory;

public class EscreverDoseController extends BaseController implements Initializable {

	@FXML
    private HTMLEditor escreverDoseHtmlEditor;
	
	public EscreverDoseController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}
	
	@FXML
    void salvarBtnOnAction(ActionEvent event) {

    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
