public class Stock {

    String symbol;
    String stocksName;
    double previousClosingPrice;
    double currentPrice;

    Stock(double previousClosingPrice,double currentPrice ){
        symbol = "@";
        stocksName = "Stock$";
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercentage(){

       double percentageChanged = previousClosingPrice - currentPrice;
        return percentageChanged;
    }
}
