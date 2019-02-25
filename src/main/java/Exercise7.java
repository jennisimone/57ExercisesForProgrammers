public class Exercise7 {

    public String getArea(int length, int width) {

        int feet = length * width;
        final double conversion = feet * 0.09290304;
        String metres = String.format("%.3f", conversion);

        return "The area is\n" +
                feet + " square feet\n" +
                metres + " square meters";
    }
}
