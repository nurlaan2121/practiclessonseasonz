public class Seasons {
    String dateofYears;
    public Seasons (){}

    public Seasons(String dateofYears){
        this.dateofYears = dateofYears;
    }
    public String getDateofYears(String dateofYears){
        switch (dateofYears){
            case "9","10","11":
                return "Kuz";
            case "12","1","2":
                return "Kysh";
            case "3","4","5":
                return "Jazz";
            case "6","7","8":
                return "JAi";
        }return "ERROR";
    }
}
