package seedu.duke;

/**
 * Duke is running Fintrackpro, a CLI program that helps users
 * estimate savings required for their share of a BTO downpayment.
 */
public class Duke {

    /**
     * Runs the Duke program which runs Fintrackpro
     */
    public static void main(String[] args){
        new FinTrackPro().run();
    }
}
