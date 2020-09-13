package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import view.PharmacyManager;
import view.ViewFactory;

public class FormulaFormController extends BaseController implements Initializable{

	@FXML
    private TextField qtdBaseTextField;

    @FXML
    private CheckBox usoProlontadoCheckBox;

    @FXML
    private TextField medicoIDTextField;

    @FXML
    private DatePicker dataPrescicaoDatePicker;
    
    public FormulaFormController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
    	super(pharmacyManager, viewFactory, fxmlName);
    }

    @FXML
    void adicionarInsumosBtnOnAction(ActionEvent event) {

    }

    @FXML
    void escreverDoseBtnOnAction(ActionEvent event) {
    	viewFactory.showEscreverDose();
    }

    @FXML
    void listarMedicosBtnOnAction(ActionEvent event) {
    	viewFactory.showMedicosListar();
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
