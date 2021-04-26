public enum StatisticsMultiplier {
    EASY(0.75),
    MEDIUM(1),
    HIGH(1.25);

    private final double multiplier;

    StatisticsMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier(){
        return this.multiplier;
    }
}
