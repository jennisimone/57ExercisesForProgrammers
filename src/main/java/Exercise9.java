class Exercise9 {
    int calculateNumberOfPaintCans(int length, int width) {
        final double CONVERSION_RATE = length * width / 350.0;

        return (int)Math.ceil(CONVERSION_RATE);
    }
}
