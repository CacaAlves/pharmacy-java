package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.HTMLEditor;
import javafx.scene.web.WebView;
import view.PharmacyManager;
import view.ViewFactory;

public class LerBulaController extends BaseController implements Initializable {

	@FXML
    private WebView lerBulaWebView;
	
	public LerBulaController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}

	private void getWebViewContent() {
		HTMLEditor htmlEditor = pharmacyManager.getSelectedInsumo().getBula();
		this.lerBulaWebView.getEngine().loadContent(htmlEditor.getHtmlText());
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		getWebViewContent();
	}

}
