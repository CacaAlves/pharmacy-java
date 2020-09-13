package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import view.PharmacyManager;
import view.ViewFactory;

public class MedicoFormController extends BaseController implements Initializable {

	@FXML
    private TextField nomeTextFIeld;

    @FXML
    private TextField nroDeRegistroTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField enderecoField;

    @FXML
    private TextField logradouroTextField;

    @FXML
    private TextField numeroTextField;

    @FXML
    private TextField CEPTextField;

    @FXML
    private TextField telefoneTextField;

	
	public MedicoFormController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}


    @FXML
    void salvarBtnOnAction(ActionEvent event) {

    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
