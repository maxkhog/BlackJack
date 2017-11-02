package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import static com.company.CardRange.*;
import static com.company.CardSuits.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Card> cardDesk =  CardDesk.toCardDesk();
                Collections.shuffle(cardDesk);
                    while (true) {

                        System.out.println("Enter 1 if you want to see all card from the deck\n" +
                                "Enter 2 if you wont to see one card from the deck\n"+
                                "Enter 3 if you want to play BlackJack");
                        label:
                        {
                            int n = in.nextInt();
                            switch (n) {
                                case 1:
                                    for (int i = 0; i < cardDesk.size(); i++) {
                                        Card First = cardDesk.get(i);
                                        int a = First.Range.getPower();
                                        System.out.printf("Suits: %s Range: %s Power: %d%n", First.Suits, First.Range, a);
                                    }
                                    break label;
                                case 2:
                                    System.out.println("Enter card number from the deck");
                                    int CardNumber = in.nextInt();
                                    Card First = cardDesk.get(CardNumber);
                                    int a = First.Range.getPower();
                                    System.out.printf("Suits: %s Range: %s Power: %d%n", First.Suits, First.Range, a);
                                    break label;
                                case 3:
                                    for (int j = 0; j < 10 ; j++) {
                                        labelpstartplay:
                                        {
                                            int PowerCard;
                                            int SumPowerCard = 0;
                                            Collections.shuffle(cardDesk);
                                            for (int i = 0; i < cardDesk.size(); i++) {
                                                PowerCard = takeCardPower(i, cardDesk);
                                                SumPowerCard += PowerCard;
                                                if (SumPowerCard > 17) {
                                                    System.out.println(SumPowerCard);
                                                    break labelpstartplay;
                                                }
                                            }

                                        }
                                    }
                                    break;
                                case 4:

                            }
                            break;
                        }
                        }
                    }
    public static int takeCardPower (int CardNumber, ArrayList <Card> cardDesk) {
        Card card = cardDesk.get(CardNumber);
        int a = card.Range.getPower();
        return a;
    }
    public static void startNewGame (ArrayList <Card> cardDesk) {

    }
    public static int takenewCard (int CardNumber, ArrayList <Card> cardDesk) {
        int a = takeCardPower(CardNumber+1, cardDesk);
        return 0;
    }
    public static int seeDilerSumCardPower (){
        return 0;
    }
    public static int seeOwnSumCardPower () {
        return 0;
    }
    public static void choice (int choice, int indexCard, ArrayList <Card> cardDesk){
        switch (choice) {
            case 1: takenewCard(indexCard, cardDesk);
            break;
            case 2:
        }
    }

}
class Card {
    CardSuits Suits;
    CardRange Range;
    Card (CardSuits suits, CardRange range) {
        this.Suits = suits;
        this.Range = range;

    }
}
class CardDesk {
    public static ArrayList toCardDesk() {
        ArrayList <Card> cardDesk  = new ArrayList <>();
        CardSuits [] allSuits = CardSuits.values();
        CardRange [] allRange = CardRange.values();

        for (CardRange range : allRange) {
            for (CardSuits suit : allSuits) {
                cardDesk.add (new Card (suit,range));
            }
        }
        return cardDesk;
    }
    ArrayList <String> cardDesk = toCardDesk();
    CardDesk (ArrayList cardDesk) {
        this.cardDesk = cardDesk;
    }
}
