package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Venda;
import view.PharmacyManager;
import view.ViewFactory;

public class VendasListarController extends BaseController implements Initializable {

	@FXML
	private TableView<Venda> vendasTableView;

	@FXML
	private TableColumn<?, ?> idTableColumn;

	@FXML
	private TableColumn<?, ?> dataDeVendaTableColumn;

	@FXML
	private TableColumn<?, ?> clienteRgTableColumn;

	@FXML
	private TableColumn<?, ?> vendedorRgTableColumn;

	private Venda vendaSelecionada = null;

	private MenuItem showFormulasMenuItem = new MenuItem("mostrar formulas");

	private MenuItem editarMenuItem = new MenuItem("editar");

	public VendasListarController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}

	private void setUpContextMenus() {
		showFormulasMenuItem.setOnAction(e -> {
			viewFactory.showFormulasListar(vendaSelecionada.getFormulas());
		});

		editarMenuItem.setOnAction(e -> {
			viewFactory.showVendaForm(vendaSelecionada);
		});
	}

	private void setUpVendasTableView() {
//		senderCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("sender"));
//		subjectCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("subject"));
//		recipientCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, String>("recipient"));
//		sizeCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, SizeInteger>("size"));
//		dateCol.setCellValueFactory(new PropertyValueFactory<EmailMessage, Date>("date"));

		vendasTableView.setContextMenu(new ContextMenu(showFormulasMenuItem, editarMenuItem));
	}

	private void setUpMessageSelection() {
		vendasTableView.setOnMouseClicked(e -> {
			Venda venda = vendasTableView.getSelectionModel().getSelectedItem();
			if (venda != null) {
				this.vendaSelecionada = venda;
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
