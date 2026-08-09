/**
 * Name: Elento Brent
 * Date: August 8, 2026
 * Purpose: Represents an F/A-18E Super Hornet and demonstrates
 * inheritance and polymorphism.
 */

// Inheritance: FighterAircraft extends Aircraft.
public class FighterAircraft extends Aircraft {

    private String weaponLoadout;

    public FighterAircraft(int id, String callSign,
                           String aircraftType, String status,
                           String mission, String weaponLoadout) {

        super(id, callSign, aircraftType, status, mission);
        this.weaponLoadout = weaponLoadout;
    }

    public String getWeaponLoadout() {
        return weaponLoadout;
    }

    public void setWeaponLoadout(String weaponLoadout) {
        this.weaponLoadout = weaponLoadout;
    }

    // Polymorphism: overrides the abstract method from Aircraft.
    @Override
    public void performMission() {

        System.out.println(getCallSign()
                + " is conducting a Combat Air Patrol mission.");
    }

    @Override
    public void displayInfo() {

        super.displayInfo();
        System.out.println("Weapon Loadout: " + weaponLoadout);
    }
}