
public class Main {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(2, 3, 4, 5, 6, 7, 6);
        new ConsoleHistogramDisplay().show(histogram);
    }
}
