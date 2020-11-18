package gayer.javacert;

import java.util.Calendar;
import java.util.Date;

public class JamesLife {

    public static void main (String[] args){

        Calendar calendar = Calendar.getInstance();
        String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        String today = days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
        System.out.println("James' " + today);

        for(int hours = 0; hours < 24; hours++){
            //getActivity(hours,calendar.get(Calendar.DAY_OF_WEEK));
            System.out.println(hours + ":\t" + getActivity(hours,7));

        }

    }

    private static String getActivity(int hour, int day){
        String Activity = "";

        switch(day){
            //Sunday
            case 1:
                if(hour < 2 ) { Activity = "Video Games"; }
                if(hour >= 2 && hour <= 10 ) { Activity = "Sleep or Close to It"; }
                if(hour >= 11 && hour < 12) { Activity = "Snooze"; }
                if(hour == 12 ) { Activity = "Making Lunch"; }
                if(hour >= 13 && hour < 18) { Activity = "Be Useless"; }
                if(hour == 18 ) { Activity = "Making Dinner"; }
                if(hour == 19 ) { Activity = "Deutsch Verbesserung"; }
                if(hour == 20 ) { Activity = "Self Care"; }
                if(hour == 21 ) { Activity = "Relax";};
                if(hour >= 22 && hour < 24 ) { Activity = "Anxiety"; }
                break;

            //Monday
            case 2:
                if(hour == 0 ) { Activity = "Trying to Sleep"; }
                if(hour >= 1 && hour < 8) { Activity = "Sleep or Close to It"; }
                if(hour >= 8 && hour <= 17) { Activity = "Working"; }
                if(hour == 18 ) { Activity = "Grocery Shopping"; }
                if(hour == 19 ) { Activity = "Dinner"; }
                if(hour == 20 ) { Activity = "Catch Up on inboxes and personal projects"; }
                if(hour == 21 ) { Activity = "Relax"; }
                if(hour == 22 ) { Activity = "Get Ready for bed and wind down"; }
                if(hour > 22 && hour < 24 ) { Activity = "Anxiety"; }
                break;

            //Tuesday
            case 3:
                if(hour == 0 ) { Activity = "Trying to Sleep"; }
                if(hour >= 1 && hour < 8) { Activity = "Sleep or Close to It"; }
                if(hour >= 8 && hour <= 17) { Activity = "Working"; }
                if(hour == 18 ) { Activity = "Making Dinner"; }
                if(hour == 19 ) { Activity = "Deutsch Verbesserung"; }
                if(hour == 20 ) { Activity = "D&D Campaign prep for kids"; }
                if(hour == 21 ) { Activity = "Relax"; }
                if(hour == 22 ) { Activity = "Get Ready for bed and wind down"; }
                if(hour > 22 && hour < 24 ) { Activity = "Anxiety"; }
                break;

            //Wednesday
            case 4:
                if(hour == 0 ) { Activity = "Trying to Sleep"; }
                if(hour >= 1 && hour < 8) { Activity = "Sleep or Close to It"; }
                if(hour >= 8 && hour <= 17) { Activity = "Working"; }
                if(hour == 18 ) { Activity = "Making Dinner"; }
                if(hour == 19 ) { Activity = "Deutsch Verbesserung"; }
                if(hour == 20 ) { Activity = "Java Cert stuff"; }
                if(hour == 21 ) { Activity = "Relax"; }
                if(hour == 22 ) { Activity = "Get Ready for bed and wind down"; }
                if(hour > 22 && hour < 24 ) { Activity = "Anxiety"; }
                break;

            //Thursday
            case 5:
                if(hour == 0 ) { Activity = "Trying to Sleep"; }
                if(hour >= 1 && hour < 8) { Activity = "Sleep or Close to It"; }
                if(hour >= 8 && hour <= 17) { Activity = "Working"; }
                if(hour == 18 ) { Activity = "Making Dinner & Star Trek"; }
                if(hour == 19 ) { Activity = "Deutsch Verbesserung"; }
                if(hour == 20 ) { Activity = "Work D&D Prep"; }
                if(hour == 21 ) { Activity = "Relax"; }
                if(hour == 22 ) { Activity = "Get Ready for bed and wind down"; }
                if(hour > 22 && hour < 24 ) { Activity = "Anxiety"; }
                break;

            //Friday
            case 6:
                if(hour == 0 ) { Activity = "Trying to Sleep"; }
                if(hour >= 1 && hour < 8) { Activity = "Sleep or Close to It"; }
                if(hour >= 8 && hour <= 17) { Activity = "Working"; }
                if(hour == 18 ) { Activity = "Making Dinner & Critical Role"; }
                if(hour == 19 ) { Activity = "Deutsch Verbesserung"; }
                if(hour == 20 ) { Activity = "Catch Up on inboxes and personal projects"; }
                if(hour == 21 ) { Activity = "Relax"; }
                if(hour == 22 ) { Activity = "Get Ready for bed and wind down"; }
                if(hour > 22 && hour < 24 ) { Activity = "Anxiety"; }
                break;

            //Saturday
            case 7:
                if(hour < 2 ) { Activity = "Video Games"; }
                if(hour >= 2 && hour < 11) { Activity = "Sleep or Close to It"; }
                if(hour == 11) { Activity = "Getting Ready and Going to Parents"; }
                if(hour >= 12 && hour <= 19) { Activity = "Parents House"; }
                if(hour == 20 ) { Activity = "Deutsch Verbesserung"; }
                if(hour == 21 ) { Activity = "Relax"; }
                if(hour == 22 ) { Activity = "Get Ready for bed and wind down"; }
                if(hour > 22 && hour < 24 ) { Activity = "Anxiety"; }
                break;

            default:
                Activity = "Something went very wrong!";
        }



        return Activity;
    }

}

