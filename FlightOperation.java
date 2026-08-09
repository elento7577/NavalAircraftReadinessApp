/**
 * Name: Elento Brent
 * Date: August 8, 2026
 * Purpose: Represents a naval aviation flight operation.
 * Demonstrates composition by containing Aircraft and
 * FlightCrew objects.
 */

public class FlightOperation {

    // COMPOSITION: FlightOperation HAS-A Aircraft.
    private Aircraft aircraft;

    // COMPOSITION: FlightOperation HAS-A FlightCrew.
    private FlightCrew crew;

    private String operationName;
    private String operationStatus;

    public FlightOperation(Aircraft aircraft,
                           FlightCrew crew,
                           String operationName,
                           String operationStatus) {

        this.aircraft = aircraft;
        this.crew = crew;
        this.operationName = operationName;
        this.operationStatus = operationStatus;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public FlightCrew getCrew() {
        return crew;
    }

    public String getOperationName() {
        return operationName;
    }

    public String getOperationStatus() {
        return operationStatus;
    }

    public void updateOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    public void launchAircraft() {

        aircraft.launch();
        operationStatus = "AIRBORNE";
    }

    public void recoverAircraft() {

        aircraft.recover();
        operationStatus = "COMPLETE";
    }

    public void displayOperation() {

        System.out.println();
        System.out.println("==============================================");
        System.out.println("             FLIGHT OPERATION");
        System.out.println("==============================================");

        System.out.println("Operation: " + operationName);
        System.out.println("Status:    " + operationStatus);
        System.out.println();

        System.out.println("AIRCRAFT");
        System.out.println("Call Sign: " + aircraft.getCallSign());
        System.out.println("Type:      " + aircraft.getAircraftType());
        System.out.println("Status:    " + aircraft.getStatus());
        System.out.println("Mission:   " + aircraft.getMission());

        System.out.println();

        System.out.println("CREW");
        crew.displayCrew();

        System.out.println("==============================================");
    }
}