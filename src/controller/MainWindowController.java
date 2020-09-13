package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import view.PharmacyManager;
import view.ViewFactory;

public class MainWindowController extends BaseController implements Initializable {

	@FXML
    private ChoiceBox<?> orderByDateInsumos;

    @FXML
    private ChoiceBox<?> OrderByMonthVendas;

    @FXML
    private ChoiceBox<?> OrderByYearVendas;

    @FXML
    void aboutHelpAction(ActionEvent event) {

    }

    @FXML
    void clienteEditarAction(ActionEvent event) {

    }

    @FXML
    void clienteRegistrarAction(ActionEvent event) {
    	viewFactory.showClientForm();
    }

    @FXML
    void convenioEditarAction(ActionEvent event) {

    }

    @FXML
    void convenioRegistrarAction(ActionEvent event) {
    	viewFactory.showConvenioForm();
    }

    @FXML
    void conveniosListarAction(ActionEvent event) {

    }

    @FXML
    void formulaEditarAction(ActionEvent event) {

    }

    @FXML
    void formulaRegistrarAction(ActionEvent event) {
    	viewFactory.showFormulaForm();
    }

    @FXML
    void formulasListarAction(ActionEvent event) {

    }

    @FXML
    void fornecedorEditarAction(ActionEvent event) {

    }

    @FXML
    void fornecedorRegistrarAction(ActionEvent event) {
    	viewFactory.showFornecedorForm();
    }

    @FXML
    void fornecedoresListarAction(ActionEvent event) {

    }

    @FXML
    void insumoEditarAction(ActionEvent event) {

    }

    @FXML
    void insumoRegistrarAction(ActionEvent event) {
    	viewFactory.showInsumoForm();
    }

    @FXML
    void insumosListarAction(ActionEvent event) {

    }

    @FXML
    void loteEditarAction(ActionEvent event) {
    	viewFactory.showLoteForm();
    }

    @FXML
    void loteRegistrarAction(ActionEvent event) {
    	viewFactory.showLoteForm();
    }

    @FXML
    void lotesListarAction(ActionEvent event) {

    }

    @FXML
    void medicoEditarAction(ActionEvent event) {

    }

    @FXML
    void medicoRegistrarAction(ActionEvent event) {

    }

    @FXML
    void medicosListarAction(ActionEvent event) {

    }

    @FXML
    void ordemDeCompraEditarAction(ActionEvent event) {

    }

    @FXML
    void ordemDeCompraRegistrarAction(ActionEvent event) {

    }

    @FXML
    void ordensDeCompraListarAction(ActionEvent event) {

    }

    @FXML
    void vendaEditarAction(ActionEvent event) {

    }

    @FXML
    void vendaRegistrarAction(ActionEvent event) {
    	viewFactory.showVendaForm();
    }

    @FXML
    void vendasListarAction(ActionEvent event) {

    }

    @FXML
    void vendedorEditarAction(ActionEvent event) {

    }

    @FXML
    void vendedorRegistrarAction(ActionEvent event) {

    }

    @FXML
    void vendedoresListarAction(ActionEvent event) {

    }
	
	public MainWindowController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
}
