package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import view.PharmacyManager;
import view.ViewFactory;

public class OrdemDeCompraFormController extends BaseController implements Initializable {

	@FXML
    private DatePicker dataDeCompraDatePicker;

    @FXML
    private DatePicker dataDeEntregaDatePicker;

    @FXML
    private TextField condicaoDePagTextField;

    @FXML
    private TextField fornecedorIDTextField;

	
	public OrdemDeCompraFormController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}

	@FXML
	void listarFornecedoresBtnOnAction(ActionEvent event) {
		viewFactory.showFornecedoresListar();
	}
	
	@FXML
	void salvarBtnOnAction(ActionEvent event) {
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
}
