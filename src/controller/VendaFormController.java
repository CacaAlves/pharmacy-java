package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Venda;
import view.PharmacyManager;
import view.ViewFactory;

public class VendaFormController extends BaseController implements Initializable {

	@FXML
    private TextField clienteRGTextField;

    @FXML
    private TextField vendedorRGTextField;
    
    private Venda venda = null; 
    
	public VendaFormController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}

	@FXML
	void adicionarFormulaBtnOnAction(ActionEvent event) {
		viewFactory.showFormulasListar(venda.getFormulas());
	}
	
	@FXML
    void salvarBtnOnAction(ActionEvent event) {
		Stage stage = (Stage) clienteRGTextField.getScene().getWindow();
		viewFactory.closeStage(stage);
    }
	
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

}
