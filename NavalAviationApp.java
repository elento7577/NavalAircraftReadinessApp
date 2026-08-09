/**
 * Name: Elento Brent
 * Date: August 8, 2026
 * Purpose: Main application for Project Week 1.
 * Provides terminal input/output and demonstrates
 * inheritance and composition using naval aviation classes.
 */

import java.util.Scanner;

public class NavalAviationApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =====================================================
        // PROJECT WEEK 1 STARTUP SCREEN
        // =====================================================

        System.out.println();
        System.out.println("========================================================");
        System.out.println("       NAVAL AVIATION FLIGHT OPERATIONS MANAGER");
        System.out.println("                    PROJECT WEEK 1");
        System.out.println("========================================================");
        System.out.println("Created by: Elento Brent");
        System.out.println();

        System.out.println("Welcome to the Naval Aviation Flight Operations Manager!");
        System.out.println();
        System.out.println("This application demonstrates the management of");
        System.out.println("aircraft and flight operations aboard a naval carrier.");
        System.out.println();
        System.out.println("Use the numbered menu options to navigate the system.");
        System.out.println();

        System.out.println("Press ENTER to continue...");
        input.nextLine();

        // =====================================================
        // INHERITANCE DEMONSTRATION
        // =====================================================

        // FighterAircraft inherits from the Aircraft class.
        FighterAircraft fighter = new FighterAircraft(
                1,
                "Viper 01",
                "F/A-18E Super Hornet",
                "READY",
                "Combat Air Patrol"
        );

        // =====================================================
        // COMPOSITION DEMONSTRATION
        // =====================================================

        // FlightOperation contains a FighterAircraft object.
        FlightOperation operation = new FlightOperation(
                fighter,
                "Carrier Flight Operation",
                "Viper Flight Crew"
        );

        // =====================================================
        // DISPLAY INITIAL AIRCRAFT
        // =====================================================

        System.out.println();
        System.out.println("================ AIRCRAFT STATUS ================");
        fighter.displayInfo();
        System.out.println("==================================================");

        operation.displayOperation();

        // =====================================================
        // MAIN MENU
        // =====================================================

        int choice;

        do {

            System.out.println();
            System.out.println("==================== MAIN MENU ====================");
            System.out.println();
            System.out.println("1. View Aircraft");
            System.out.println("2. View Flight Operation");
            System.out.println("3. Update Aircraft Status");
            System.out.println("4. Exit");
            System.out.println();
            System.out.println("====================================================");

            System.out.print("Enter your selection: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.println();
                    System.out.println("============== AIRCRAFT INFORMATION ==============");

                    fighter.displayInfo();

                    System.out.println("====================================================");

                    break;

                case 2:

                    operation.displayOperation();

                    break;

                case 3:

                    System.out.println();
                    System.out.println("Current Status: " + fighter.getStatus());

                    System.out.print("Enter new status: ");

                    input.nextLine();
                    String newStatus = input.nextLine();

                    fighter.setStatus(newStatus);

                    System.out.println();
                    System.out.println("Aircraft status successfully updated.");
                    System.out.println("New Status: " + fighter.getStatus());

                    break;

                case 4:

                    System.out.println();
                    System.out.println("Thank you for using the");
                    System.out.println("Naval Aviation Flight Operations Manager.");
                    System.out.println();
                    System.out.println("Flight operations complete.");
                    System.out.println("Exiting system...");

                    break;

                default:

                    System.out.println();
                    System.out.println("Invalid selection.");
                    System.out.println("Please select an option from 1 through 4.");

                    break;
            }

        } while (choice != 4);

        input.close();
    }
}

