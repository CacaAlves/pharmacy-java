package controller;

import view.PharmacyManager;
import view.ViewFactory;

public class AboutController extends BaseController {
	public AboutController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		super(pharmacyManager, viewFactory, fxmlName);
	}

	String fxmlName;
	
}
