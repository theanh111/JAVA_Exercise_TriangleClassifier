public class TriangleClassifier {
    public static String checkTriangleSide(int firstSide, int secondSide, int thirdSide) {
        if (firstSide < 0 || secondSide < 0 || thirdSide < 0) {
            return "Không phải là tam giác";
        } else if (firstSide + secondSide > thirdSide
                || thirdSide + secondSide > firstSide
                || firstSide + thirdSide > secondSide) {
            return "Không phải là tam giác";
        } else if (firstSide == secondSide && secondSide == thirdSide) {
            return "Tam giác đều";
        } else if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {
            return "Tam giác cân";
        } else {
            return "Tam giác thường";
        }
    }
}
