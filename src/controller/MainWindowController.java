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
    	viewFactory.showAbout();
    }

    @FXML
    void clienteRegistrarAction(ActionEvent event) {
    	viewFactory.showClientForm();
    }
    
    @FXML
    void clientesListarAction(ActionEvent event) {
    	viewFactory.showClientesListar();
    }

    @FXML
    void convenioRegistrarAction(ActionEvent event) {
    	viewFactory.showConvenioForm();
    }

    @FXML
    void conveniosListarAction(ActionEvent event) {
    	viewFactory.showConveniosListar();
    }

    @FXML
    void formulasListarAction(ActionEvent event) {
    	viewFactory.showFormulasListar();
    }	

    @FXML
    void fornecedorRegistrarAction(ActionEvent event) {
    	viewFactory.showFornecedorForm();
    }

    @FXML
    void fornecedoresListarAction(ActionEvent event) {
    	viewFactory.showFornecedoresListar();
    }

    @FXML
    void insumoRegistrarAction(ActionEvent event) {
    	viewFactory.showInsumoForm();
    }

    @FXML
    void insumosListarAction(ActionEvent event) {
    	viewFactory.showInsumosListar();
    }

    @FXML
    void loteRegistrarAction(ActionEvent event) {
    	viewFactory.showLoteForm();
    }

    @FXML
    void lotesListarAction(ActionEvent event) {
    	viewFactory.showLotesListar();
    }

    @FXML
    void medicoRegistrarAction(ActionEvent event) {
    	viewFactory.showMedicoForm();
    }

    @FXML
    void medicosListarAction(ActionEvent event) {
    	viewFactory.showMedicosListar();
    }

    @FXML
    void ordemDeCompraRegistrarAction(ActionEvent event) {
    	viewFactory.showOrdemDeCompraForm();
    }

    @FXML
    void ordensDeCompraListarAction(ActionEvent event) {

    }

    @FXML
    void vendaRegistrarAction(ActionEvent event) {
    	viewFactory.showVendaForm();
    }

    @FXML
    void vendasListarAction(ActionEvent event) {
    	viewFactory.showVendasListar();
    }

    @FXML
    void vendedorRegistrarAction(ActionEvent event) {
    	viewFactory.showVendedorForm();
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
