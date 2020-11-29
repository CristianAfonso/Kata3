package kata3;

public class Kata3 {

    public static void main(String[] args) {
           Histogram<String> histo = new Histogram<>();
           histo.increment("gmail.com");
           histo.increment("gmail.com");
           histo.increment("gmail.com");
           histo.increment("gmail.es");
           new HistogramDisplay(histo).execute();
    }
    
}
