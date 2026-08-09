/**
 * Name: Elento Brent
 * Date: August 8, 2026
 * Purpose: Represents the crew assigned to a naval aviation
 * flight operation.
 */

public class FlightCrew {

    private int crewId;
    private String crewName;
    private String role;

    public FlightCrew(int crewId, String crewName, String role) {

        this.crewId = crewId;
        this.crewName = crewName;
        this.role = role;
    }

    public int getCrewId() {
        return crewId;
    }

    public String getCrewName() {
        return crewName;
    }

    public String getRole() {
        return role;
    }

    public void displayCrew() {

        System.out.println("Crew ID:       " + crewId);
        System.out.println("Crew Name:     " + crewName);
        System.out.println("Role:          " + role);
    }
}