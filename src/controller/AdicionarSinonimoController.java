package controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import view.PharmacyManager;
import view.ViewFactory;

public class AdicionarSinonimoController extends BaseController implements Initializable {

	@FXML
	private TextField sinonimoTextField;

	private List<String> sinonimos;
	
	public AdicionarSinonimoController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName, List<String> sinonimos) {
		super(pharmacyManager, viewFactory, fxmlName);
		this.sinonimos = sinonimos;
	}
	

    @FXML
    void salvarBtnOnAction(ActionEvent event) {
    	this.sinonimos.add(sinonimoTextField.getText());
    	Stage stage = (Stage) sinonimoTextField.getScene().getWindow();
    	viewFactory.closeStage(stage);
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
