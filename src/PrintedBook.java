public class PrintedBook extends Title{
private int pages;

public PrintedBook(String title, String literatureType, int copies, int pages) {
    super(title, literatureType, copies);
    this.pages = pages;


}

    @Override
    public double calculatePoints() {
        return pages * calculateLiteraturePoints() * copies;
    }
    @Override
    public double  calculateLiteraturePoints() {
    double value;
    switch (literatureType) {
        case "BI": return value = 3;

        case "TE": return value = 3;

        case "LYRIK": return value = 6;

        case " SKØN": return value = 1.7;

        case "FAG": return value = 1;

        default: return value = 0;
    }
    }
}
