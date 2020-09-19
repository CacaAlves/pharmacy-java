package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Formula;
import view.PharmacyManager;
import view.ViewFactory;

public class FormulaFormController extends BaseController implements Initializable {

    @FXML
    private CheckBox usoProlontadoCheckBox;

    @FXML
    private TextField medicoIDTextField;

    @FXML
    private DatePicker dataPrescicaoDatePicker;
    
    private Formula formula = null;
    
    public FormulaFormController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
    	super(pharmacyManager, viewFactory, fxmlName);
    }
    

    @FXML
    void adicionarInsumosBtnOnAction(ActionEvent event) {
    	viewFactory.showEscolherInsumos();
    }

    @FXML
    void escreverDoseBtnOnAction(ActionEvent event) {
    	viewFactory.showEscreverDose();
    }

    @FXML
    void listarMedicosBtnOnAction(ActionEvent event) {
    	viewFactory.showMedicosListar();
    }
    
    @FXML
    void salvarBtnOnAction(ActionEvent event) {
    	Stage stage = (Stage) usoProlontadoCheckBox.getScene().getWindow();
    	viewFactory.closeStage(stage);
    }
    
    public void setFormula(Formula formula) {
    	this.formula = formula;
    }
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
