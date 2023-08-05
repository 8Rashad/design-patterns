package singleton;

import singleton.Logger;

public class Main {
    public static void main(String[] args) {

        var logger = Logger.getInstance();

        logger.log("Application started:");
        logger.log("Processing data...");
        logger.log("Application finished.");

    }
}