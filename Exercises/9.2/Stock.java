import java.util.*;

public class Stock{
    String symbbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    public Stock(){
    }
    public Stock(String symbol, String name){
        this.symbbol= symbol;
        this.name = name;
    }
    public String getSymbol(){
        return symbbol;
    }
    public void setSymbol(String symbol){
        this.symbbol=symbol;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getCurrentPrice(){
        return currentPrice;
    }
    public void setCurrentPrice(double currentPrice){
        this.previousClosingPrice= this.currentPrice;
        this.currentPrice = currentPrice;
    }
    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
    public double getChangePercent(){
        if (currentPrice < previousClosingPrice){
            setCurrentPrice(previousClosingPrice);
            setPreviousClosingPrice(currentPrice);
        }
        return (currentPrice -previousClosingPrice)/ previousClosingPrice;
    }
}