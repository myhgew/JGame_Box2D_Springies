package environment;

import jboxGlue.PhysicalObject;
import springies.Common;


public class WallRepulsion2 extends WallRepulsion {

    public WallRepulsion2 (String wallId, double magnitude, double exponent) {
        super(wallId, magnitude, exponent);
    }

    @Override
    public void setForce (PhysicalObject object) {
        object.setForce(-calculateForce(calculateDistance(object)), 0);

        // System.out.println("Calling WallRepulsion2 setForce!");
    }

    @Override
    public double calculateDistance (PhysicalObject object) {
        return (Common.WIDTH - Common.WALL_MARGIN - wallThickness - object.x);

    }

}
