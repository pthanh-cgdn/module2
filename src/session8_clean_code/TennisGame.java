package session8_clean_code;

public class TennisGame {

    public static String getScore(int player1Score, int player2Score) {
        String scoreBoard = "";
        if (player1Score == player2Score) {
            scoreBoard = switch (player1Score) {
                case 0, 1, 2, 3 -> getScoreString(player1Score) + "-All";
                default -> "Deuce";
            };
        } else if (player1Score >= 4 || player2Score >= 4) {
            int player1CompareToPlayer2 = player1Score - player2Score;
            if (player1CompareToPlayer2 > 0) {
                if (player1CompareToPlayer2 > 1) {
                    scoreBoard = "Win player1";
                } else {
                    scoreBoard = "Advantage for player1";
                }
            } else {
                if (player1CompareToPlayer2 < -1) {
                    scoreBoard = "Win for player2";
                } else {
                    scoreBoard = "Advantage for player2";
                }
            }
        } else {
            scoreBoard = getScoreString(player1Score) + '-' + getScoreString(player2Score);
        }
        return scoreBoard;
    }

    private static String getScoreString(int score) {
        return switch (score) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> "";
        };
    }

    public static void main(String[] args) {
        TennisGame tennisGame = new TennisGame();
        System.out.println(getScore(6, 8));
    }
}