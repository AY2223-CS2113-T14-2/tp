package bagpacker.iohandler;

import bagpacker.commands.AddCommand;
import bagpacker.commands.ByeCommand;
import bagpacker.commands.DeleteCommand;
import bagpacker.commands.ListCommand;
import bagpacker.commands.PackCommand;

/**
 * Ui class contains methods to print messages to user interface on Command Line Interface
 */
public class Ui {
    public static String logo = " ____              _____           _\n"
            + "|  _ \\            |  __ \\         | |\n"
            + "| |_) | __ _  __ _| |__) |_ _  ___| | _____ _ __\n"
            + "|  _ < / _` |/ _` |  ___/ _` |/ __| |/ / _ \\ '__|\n"
            + "| |_) | (_| | (_| | |  | (_| | (__|   <  __/ |\n"
            + "|____/ \\__,_|\\__, |_|   \\__,_|\\___|_|\\_\\___|_|\n"
            + "              __/ |\n"
            + "             |___/\n";
    public static void printErrorLine() {
        System.out.println("/////////////////////////////////////////////////////////////");
    }
    public static void printLine() {
        System.out.println("____________________________________________________________");
    }
    /**
     * Prints initialising Message
     */
    public static void initialMessage(){
        printLine();
        System.out.println("Hi this is,\n" + logo);
        System.out.println("Enter \"help\" to find out how to use BagPacker");
        printLine();
    }
    /**
     * Prints goodbye Message
     */
    public static void goodbyeMessage(){
        printLine();
        System.out.println("Bye thanks for using,\n" + logo);
        printLine();
    }

    /**
     * Prints Error Message with the type of error and a helping message
     *
     * @param errorType the type of error (e.g. invalid integer input)
     * @param helpMessage a message to help the user (e.g. try to input a whole number digit)
     */
    public static void errorMessage(String errorType, String helpMessage) {
        printErrorLine();
        System.out.print("Error " + errorType);
        System.out.println(":\n" + helpMessage);
        printErrorLine();
    }

    /**
     * Prints help message
     */
    public static void helpMessage() {
        printLine();
        System.out.println("All Commands:");
        System.out.println("1. " + AddCommand.HELP_MSG);
        System.out.println("2. " + DeleteCommand.HELP_MSG);
        System.out.println("3. " + ListCommand.HELP_MSG);
        System.out.println("4. " + PackCommand.HELP_MSG);
        System.out.println("5. " + ByeCommand.HELP_MSG);
        printLine();
    }

    /**
     * Prints messages(s) to the user
     * @param message
     */
    public static void printToUser(String... message) {
        printLine();
        for (String m : message) {
            System.out.println(m);
        }
        printLine();
    }
}
