
public enum DifficultyLevel {
    EASY, NORMAL, HARD;

    public static DifficultyLevel fromString(String levelChosen){
        if(levelChosen.equals("EASY"))return EASY;
        if(levelChosen.equals("NORMAL"))return NORMAL;
        return HARD;
    }

}

