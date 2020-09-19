package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import view.PharmacyManager;
import view.ViewFactory;

public class AdicionarTelefoneFornecedorController extends BaseController implements Initializable {

	@FXML
    private TextField telefoneTextField;

    @FXML
    private TextField nomeDoContatoTextField;

	
	public AdicionarTelefoneFornecedorController(PharmacyManager pharmacyManager, ViewFactory viewFactory,
			String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}
	
	@FXML
	void salvarBtnOnAction(ActionEvent event) {
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
