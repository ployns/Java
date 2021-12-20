public class Lab01 {

    public static void main(String[] args) {
        Stock st = new Stock();
        System.out.println("Symbol : "+st.symbol);
        System.out.println("Name : "+st.name);
        System.out.println("Previous Closing : "+st.previousClosingPrice);
        System.out.println("Current Price : "+st.currentPrice);
        System.out.println("Price Change : "+st.getChangePercent());

    }
}

class Stock {

    String symbol = "ORCL";
    String name = "Oracle Coperation";
    double previousClosingPrice = 34.5;
    double currentPrice = 34.35;
    double x;

    public Stock() {

    }

    public double getChangePercent() {

        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}