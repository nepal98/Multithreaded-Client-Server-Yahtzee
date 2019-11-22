package constants;

public interface ServerOperationConstants {

    String GAME_END = "GAME_END";

    String PLAYER_REQUEST_TURN = "PLAYER_REQUEST_TURN";     // Client to server
    String PLAYER_GRANTED_TURN = "PLAYER_GRANTED_TURN";       // Server to client
    String PLAYER_FINISH_TURN = "PLAYER_FINISH_TURN";       // Server to client
    String ROUND_NUMBER = "ROUND_NUMBER";

    String PLAYER_TURN = "PLAYER_TURN";                   // Server to client
    String OTHER_PLAYER_TURN = "OTHER_PLAYER_TURN";       // Server to client

    String PLAYER_ROLL_DICES = "PLAYER_ROLL_DICES";         // Server to client
    String OTHER_PLAYER_ROLL_DICES = "OTHER_PLAYER_ROLL_DICES"; // Server to client


    String PLAYER_REROLL_DICES = "PLAYER_REROLL_DICES";         // Server to client
    String PLAYER_REQUEST_REROLL_CHANCES = "PLAYER_REQUEST_REROLL_CHANCES";   // Client to Server
    String PLAYER_REROLLED_DICES = "PLAYER_REQUEST_REROLL_CHANCES";   // Client to Server
    String PLAYER_FINISH_REROLL_DICES = "PLAYER_FINISH_REROLL_DICES";         // Client to client
    String OTHER_PLAYER_REROLL_DICES = "OTHER_PLAYER_REROLL_DICES"; // Server to client

    String PLAYER_GET_WHAT_CAN_BE_SCORED = "PLAYER_GET_WHAT_CAN_BE_SCORED";
    String OTHER_PLAYER_GET_WHAT_CAN_BE_SCORED = "OTHER_PLAYER_GET_WHAT_CAN_BE_SCORED";
    String PLAYER_GET_SCOREBOARD = "PLAYER_GET_SCOREBOARD";

    String PLAYER_CHOOSE_SCORING_CATEGORY = "PLAYER_CHOOSE_SCORING_CATEGORY";
    String OTHER_PLAYER_CHOSE_SCORING_CATEGORY = "OTHER_PLAYER_CHOSE_SCORING_CATEGORY";

    String PLAYER_SET_SCORE_IN_CATEGORY = "PLAYER_SET_SCORE_IN_CATEGORY";
    String OTHER_PLAYER_SET_SCORE_IN_CATEGORY = "OTHER_PLAYER_SET_SCORE_IN_CATEGORY";

    String WINNER_ANNOUNCEMENT = "WINNER_ANNOUNCEMENT";


    String PLAYER_NUMBER_OF_DICES_REROLLED = "PLAYER_NUMBER_OF_DICES_REROLLED";
    String PLAYER_NEW_REROLLED_DICE = "PLAYER_NEW_REROLLED_DICE";

}