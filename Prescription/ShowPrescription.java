package Prescription;

import Medication.Medication;

public class ShowPrescription extends Prescription {

    public ShowPrescription(int prescriptionId, Medication medication, int quantity) {
        super(prescriptionId, medication, quantity);
    }

    // Override displayDetails to provide custom behavior for BasicPrescription
    @Override
    public void displayDetails() {
        System.out.println("\nPrescription ID: " + prescriptionId);
        System.out.println("Quantity Prescribed: " + quantity);
        System.out.println("Stock Remaining: " + medication.getStockQuantity());
    }
}
