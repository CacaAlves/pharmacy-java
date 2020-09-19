package view;

import model.Insumo;

public class PharmacyManager {
	
	public Insumo selectedInsumo = null;
	
	public PharmacyManager() {
		
	}

	public void setSelectedInsumo(Insumo insumo) {
		this.selectedInsumo = insumo;
	}
	
	public Insumo getSelectedInsumo() {
		return selectedInsumo;
	}
	
	
}
