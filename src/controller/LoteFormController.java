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

public class LoteFormController extends BaseController implements Initializable {

	@FXML
    private TextField loteTextFIeld;

    @FXML
    private TextField quantidadeTextField;

    @FXML
    private TextField unidadeDeMedTextField;

    @FXML
    private DatePicker validadeDoLoteDatePicker;

    @FXML
    private TextField custoField;

    @FXML
    private TextField insumoTextField;

	
	public LoteFormController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}
	
	@FXML
	void listarInsumosBtnOnAction(ActionEvent event) {
		viewFactory.showInsumosListar();
	}
	
	@FXML
	void salvarBtnOnAction(ActionEvent event) {
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
