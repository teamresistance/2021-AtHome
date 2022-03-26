package frc.robot.Subsystem.drive.trajFunk;

import frc.robot.Subsystem.ballHandler.Snorfler;

/**
 * This TrajFunction controls the Snorfler.
 */
public class SnorfDrvAuto extends ATrajFunction {

    private boolean snorfEna = false;

    /**
     * Constructor to control the Snorfler
     * @param _snorfEna lower snorfler and start sucking up balls
     */
    public SnorfDrvAuto(boolean _snorfEna) {
        snorfEna = _snorfEna;
    }

    public void execute() {
        switch (state) {
        case 0: // set Snorfler control
            Snorfler.reqsnorfDrvAuto = snorfEna;
            state++;
            System.out.println("Snf - 0: ---------- Init -----------");
        case 1:
            setDone();
            System.out.println("Snf - 1: ---------- Done -----------");
            break;
        default:
            setDone();
            System.out.println("Snf - Dflt: ------  Bad state  ----");
            break;
        }
    }
}
