package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import view.PharmacyManager;
import view.ViewFactory;

public class FornecedorFormController extends BaseController implements Initializable {

	@FXML
    private TextField cnpjTextField;

    @FXML
    private TextField razaoSocialTextField;

    @FXML
    private TextField nomeTextField;

    @FXML
    private TextField inscricaoEstTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField enderecoTextField;

    @FXML
    private TextField logradouroTextField;

    @FXML
    private TextField numeroTextField;

    @FXML
    private TextField cepTextField;


	
	public FornecedorFormController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}
	
	@FXML
	void adicionarTelefoneBtnOnAction(ActionEvent event) {
		viewFactory.showAdicionarTelefoneFornecedor();
	}
	
	@FXML
	void salvarBtnOnAction(ActionEvent event) {
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
