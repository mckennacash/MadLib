package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//declare
        Scanner keyboard ;
        String greeting ;
        String userAnimal;
        String userNoun;
        String userFood;
        String userVerb;
        String userNoun2;
        String userAnimal2;
        String userVerb2;
        String userOutdoorActivity;
        String userNegativeAdjective;
        String userSomethingToDo;
        String userAdjective;
        String userSomethingYouWouldBuy;
        String userSomethingToDoWeekend;
        String userSomethingPastTense;
        String userSomethingYouLike;
        String userCelebrity;
        String userAName;
        String userVerb3;
        String userNoun3;
        String userFood2;

        //initializing


        greeting = "Hello! Welcome to the madlib!";

        keyboard = new Scanner(System.in);

        System.out.println(greeting);
        System.out.println("Continue?");
        keyboard.nextLine();
        System.out.println("Great! Please fill out the prompts as they appear on your screen" );
        System.out.println("Give a noun");
        userNoun = keyboard.nextLine();
        System.out.println("Great! Now give an animal");
        userAnimal = keyboard.nextLine();
        System.out.println("Now a verb");
        userVerb = keyboard.nextLine();
        System.out.println("Give another noun");
        userNoun2 = keyboard.nextLine();
        System.out.println("Give one more noun");
        userNoun3 = keyboard.nextLine();
        System.out.println("Give a food");
        userFood = keyboard.nextLine();
        System.out.println("Give another food");
        userFood2 = keyboard.nextLine();
        System.out.println("Give another animal");
        userAnimal2 = keyboard.nextLine();
        System.out.println("Give another verb");
        userVerb2 = keyboard.nextLine();
        System.out.println("Now give an outdoor activity");
        userOutdoorActivity = keyboard.nextLine();
        System.out.println("One more verb");
        userVerb3 = keyboard.nextLine();
        System.out.println("Give a negatve adjective");
        userNegativeAdjective = keyboard.nextLine();
        System.out.println("Something to do");
        userSomethingToDo = keyboard.nextLine();
        System.out.println("Now something to do on the weekend");
        userSomethingToDoWeekend = keyboard.nextLine();
        System.out.println("Something you would buy");
        userSomethingYouWouldBuy = keyboard.nextLine();
        System.out.println("Name a celebrity");
        userCelebrity = keyboard.nextLine();
        System.out.println("Pick any name");
        userAName = keyboard.nextLine();
        System.out.println("Name something in past tense");
        userSomethingPastTense = keyboard.nextLine();
        userAdjective = keyboard.nextLine();
        System.out.println("And finally, something you like");
        userSomethingYouLike = keyboard.nextLine();



        System.out.println("Trap, TrapMoneyBenny");
        System.out.println("This "+userAnimal+" got me in my "+userNoun);
        System.out.println("Gotta be real with it, yup");
        System.out.println(" Kiki, do you love "+userFood+" Are you "+userVerb);
        System.out.println("Say you'll never ever leave from beside "+userNoun2);
        System.out.println(" Cause I want ya, and I need ya");
        System.out.println("And I'm down for you always");
        System.out.println("KB, do you love "+userAnimal2+"? Are you "+userVerb2);
        System.out.println("Say you'll never ever "+userOutdoorActivity+" from beside me");
        System.out.println("Cause I want ya, and I need ya");
        System.out.println("And I'm down for you always");
        System.out.println("Look, the new me is "+userNegativeAdjective+" still the real me");
        System.out.println("I swear you gotta feel me before they try and "+userSomethingToDo+" me");
        System.out.println(" They gotta make some "+userAdjective+" choices, they runnin out of "+userSomethingYouWouldBuy);
        System.out.println("Cause I've been goin' off and they don't know when it's stoppin");
        System.out.println("And when you get to toppin', I see that you've been "+userSomethingToDo);
        System.out.println("And when I take you "+userSomethingToDoWeekend+" you spend it like you earnede it");
        System.out.println("And when you "+userSomethingPastTense+" off on your ex he deserved it");
        System.out.println("I thought you were the one from the jump, that confirmed it");
        System.out.println("Trapmoneybenny");
        System.out.println("I buy you champagne but you love some "+userSomethingYouLike);
        System.out.println("From the block like you "+userCelebrity);
        System.out.println("I know you special, "+userAName+" cause I know too many");
        System.out.println("Resha, do you love "+userNoun3+". Are you "+userVerb3);
        System.out.println("Say you'll never ever leave from beside me");
        System.out.println("Cause I want ya, and I need ya");
        System.out.println("And i'm down for "+userFood2+" always");

        }
}
/*Trap, TrapMoneyBenny
        This (animal) got me in my (noun)
        Gotta be real with it, yup
        Kiki, do you love (food)? Are you (verb)?
        Say you'll never ever leave from beside(noun 2)
        'Cause I want ya, and I need ya
        And I'm down for you always
        KB, do you love (animal2)? Are you (verb 2)?
        Say you'll never ever (Outdoor Activity) from beside me
        'Cause I want ya, and I need ya
        And I'm down for you always
        Look, the new me is (negative adjective) still the real me
        I swear you gotta feel me before they try and (something to do) me
        They gotta make some(adjective)choices, they runnin' out of (something you would buy)
        'Cause I've been goin' off and they don't know when it's stoppin'
        And when you get to toppin', I see that you've been (something you do)'
        And when I take you (something you would do on the weekend)' you spend it like you earned it
        And when you (activity in past tense) off on your ex he deserved it
        I thought you were the one from the jump, that confirmed it
        Trapmoneybenny
        I buy you champagne but you love some (something you like)
        From the block like you (celebrity)
        I know you special, (a name), 'cause I know too many
        'Resha, do you love (noun) Are you (verb3)?
        Say you'll never ever leave from beside me
        'Cause I want ya, and I need ya
        And I'm down for (food) always
       */