package controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Formula;
import model.Venda;
import view.PharmacyManager;
import view.ViewFactory;

public class FormulasListarController extends BaseController implements Initializable {
	
	@FXML
	private TableView<Formula> formulasTableView;

	@FXML
	private TableColumn<?, ?> idTableColumn;

	@FXML
	private TableColumn<?, ?> dataDePrescricaoTableColumn;

	@FXML
	private TableColumn<?, ?> usoProlongadoTableColumn;

	@FXML
	private TableColumn<?, ?> medicoTableColumn;

	@FXML
	private TableColumn<?, ?> inscricaoEstadualTableColumn;

	private MenuItem showPrescicaoMenuItem = new MenuItem("ver prescicao");
	
	private MenuItem editarMenuItem = new MenuItem("editar");
	
	private MenuItem showInsumosMenuItem = new MenuItem("mostrar insumos");
	
	private List<Formula> formulas = null;

	private Formula formulaSelecionada = null;
	
	public FormulasListarController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}
	
	public void setFormulas(List<Formula> formulas) {
		this.formulas = formulas;
	}
	
	private void setUpContextMenus() {
		showPrescicaoMenuItem.setOnAction(e -> {
			viewFactory.showLerPrescicao(formulaSelecionada);
		});
		
		showInsumosMenuItem.setOnAction(e -> {
			viewFactory.showInsumosListar(formulaSelecionada);
		});
		
		editarMenuItem.setOnAction(e -> {
			viewFactory.showFormulaForm(formulaSelecionada);
		});
	}
	
	private void setUpVendasTableView() {
//		senderCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("sender"));
//		subjectCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("subject"));
//		recipientCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("recipient"));
//		sizeCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, SizeInteger>("size"));
//		dateCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, Date>("date"));
		
		formulasTableView.setContextMenu(new ContextMenu(showPrescicaoMenuItem, showInsumosMenuItem, editarMenuItem));
	}

	private void setUpMessageSelection() {
		formulasTableView.setOnMouseClicked(e -> {
			Formula formula = formulasTableView.getSelectionModel().getSelectedItem();
			if (formula != null) {
				this.formulaSelecionada = formula;
			}
		});
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		setUpContextMenus();
		setUpVendasTableView();
		setUpMessageSelection();
	}

}
