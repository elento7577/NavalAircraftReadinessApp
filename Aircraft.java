/**
 * Name: Elento Brent
 * Date: August 8, 2026
 * Purpose: Provides the base Aircraft class for the Naval Aviation
 * Flight Operations Manager. Stores common aircraft information
 * and provides methods for displaying that information.
 */

// BASE CLASS - used to demonstrate inheritance.
public class Aircraft {

    // Private fields demonstrate encapsulation.
    private int id;
    private String callSign;
    private String aircraftType;
    private String status;

    /**
     * Constructor for creating an Aircraft object.
     */
    public Aircraft(int id, String callSign, String aircraftType, String status) {
        this.id = id;
        this.callSign = callSign;
        this.aircraftType = aircraftType;
        this.status = status;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCallSign() {
        return callSign;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Displays the aircraft's information.
     */
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Call Sign: " + callSign);
        System.out.println("Aircraft Type: " + aircraftType);
        System.out.println("Status: " + status);
    }
}