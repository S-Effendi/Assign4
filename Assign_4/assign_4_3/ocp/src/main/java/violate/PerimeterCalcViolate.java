package violate;

/**
 * Created by S.Effendi on 2017/03/29.
 */
public class PerimeterCalcViolate {

    public int perimeter(Object building) {
        int perimeter = 0;

        if (building.getClass() == RectangleViolate.class) {
            RectangleViolate recBuild = (RectangleViolate) building;
            perimeter = (recBuild.getLength() + recBuild.getBreadth()) * 2;
        } else {

            TriangleViolate triBuild = (TriangleViolate) building;
            perimeter = triBuild.getLength() + triBuild.getBreadth() + triBuild.getHeight();
        }

        return perimeter;
    }
}