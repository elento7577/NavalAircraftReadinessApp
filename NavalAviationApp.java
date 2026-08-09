/**
 * Name: Elento Brent
 * Date: August 8, 2026
 * Purpose: Main application for the Naval Aviation Flight
 * Operations Manager. Demonstrates inheritance, polymorphism,
 * composition, constructors, and terminal input/output.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class NavalAviationApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =====================================================
        // PROJECT INFORMATION
        // =====================================================

        System.out.println();
        System.out.println("========================================================");
        System.out.println("       NAVAL AVIATION FLIGHT OPERATIONS MANAGER");
        System.out.println("                    PROJECT WEEK 2");
        System.out.println("========================================================");
        System.out.println("Created by: Elento Brent");
        System.out.println();

        System.out.println("Welcome to the Naval Aviation Flight Operations Manager!");
        System.out.println();
        System.out.println("This application manages aircraft and flight operations");
        System.out.println("aboard a naval aircraft carrier.");
        System.out.println();

        // =====================================================
        // CREATE AIRCRAFT OBJECTS
        // =====================================================

        FighterAircraft fighter = new FighterAircraft(
                1,
                "Viper 01",
                "F/A-18E Super Hornet",
                "READY",
                "Combat Air Patrol",
                "Training Loadout"
        );

        E2DAircraft hawkeye = new E2DAircraft(
                2,
                "Tiger 02",
                "E-2D Hawkeye",
                "AIRBORNE",
                "Airborne Early Warning",
                "OPERATIONAL"
        );

        GrowlerAircraft growler = new GrowlerAircraft(
                3,
                "Raven 03",
                "EA-18G Growler",
                "MAINTENANCE",
                "Electronic Warfare",
                "STANDBY"
        );

        // =====================================================
        // POLYMORPHISM DEMONSTRATION
        // =====================================================

        // All three objects are stored as Aircraft references.
        ArrayList<Aircraft> aircraftList = new ArrayList<>();

        aircraftList.add(fighter);
        aircraftList.add(hawkeye);
        aircraftList.add(growler);

        System.out.println();
        System.out.println("=============== AIRCRAFT MISSIONS ===============");

        for (Aircraft aircraft : aircraftList) {

            // Polymorphism: Java calls the correct overridden
            // performMission() method for each aircraft.
            aircraft.performMission();
        }

        // =====================================================
        // COMPOSITION DEMONSTRATION
        // =====================================================

        FlightCrew crew = new FlightCrew(
                101,
                "Viper Flight Crew",
                "Fighter Squadron"
        );

        FlightOperation operation = new FlightOperation(
                fighter,
                crew,
                "Carrier Flight Operation",
                "READY"
        );

        operation.displayOperation();

        // =====================================================
        // DATABASE MANAGER
        // =====================================================

        DatabaseManager database = new DatabaseManager(
                "naval_aviation.db"
        );

        System.out.println();
        System.out.println("Database: " + database.getDatabaseName());

        // =====================================================
        // USER MENU
        // =====================================================

        int choice;

        do {

            System.out.println();
            System.out.println("================================================");
            System.out.println("                  MAIN MENU");
            System.out.println("================================================");
            System.out.println("1. View All Aircraft");
            System.out.println("2. View Flight Operation");
            System.out.println("3. Run Aircraft Missions");
            System.out.println("4. Launch Fighter");
            System.out.println("5. Recover Fighter");
            System.out.println("6. Exit");
            System.out.println("================================================");

            System.out.print("Enter your selection: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.println();
                    System.out.println("=============== AIRCRAFT STATUS ===============");

                    for (Aircraft aircraft : aircraftList) {

                        aircraft.displayInfo();
                    }

                    break;

                case 2:

                    operation.displayOperation();

                    break;

                case 3:

                    System.out.println();
                    System.out.println("=============== MISSION STATUS ===============");

                    for (Aircraft aircraft : aircraftList) {

                        aircraft.performMission();
                    }

                    break;

                case 4:

                    System.out.println();
                    System.out.println("Launching fighter aircraft...");

                    operation.launchAircraft();

                    break;

                case 5:

                    System.out.println();
                    System.out.println("Recovering fighter aircraft...");

                    operation.recoverAircraft();

                    break;

                case 6:

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
                    System.out.println("Please select an option from 1 through 6.");
            }

        } while (choice != 6);

        input.close();
    }
}