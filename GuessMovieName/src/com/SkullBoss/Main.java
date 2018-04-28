package com.SkullBoss;
import java.util.*;
import java.io.File;
import java.lang.*;
public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here

        File f=new File( "movieList.txt");
        Scanner s=new Scanner(f);
        Scanner u=new Scanner (System.in);
       String sam[],str="\0";
        Random r = new Random();                                // random index selection
        int Low = 0;
        int High = 25;
        int Result = r.nextInt(High-Low) + Low;
       // System.out.println(Result);
       int j=0;
        while(s.hasNextLine())                                   // selection of random movie title
        {   if(j==Result)
            {
                str = s.nextLine();                             // getting the value from random line
                 break;
            }
       // else
      //  {
                str=s.nextLine();                                   // this for precaution if none of them executes
        //     }
         j++;
        }
        //System.out.println(str);
        String strdot="_";
        for(int i=0;i<str.length()-1;i++)
            strdot=strdot + "_";                                              //making dotted version of movie title
        System.out.println(strdot);
        int wrongAnswer=0,flag,fin=0;   // @wrongAnswer will track for wrong attempt | @flag for char in string or not
        while(wrongAnswer <10)
        {
            System.out.println("Enter character pls");                           //input from user
            char c = u.nextLine().charAt(0);                                       // taking input from user
            flag=0;
            for (int i = 0; i < str.length(); i++)                     // revealing letter in movie title
            {
                if (c == str.charAt(i)) {                                   //if char existed in movie title
                    strdot = strdot.substring(0, i ) + c + strdot.substring(i+1 );
                                                                    //editing string in spite of non mutable property
                    flag=1;                                 //condition if true

                }
            }
           /* System.out.println(str);
            System.out.println(strdot);
            System.out.println(strdot.equals(str)+ " then y this");
            */
            if(strdot.equals(str)) {

                fin = 1;
                break;
            }
            if(flag==1)                         //  after editing checking weather now it is equalt to movie title or not
            {
               // System.out.println("But y me");
                System.out.println(strdot);     // printing current situation of dotted string
            }
             else
            {
                wrongAnswer++;                              // keeping track of wrong attempt
                System.out.println("Wrong attempt " + wrongAnswer);
                System.out.println(strdot);
            }

        }
                    // result declaration
        if(fin==1)
            System.out.println("Congrates you guessed it right ..!" + strdot + "\n "+ str);
        else
            System.out.println("You ran out of chances"+ strdot + "\n " + str);
        //System.out.println(c);
        //System.out.print(words);
    }
}
