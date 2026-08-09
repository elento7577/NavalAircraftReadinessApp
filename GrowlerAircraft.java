/**
 * Name: Elento Brent
 * Date: August 8, 2026
 * Purpose: Represents an EA-18G Growler used for electronic
 * warfare operations.
 */

// Inheritance: GrowlerAircraft extends Aircraft.
public class GrowlerAircraft extends Aircraft {

    private String electronicWarfareStatus;

    public GrowlerAircraft(int id, String callSign,
                           String aircraftType, String status,
                           String mission, String electronicWarfareStatus) {

        super(id, callSign, aircraftType, status, mission);
        this.electronicWarfareStatus = electronicWarfareStatus;
    }

    public String getElectronicWarfareStatus() {
        return electronicWarfareStatus;
    }

    public void setElectronicWarfareStatus(String electronicWarfareStatus) {
        this.electronicWarfareStatus = electronicWarfareStatus;
    }

    // Polymorphism: provides Growler-specific mission behavior.
    @Override
    public void performMission() {

        System.out.println(getCallSign()
                + " is conducting an electronic warfare mission.");
    }

    @Override
    public void displayInfo() {

        super.displayInfo();
        System.out.println("EW Status:       " + electronicWarfareStatus);
    }
}