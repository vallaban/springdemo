package Demo;

public class TrackCoach implements  Coach{
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDalyWorkout() {
        return "run hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it:"+ fortuneService.getFortune();
                }

    // add an init method
    public void doMyStartupStuff()
    {
        System.out.println("Trackcoach: Inside method");
    }

    // add a destroy method
    public void doMyCleanupStuff()
    {
        System.out.println("Trackcoach: Inside cleanup");
    }
}
