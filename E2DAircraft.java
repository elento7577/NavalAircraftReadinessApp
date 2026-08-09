/**
 * Name: Elento Brent
 * Date: August 8, 2026
 * Purpose: Represents an E-2D Hawkeye used for airborne
 * early warning operations.
 */

// Inheritance: E2DAircraft extends Aircraft.
public class E2DAircraft extends Aircraft {

    private String radarStatus;

    public E2DAircraft(int id, String callSign,
                       String aircraftType, String status,
                       String mission, String radarStatus) {

        super(id, callSign, aircraftType, status, mission);
        this.radarStatus = radarStatus;
    }

    public String getRadarStatus() {
        return radarStatus;
    }

    public void setRadarStatus(String radarStatus) {
        this.radarStatus = radarStatus;
    }

    // Polymorphism: provides E-2D-specific mission behavior.
    @Override
    public void performMission() {

        System.out.println(getCallSign()
                + " is conducting an airborne early warning mission.");
    }

    @Override
    public void displayInfo() {

        super.displayInfo();
        System.out.println("Radar Status:    " + radarStatus);
    }
}