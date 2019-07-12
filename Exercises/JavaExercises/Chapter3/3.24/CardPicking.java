import java.util.*;
public class CardPicking{
	public static void main (String [] args){
		int numberOfCard = (int)(Math.random()*52)/4;
		int symbol = (int)(Math.random()*4);
		String symbolStr ="";
		String numberStr="";
		switch(symbol) {
			case 0 : symbolStr="Clubs" ; 
			break;
			case 1 : symbolStr="Diamonds," ; 
			break;
			case 2 : symbolStr="Hearts" ; 
			break;
			case 3 : symbolStr="Spades" ; 
		}
		switch (numberOfCard){
			case 11: numberStr = "Jack";
			break;
			case 12: numberStr = "Queen,";
			break;
			case 13: numberStr = "King";
			break;
			case 0: numberStr = "Ace";
			break;
			default: numberStr = numberStr+numberOfCard;
		}
		System.out.println("The card you picked " + numberStr + " of "+symbolStr);
	}
}