/**
 * Created by Filip on 2016-06-29.
 *
 * Lets simplify that camera set exposure based only on Aperture and Shutter Time
 * Instead of creating constructors for each mode, I used Static Factory Methods
 */
public class CameraMode {

    public static CameraMode getAperturePriority(double aperture) {
        System.out.println("Camera Mode: Aperture priority.");
        return new CameraMode(aperture, countShutterTime(aperture));
    }

    public static CameraMode getShutterPriority(double shutterTime) {
        System.out.println("Camera Mode: Shutter priority.");
        return new CameraMode(countAperture(shutterTime), shutterTime);
    }

    private CameraMode(double aperture, double shutterTime) {
        System.out.println("Aperture: "+aperture + " Shutter Time:" + shutterTime);
    }

    private static double countShutterTime(double aperture) {
        double shutter = 0;
        //count proper shutter time for this apperture
        return shutter;
    }

    private static double countAperture(double shutterTime) {
        double aperture=0;
        //count aperture
        return aperture;
    }


}
