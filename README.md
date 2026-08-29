Project Name: Naval Aviation Flight Operations Manager
https://youtu.be/gPUyp9vUREU
Project Description

The Naval Aviation Flight Operations Manager is a Java console application designed to simulate the management of naval aircraft and flight operations. The application allows users to add, view, update, and delete aircraft information using a SQLite database. It also demonstrates object-oriented programming concepts including inheritance, abstraction, polymorphism, composition, interfaces, constructors, and encapsulation.

Project Features
Add new aircraft records
View aircraft records
Update existing aircraft information
Delete aircraft records
Run aircraft missions
Launch and recover aircraft
Display aircraft and crew information
Store aircraft data using SQLite
Demonstrate multiple Java OOP concepts
Project Classes
NavalAviationApp – Main application and user menu
Aircraft – Abstract base class for naval aircraft
FighterAircraft – Represents an F/A-18E Super Hornet
E2DAircraft – Represents an E-2D Hawkeye
GrowlerAircraft – Represents an EA-18G Growler
FlightCrew – Stores flight crew information
FlightOperation – Demonstrates composition between aircraft and crew
FlightCapable – Interface defining launch and recovery behavior
DatabaseManager – Handles SQLite database connections and CRUD operations
Object-Oriented Programming Concepts

The project demonstrates:

Abstraction through the Aircraft abstract class
Inheritance through the aircraft subclasses
Polymorphism through overridden aircraft mission methods
Composition through the FlightOperation class
Interface through the FlightCapable interface
Encapsulation through private class fields and public methods
Constructors including overloaded constructors
Database

The application uses SQLite to store aircraft information.

The aircraft table includes:

Aircraft ID
Call Sign
Aircraft Type
Status
Mission

The application supports all four CRUD operations:

Create – Add an aircraft
Read – View aircraft
Update – Modify aircraft information
Delete – Remove an aircraft
Technologies Used
Java
SQLite
JDBC
Visual Studio Code
Git
GitHub
Development Process

The application was developed incrementally throughout the course. Each project phase added additional functionality, beginning with the basic application structure and progressing through object-oriented programming concepts and database integration.

How to Run
Clone the repository.
Open the project in Visual Studio Code.
Make sure Java is installed and configured.
Add the SQLite JDBC driver to the project.
Compile the Java files.
Run NavalAviationApp.java.
Follow the instructions displayed in the terminal.

The SQLite database file is created when the application is initialized.

Final Project Demonstration

The final demonstration shows the application running in the terminal and demonstrates the major features, including aircraft management, flight operations, object-oriented programming concepts, and SQLite CRUD functionality.

Project Summary

The Naval Aviation Flight Operations Manager brings together the Java programming concepts learned throughout the course into one practical application. I designed the project around naval aviation to create something realistic and personally meaningful while demonstrating how object-oriented programming and database functionality can work together. The final application provides a simple way to manage aircraft records and simulate basic flight operations through a terminal-based interface.

License

This project was created for educational and portfolio purposes.
