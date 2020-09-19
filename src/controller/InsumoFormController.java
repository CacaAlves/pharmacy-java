package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import view.PharmacyManager;
import view.ViewFactory;

public class InsumoFormController extends BaseController implements Initializable {

	public InsumoFormController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}
	
	@FXML
    private TextField nomeTextFIeld;

    @FXML
    private TextField tipoTextField;

    @FXML
    private TextField portariaTextField;

    @FXML
    private TextField fatorEqTextField;

    @FXML
    private TextField fatorCorreTextField;

    @FXML
    private TextField dcbTextField;

    @FXML
    private TextField margemLucroTextField;

    @FXML
    private TextField dosagemMinTextField;

    @FXML
    private TextField dosagemMaxTextField;

    @FXML
    private TextField qtdEstoqueTextField;

    @FXML
    private TextField pontoDeCompTextField;

    List<String> sinonimos = new ArrayList<String>();
        
    @FXML
    void escreverBulaBtnOnAction(ActionEvent event) {
    	viewFactory.showEscreverBula();
    }
    
    @FXML
    void adicionarSinonimoBtnOnAction(ActionEvent event) {
    	viewFactory.showAdicionarSinonimo(this.sinonimos);
    }
    
    @FXML
    void salvarBtnOnAction(ActionEvent event) {
    	
    }


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
