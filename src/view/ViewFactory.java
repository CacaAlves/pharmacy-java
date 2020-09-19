package view;

import java.io.IOException;
import java.util.List;

import controller.AboutController;
import controller.AdicionarSinonimoController;
import controller.AdicionarTelefoneFornecedorController;
import controller.BaseController;
import controller.ClientFormController;
import controller.ClientesListarController;
import controller.ConvenioFormController;
import controller.ConveniosListarController;
import controller.EscolherInsumosController;
import controller.EscreverBulaController;
import controller.EscreverDoseController;
import controller.FormulaFormController;
import controller.FormulasListarController;
import controller.FornecedorContatosController;
import controller.FornecedorFormController;
import controller.FornecedoresListarController;
import controller.InsumoFormController;
import controller.InsumosListarController;
import controller.LerBulaController;
import controller.LerPrescricaoController;
import controller.LoteFormController;
import controller.LotesListarController;
import controller.MainWindowController;
import controller.MedicoFormController;
import controller.MedicosListarController;
import controller.OrdemDeCompraFormController;
import controller.VendaFormController;
import controller.VendasListarController;
import controller.VendedorFormController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Formula;
import model.Fornecedor;
import model.Insumo;
import model.Venda;

public class ViewFactory {
	
	public PharmacyManager pharmacyManager;
	
	public ViewFactory(PharmacyManager pharmacyManager) {
		this.pharmacyManager = pharmacyManager;
	}

	public void showMainWindow() {
		BaseController controller = new MainWindowController(pharmacyManager, this, "MainWindow.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showClientForm() {
		BaseController controller = new ClientFormController(pharmacyManager, this, "ClienteForm.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showFormulaForm() {
		BaseController controller = new FormulaFormController(pharmacyManager, this, "FormulaForm.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showFormulaForm(Formula formula) {
		BaseController controller = new FormulaFormController(pharmacyManager, this, "FormulaForm.fxml");
		((FormulaFormController) controller).setFormula(formula);
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showEscreverDose() {
		BaseController controller = new EscreverDoseController(pharmacyManager, this, "EscreverHtmlDocument.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showEscreverBula() {
		BaseController controller = new EscreverBulaController(pharmacyManager, this, "EscreverHtmlDocument.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showVendaForm() {
		BaseController controller = new VendaFormController(pharmacyManager, this, "VendaForm.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showVendaForm(Venda venda) {
		BaseController controller = new VendaFormController(pharmacyManager, this, "VendaForm.fxml");
		((VendaFormController) controller).setVenda(venda);
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showVendedorForm() {
		BaseController controller = new VendedorFormController(pharmacyManager, this, "VendedorForm.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showConvenioForm() {
		BaseController controller = new ConvenioFormController(pharmacyManager, this, "ConvenioForm.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	
	public void showEscolherInsumos() {
		BaseController controller = new EscolherInsumosController(pharmacyManager, this, "EscolherInsumos.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showFornecedorForm() {
		BaseController controller = new FornecedorFormController(pharmacyManager, this, "FornecedorForm.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showAdicionarTelefoneFornecedor() {
		BaseController controller = new AdicionarTelefoneFornecedorController(pharmacyManager, this, "AdicionarTelefoneFornecedor.fxml");
		initializeStage(controller);
	}
	
	
	public void showInsumoForm() {
		BaseController controller = new InsumoFormController(pharmacyManager, this, "InsumoForm.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	
	public void showLoteForm() {
		BaseController controller = new LoteFormController(pharmacyManager, this, "LoteForm.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showLerBula(Insumo insumo) {
		BaseController controller = new LerBulaController(pharmacyManager, this, "LerHtmlDocument.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showLerPrescicao(Formula formula) {
		BaseController controller = new LerPrescricaoController(pharmacyManager, this, "LerHtmlDocument.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showMedicoForm() {
		BaseController controller = new MedicoFormController(pharmacyManager, this, "MedicoForm.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showAdicionarSinonimo(List<String> sinonimos) {
		BaseController controller = new AdicionarSinonimoController(pharmacyManager, this, "AdicionarSinonimo.fxml", sinonimos);
		initializeStage(controller);
	}
	
	public void showOrdemDeCompraForm() {
		BaseController controller = new OrdemDeCompraFormController(pharmacyManager, this, "OrdemDeCompraForm.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showAbout() {
		BaseController controller = new AboutController(pharmacyManager, this, "About.fxml");
		initializeStage(controller);
	}
	
	public void showVendasListar() {
		BaseController controller = new VendasListarController(pharmacyManager, this, "VendasListar.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showMedicosListar() {
		BaseController controller = new MedicosListarController(pharmacyManager, this, "MedicosListar.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	public void showFornecedoresListar() {
		BaseController controller = new FornecedoresListarController(pharmacyManager, this, "FornecedoresListar.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showLotesListar() {
		BaseController controller = new LotesListarController(pharmacyManager, this, "LotesListar.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showClientesListar() {
		BaseController controller = new ClientesListarController(pharmacyManager, this, "ClientesListar.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showConveniosListar() {
		BaseController controller = new ConveniosListarController(pharmacyManager, this, "ConveniosListar.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showInsumosListar() {
		BaseController controller = new InsumosListarController(pharmacyManager, this, "InsumosListar.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showInsumosListar(Formula formula) {
		BaseController controller = new InsumosListarController(pharmacyManager, this, "InsumosListar.fxml");
		((InsumosListarController) controller).setFormula(formula);
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showFormulasListar() {
		BaseController controller = new FormulasListarController(pharmacyManager, this, "FormulasListar.fxml");
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showFormulasListar(List<Formula> formulas) {
		BaseController controller = new FormulasListarController(pharmacyManager, this, "FormulasListar.fxml");
		((FormulasListarController) controller).setFormulas(formulas);
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	public void showFornecedorContatos(Fornecedor fornecedor) {
		BaseController controller = new FornecedorContatosController(pharmacyManager, this, "FornecedorContatos.fxml");
		((FornecedorContatosController) controller).setFornecedor(fornecedor);
		Stage stage = initializeStage(controller);
		stage.setMaximized(true);
	}
	
	private Stage initializeStage(BaseController controller) {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setController(controller);
		fxmlLoader.setLocation(getClass().getResource(controller.getFxmlName()));
		Parent parent;
		try {
			parent = fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
		Scene scene = new Scene(parent);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
		return stage;
	}
	
	public void closeStage(Stage stage) {
		stage.close();
	}



}
