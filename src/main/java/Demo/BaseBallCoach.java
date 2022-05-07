package Demo;

public class BaseBallCoach implements Coach{
    //define a private filed for the dependency
    private FortuneService fortuneService;

   //define a constructor for dependency injection
    public BaseBallCoach (FortuneService theFortuenService)
    {
        fortuneService = theFortuenService;
    }

    @Override
    public String getDalyWorkout() {
        return "Spend 30 minutes on Batting practicse";
    }

    @Override
    public String getDailyFortune() {
        //use my fortunesercice to get a fortune
        return fortuneService.getFortune();
    }
}
