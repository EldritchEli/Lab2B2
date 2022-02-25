package Model.CarClasses;

public interface HasFlatbed {

    void incrementFlatbed ();

    /***
     * Decreases the angle of the Flatbed by incDecSpeed.
     */
    void decrementFlatbed ();

    /***
     * returns the Flatbeds current Angle.
     */
    double getFlatbedAngle ();

    void setFlatbedAngle(double angle);
}