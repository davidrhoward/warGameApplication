package databaseApp;

import java.util.Random;
import java.util.Scanner;


public class warGame{

	private static int userCard;
	private static int cpuCard; 
	private static int userScore;
	private static int opponentScore;
	private static String endGame;
	private static String terminate = "no";
	private static int userDeck = 30;
	private static int cpuDeck = 30;
	
	
	
	public static void main (String [] args){

		
		System.out.println("Welcome to War!\n\n");
		
		cardsDrawn();
		mathMethod();
		
		//System.out.println("Your card is: "+userCard);
		//System.out.println("Your opponent's card is: "+randomCard);
		
		//GUI for Cards.
		
		//setValues();
		
		
		//mathMethod();
		
		
	}
	
	//Set's values for all of the cards.
	public static void setValues(){
		int oneCard = 0;
		int twoCard = 1;
		int threeCard = 2;
		int fourCard = 3;
		int fiveCard = 4;
		int sixCard = 5;
		int sevenCard = 6;
		int eightCard = 7;
		int nineCard = 8;
		int tenCard = 9;
		int jack = 10;
		int queen = 11;
		int king = 12;
		int ace = 13;
		
		
	}
	
	//Cards Determined
	public static void cardsDrawn(){
		//Random value to go with the card.
		Random randomGen = new Random();
		
		//Random cards for both user and opponent.
		userCard = randomGen.nextInt(15);
		cpuCard = randomGen.nextInt(15);
		
	}
	
	//Determines who wins
	public static void mathMethod(){
		Scanner scan = new Scanner(System.in);
		setValues();
		cardsDrawn();
		
		System.out.println("You: "+userCard);
		System.out.println("Cpu: "+randomCard);
		
		while (cpuDeck != 0 || userDeck != 0 || terminate.toLowerCase() != "no"){
			
			if (userCard > randomCard){
				System.out.println("You have won." +"\n-----------------------------------------------");
				userDeck += 2;
				System.out.println("Your deck contains " +userDeck +" cards!");
				userScore ++;
				System.out.println("Would you like to play again?");
				endGame = scan.nextLine();
					}
			}
			else if (userCard < randomCard){
				System.out.println("CPU has won." +"\n-----------------------------------------------");
				cpuDeck += 2;
				System.out.println("Your opponenents deck contains " +cpuDeck + " cards!");
				opponentScore ++;
				System.out.println("Would you like to play again?");
				endGame = scan.nextLine().toLowerCase();

				}
			}
			else {
				System.out.println("You and your opponent have drawn.\n--------------------------------------------");
				System.out.println("Your opponent has " +cpuDeck +" cards!\n" +"You have "+ userDeck +" cards!");
				System.out.println("Would you like to play again?");
				endGame = scan.nextLine().toLowerCase();

				}
			}
		}

	}
}


