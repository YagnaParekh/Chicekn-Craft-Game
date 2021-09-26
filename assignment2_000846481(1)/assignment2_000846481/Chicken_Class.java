package assignment2_000846481;

/**
 * @author  Yagna Parekh
 */
public class Chicken_Class
{
    /**
     * Using setter and getter method for every variable.
     */
    private String chicken_Name;
    private int chicken_Hearts;
    private String mood; // happy or sad
    private double feed_Seed; // seeds in kg
    private String status; // Live or Alive
    private String hit_chicken;
    private String play;
    private double lay_eggs;

    /**
     * Chicken name for assigning different names of chickens
     * @param chicken_Name
     */
    public void setName(String chicken_Name)
    {
        this.chicken_Name = chicken_Name;
    }
    public String getName()
    {
        return chicken_Name;
    }

    /**
     * All the respective hearts of chickens
     * @param chicken_Hearts
     */
    public void setChicken_Hearts(int chicken_Hearts)
    {
        if (chicken_Hearts > 4) // hearts cannot be more than 4
        {
            chicken_Hearts = 4;
        }
        else if ( chicken_Hearts < 0)
        {
            chicken_Hearts = 0;
        }
        else
            this.chicken_Hearts = chicken_Hearts;
    }
    public int getChicken_Hearts()
    {
        return chicken_Hearts;
    }


    /**
     *  GETTING MOOD OF THE CHICKEN
     * @param mood
     */
    public void setMood(String mood)
    {
        this.mood = mood; // mood is assigned for chickens, like chickens can be Happy or UnHappy.
    }
    public String getMood()
    {
        return mood;
    }

    /**
     * FEEDING SEED TO CHICKEN
     * @param feed_Seed
     */
    public void setFeed_Seed(double feed_Seed)
    {
        if (feed_Seed > 2) // we cannot feed seed more than 2 kg.
        {
            // if we feed more than 2 kg the chicken will die.
            this.feed_Seed = 2;
            status = "Died";
        }
        else if (feed_Seed >= 0 && feed_Seed <= 2)
        {
            // feeding can make them Happy and increase their heart by 1 everytime
            this.feed_Seed = this.feed_Seed + feed_Seed;
            chicken_Hearts += 1;
            mood = "Happy";
        }
    }

    /**
     * we get the the number of seeds at last of the chicken
     * @return
     */
    public double getFeed_Seed()
    {
        return feed_Seed;
    }

    /**
     * GET STATUS OF THE CHICKEN WHETHER IT IS ALIVE OR DEAD
     * @param status
     */
    public void setStatus(String status)
    {
        this.status = status;// Status of the chicken can be Alive or Dead
    }

    /**
     *
     * @return
     */
    public String getStatus()
    {
        return status;
    }

    /**
     * We can get one egg in every 0.25 seed from the chicken if and only if it is alive. However, getting eggs
     * can make them unhappy and dead chicken cannot lay eggs.
     * If the chicken is Happy, it will give double amount of eggs.
     */
    public void setLay_eggs()
    {
        if (feed_Seed >= 0.25 && mood.equals("Happy") && status.equals("Alive"))
        {
            lay_eggs = Math.round(feed_Seed / 0.25) * 2; // rounding the value of gotten eggs for accurate number of eggs.
            feed_Seed -= 0.25; // getting eggs from the chicken will decrease the amount of seed
            mood = "UnHappy"; // making UnHappy
        }
        else if (feed_Seed >= 0.25 && status.equals("Alive") && mood.equals("UnHappy"))
        {
            lay_eggs = Math.round(feed_Seed / 0.25);
            feed_Seed -= 0.25;
        }
        else if (feed_Seed < 0.25)
        {
            // if seed is less than 0.25 it cannot kay eggs so, this will make it die
            status = "Dead";
        }
    }

    /**
     * returns how many eggs we get from the chicken
     * @return
     */
    public double getLay_eggs()
    {
        return lay_eggs;
    }

    public void setHit_chicken()
    {
        //We can hit chicken, which will make them UnHappy and decrease 1 heart everytime
        this.chicken_Hearts -= 1;
        mood = "Unhappy";

        // if there is no heart left with chicken it will die.
        if (chicken_Hearts == 0)
        {
            status = "Dead";
        }
    }
    public String getHit_chicken()
    {
        return hit_chicken;
    }

    public void setPlay()
    {
        // One chicken can play with other one which will make both Happy.
        mood = "Happy";
        if (status.equals("Dead"))
        {
            this.play = play;
        }
    }
    public String getPlay()
    {
        return play;
    }

    @Override

    public String toString()
    {
        String result = mood + " " + status + " " + chicken_Name + ": " + feed_Seed + "kg seeds " + ", "
                + chicken_Hearts + " hearts";

        return result;
    }
}
