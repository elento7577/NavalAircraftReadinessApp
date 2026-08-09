/**
 * Name: Elento Brent
 * Date: August 8, 2026
 * Purpose: Represents a naval aviation flight operation.
 * This class demonstrates composition by containing an
 * Aircraft object.
 */

public class FlightOperation {

    // COMPOSITION - FlightOperation contains an Aircraft object.
    private Aircraft aircraft;

    private String operationName;
    private String crewName;

    /**
     * Constructor for creating a FlightOperation object.
     */
    public FlightOperation(Aircraft aircraft, String operationName,
                           String crewName) {

        this.aircraft = aircraft;
        this.operationName = operationName;
        this.crewName = crewName;
    }

    /**
     * Displays flight operation information.
     */
    public void displayOperation() {

        System.out.println();
        System.out.println("==============================================");
        System.out.println("             FLIGHT OPERATION");
        System.out.println("==============================================");

        System.out.println("Operation: " + operationName);
        System.out.println("Crew: " + crewName);
        System.out.println("Aircraft: " + aircraft.getCallSign());
        System.out.println("Aircraft Type: " + aircraft.getAircraftType());
        System.out.println("Status: " + aircraft.getStatus());

        System.out.println("==============================================");
    }
}