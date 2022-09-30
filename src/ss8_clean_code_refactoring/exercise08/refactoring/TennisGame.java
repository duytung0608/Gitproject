package ss8_clean_code_refactoring.exercise08.refactoring;

public class TennisGame {
    public static final int DREWZEROZERO = 0;
    public static final int DREWONEONE = 1;
    public static final int DREWTWOTWO = 2;
    public static final int DREWTHREETHREE = 3;

    public static String getScore(String player1Name, String player2Name, int pointOfUser1, int pointOfUser2) {
        String score = "";
        int tempScore=0;
        boolean twoPlayersEqualPoints = pointOfUser1 == pointOfUser2;
        if (twoPlayersEqualPoints)
        {
            switch (pointOfUser1)
            {
                case DREWZEROZERO:
                    score = "Love-All";
                    break;
                case DREWONEONE:
                    score = "Fifteen-All";
                    break;
                case DREWTWOTWO:
                    score = "Thirty-All";
                    break;
                case DREWTHREETHREE:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;


            }
        }
        else {
            boolean thereArePlayersMoreThan4Points = pointOfUser1 >= 4 || pointOfUser2 >= 4;
            if (thereArePlayersMoreThan4Points)
            {
                int minusResult = pointOfUser1-pointOfUser2;
                score = resultAnnouncement(minusResult);
            }
            else {
                for (int i=1; i<3; i++)
                {
                    if (i==1) tempScore = pointOfUser1;
                    else { score+="-"; tempScore = pointOfUser2;};
                    score = writtingPoint(score, tempScore);
                }
            }
        }
        return score;
    }

    private static String resultAnnouncement(int minusResult) {
        String score;
        if (minusResult ==1) score = "Advantage player1";
        else if (minusResult ==-1) score = "Advantage player2";
        else if (minusResult >=2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String writtingPoint(String score, int tempScore) {
        switch (tempScore)
        {
            case 0:
                score +="Love";
                break;
            case 1:
                score +="Fifteen";
                break;
            case 2:
                score +="Thirty";
                break;
            case 3:
                score +="Forty";
                break;
        }
        return score;
    }

    public static void main(String[] args) {
        String getScorewow = TennisGame.getScore("tung", "Nhat", 3,5);
        System.out.println(getScorewow);
    }
}
