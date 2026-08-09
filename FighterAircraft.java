/**
 * Name: Elento Brent
 * Date: August 8, 2026
 * Purpose: Defines a fighter aircraft that inherits common
 * information from the Aircraft base class and adds
 * fighter-specific mission information.
 */

// CHILD CLASS - demonstrates inheritance from Aircraft.
public class FighterAircraft extends Aircraft {

    private String mission;

    /**
     * Constructor for creating a FighterAircraft object.
     */
    public FighterAircraft(int id, String callSign, String aircraftType,
                           String status, String mission) {

        // Calls the constructor of the parent Aircraft class.
        super(id, callSign, aircraftType, status);

        this.mission = mission;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    /**
     * Displays the fighter aircraft's information.
     */
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mission: " + mission);
    }
}