package parfen;

public class ResClass implements GetRezults{
    int id;
    private String data;
    private String team1;
    private String country1;
    private String team2;
    private String country2;
    private String city_stadion;
    private String stadion;
    private double home;
    private double draw;
    private double away;

    public String getCountry1() {
        return country1;
    }

    public void setCountry1(String country1) {
        this.country1 = country1;
    }

    public String getCountry2() {
        return country2;
    }

    public void setCountry2(String country2) {
        this.country2 = country2;
    }

    public String getCity_stadion() {
        return city_stadion;
    }

    public void setCity_stadion(String city_stadion) {
        this.city_stadion = city_stadion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDraw() {
        return draw;
    }

    public void setDraw(double draw) {
        this.draw = draw;
    }

    public double getAway() {
        return away;
    }

    public void setAway(double away) {
        this.away = away;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getStadion() {
        return stadion;
    }

    public void setStadion(String stadion) {
        this.stadion = stadion;
    }

    public double getHome() {
        return home;
    }

    public void setHome(double home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "ResClass{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", team1='" + team1 + '\'' +
                ", country1='" + country1 + '\'' +
                ", team2='" + team2 + '\'' +
                ", country2='" + country2 + '\'' +
                ", city_stadion='" + city_stadion + '\'' +
                ", stadion='" + stadion + '\'' +
                ", home=" + home +
                ", draw=" + draw +
                ", away=" + away +
                '}';
    }

    @Override
    public void getResults() {

    }
}
