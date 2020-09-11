package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import view.PharmacyManager;
import view.ViewFactory;

public class ConvenioFormController extends BaseController implements Initializable {

	@FXML
    private TextField cnpjTextField;

    @FXML
    private TextField nomeTextField;

    @FXML
    private TextField telefoneTextField;

    @FXML
    private TextField nomeContatoTextField;

    @FXML
    private TextField inscricaoEstadTextField;

    @FXML
    private TextField percentualDeDescontoTextField;

    @FXML
    private TextField enderecoTextField;

    @FXML
    private TextField logradouroTextField;

    @FXML
    private TextField numeroTextField;

    @FXML
    private TextField cepTextField;

	
	public ConvenioFormController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}
	
	@FXML
	void salvarBtnOnAction(ActionEvent event) {
		System.out.println("Salvar btn");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
