public class AudioBook extends Title{
    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
            this.durationInMinutes = durationInMinutes;


    }

    @Override
    public double calculatePoints() {
        return durationInMinutes * calculateLiteraturePoints() * copies;
    }
    @Override
    public double calculateLiteraturePoints() {
        double value;
        switch (literatureType) {
            case "BE": return value = 1.5;

            case "TE": return value = 1.5;

            case "LYRIK": return value = 6;

            case " SKØN": return value = 0.85;

            case "FAG": return value = 0.5;

            default: return value = 0;
        }
    }
}
