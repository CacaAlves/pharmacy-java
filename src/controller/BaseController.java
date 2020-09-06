package controller;

import view.PharmacyManager;
import view.ViewFactory;

public class BaseController {
	protected PharmacyManager pharmacyManager;
	protected ViewFactory viewFactory;
	protected String fxmlName;
	
	public BaseController(PharmacyManager pharmacyManager, ViewFactory viewFactory, String fxmlName) {
		this.pharmacyManager = pharmacyManager;
		this.viewFactory = viewFactory;
		this.fxmlName = fxmlName;
	}
	
	public String getFxmlName() {
		return this.fxmlName;
	}
}
