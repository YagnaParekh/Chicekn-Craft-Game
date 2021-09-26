package assignment2_000846481;

import java.util.Scanner;
/**
 * This is a Test class to test and validate all of the attributes of the class and manipulate it
 * This is the VIEW class
 *
 * @author Yagna Parekh
 */

public class Chicken_Craft {
    public static void main(String[] args) {
        Chicken_Class first_chicken = new Chicken_Class();
        Chicken_Class second_chicken = new Chicken_Class();
        Chicken_Class third_chicken = new Chicken_Class();


        first_chicken.setName("yag");
        first_chicken.setChicken_Hearts(2);
        first_chicken.setFeed_Seed(1);
        first_chicken.setMood("Happy");
        first_chicken.setStatus("Alive");

        second_chicken.setName("nanc");
        second_chicken.setChicken_Hearts(1);
        second_chicken.setFeed_Seed(1.5);
        second_chicken.setMood("Happy");
        second_chicken.setStatus("Alive");

        third_chicken.setName("syd");
        third_chicken.setChicken_Hearts(3);
        third_chicken.setFeed_Seed(1.9);
        third_chicken.setMood("Happy");
        third_chicken.setStatus("Alive");

        Scanner sin = new Scanner(System.in);

        do {
            System.out.println("");
            System.out.println(first_chicken);
            System.out.println(second_chicken);
            System.out.println(third_chicken);

            System.out.println("1. Feed    2. Play    3. Hit    4. Get Eggs     5. Quit");
            System.out.print("Enter your choice: ");
            int select = sin.nextInt();
            if (select == 5) {
                System.out.println("Exiting program.....");
                break;
            }
            else if (select == 1)
            {
                System.out.print("Which chicken? ");
                int chicken_number = sin.nextInt();

                System.out.print("How much do you want to feed chicken? ");
                double feed_seed = sin.nextDouble();
                if (chicken_number == 1)
                {
                    if (first_chicken.getStatus().equals("Alive"))
                    {
                        first_chicken.setFeed_Seed(feed_seed);
                    }
                    else if (first_chicken.getStatus().equals("Dead"))
                    {
                        System.out.println("Dead");
                    }
                }
                else if (chicken_number == 2)
                {
                    if (second_chicken.getStatus().equals("Alive"))
                    {
                        second_chicken.setFeed_Seed(feed_seed);
                    }
                    else if (second_chicken.getStatus().equals("Dead"))
                    {
                        System.out.println("Dead");
                    }
                }

                else if (chicken_number == 3)
                {
                    if (third_chicken.getStatus().equals("Alive"))
                    {
                       third_chicken.setFeed_Seed(feed_seed);
                    }
                    else if (third_chicken.getStatus().equals("Dead"))
                    {
                        System.out.println("Dead");
                    }
                }
            }
            else if (select == 3)
            {
                System.out.print("Which chicken? ");
                int chicken_number = sin.nextInt();
                if (chicken_number == 1)
                {
                    if (first_chicken.getStatus().equals("Alive"))
                    {
                        first_chicken.setHit_chicken();
                        System.out.println("Ouch!!!!!");
                    }
                    else if (first_chicken.getStatus().equals("Dead"))
                    {
                        System.out.println("Chicken is already dead...");
                    }
                }

                if (chicken_number == 2)
                {
                    if (second_chicken.getStatus().equals("Alive"))
                    {
                        second_chicken.setHit_chicken();
                        System.out.println("Ouch!!!!!");
                    }
                    else if (second_chicken.getStatus().equals("Dead"))
                    {
                        System.out.println("Chicken is already dead...");
                    }
                }

                if (chicken_number == 3)
                {
                    if (third_chicken.getStatus().equals("Alive"))
                    {
                        third_chicken.setHit_chicken();
                        System.out.println("Ouch!!!!!");
                    }
                    else if (third_chicken.getStatus().equals("Dead"))
                    {
                        System.out.println("Chicken is already dead...");
                    }
                }
            }

            if (select == 4)
            {
                System.out.print("Which chicken? ");
                int chicken_number = sin.nextInt();

                if (chicken_number == 1)
                {
                    if (first_chicken.getStatus().equals("Alive"))
                    {
                        first_chicken.setLay_eggs();
                        System.out.println("Hurray! You've got "+first_chicken.getLay_eggs() + " eggs.");
                    }
                    else if(first_chicken.getStatus().equals("Dead"))
                    {
                        System.out.println("Dead chicken cannot lay eggs!");
                    }
                }

                if (chicken_number == 2)
                {
                    if (second_chicken.getStatus().equals("Alive"))
                    {
                        second_chicken.setLay_eggs();
                        System.out.println("Hurray! You've got "+second_chicken.getLay_eggs() + " eggs.");
                    }
                    else if(second_chicken.getStatus().equals("Dead"))
                    {
                        System.out.println("Dead chicken cannot lay eggs!");
                    }
                }

                if (chicken_number == 3)
                {
                    if (third_chicken.getStatus().equals("Alive"))
                    {
                        third_chicken.setLay_eggs();
                        System.out.println("Hurray! You've got "+third_chicken.getLay_eggs() + " eggs.");
                    }
                    else if(third_chicken.getStatus().equals("Dead"))
                    {
                        System.out.println("Dead chicken cannot lay eggs!");
                    }
                }
            }
        }
        while (true) ;
        {

        }
    }
}
