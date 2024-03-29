package banan.edu.service;

import banan.edu.model.Card;

import java.util.List;

public interface IGameService {
    Card makeMove();
    Card dealerMove();
    Card myDefence();
    Card dealerDefence();
    List<Card> giveCards();
    Card rechargeCards();
    List<Card> moveToTrash();
    List<Card> giveUpAndTakeCards();
}
