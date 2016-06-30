/**
 * Created by Filip on 2016-06-29.
 *
 */
public class StaticFactoryMethodExample {

    public static void main(String [] args) {
        CameraMode Av = CameraMode.getAperturePriority(2.8);
    }
}
