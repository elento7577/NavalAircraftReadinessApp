/**
 * Name: Elento Brent
 * Date: August 8, 2026
 * Purpose: Abstract base class containing common information
 * and behavior for naval aircraft.
 */

// Abstract class demonstrating abstraction and inheritance.
public abstract class Aircraft implements FlightCapable {

    private int id;
    private String callSign;
    private String aircraftType;
    private String status;
    private String mission;

    public Aircraft(int id, String callSign, String aircraftType,
                    String status, String mission) {

        this.id = id;
        this.callSign = callSign;
        this.aircraftType = aircraftType;
        this.status = status;
        this.mission = mission;
    }

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

    public String getMission() {
        return mission;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    // Each aircraft type will provide its own mission behavior.
    public abstract void performMission();

    @Override
    public void launch() {
        status = "AIRBORNE";
        System.out.println(callSign + " has launched from the carrier.");
    }

    @Override
    public void recover() {
        status = "READY";
        System.out.println(callSign + " has recovered aboard the carrier.");
    }

    public void displayInfo() {

        System.out.println("--------------------------------------------");
        System.out.println("ID:             " + id);
        System.out.println("Call Sign:      " + callSign);
        System.out.println("Aircraft Type:  " + aircraftType);
        System.out.println("Status:         " + status);
        System.out.println("Mission:        " + mission);
        System.out.println("--------------------------------------------");
    }
}