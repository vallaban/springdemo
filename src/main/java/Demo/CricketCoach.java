package Demo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    // add new fields for emailaddress and team (litteral values)
    private String emailaddres;
    private String team;
    // add setter method for both private fields
    public String getEmailaddres() {
        return emailaddres;
    }

    public void setEmailaddres(String emailaddres) {
        System.out.println("CricketCoacj: email address setter");
        this.emailaddres = emailaddres;
    }
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Cricketcoacj: team setter");
        this.team = team;
    }


    public CricketCoach() {
        System.out.println("Inside no-args constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside Setter method fortuneservice");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDalyWorkout() {
        return "Practise fastbowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
