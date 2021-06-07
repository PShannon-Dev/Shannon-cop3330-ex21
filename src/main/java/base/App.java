/*
 *  UCF COP3330 Summer 2021 Assignment 21 Solution
 *  Copyright 2021 Paul Shannon
 */
package base;

import java.util.Scanner;

public class App {
    Scanner month = new Scanner(System.in);

    public static void main(String[] args) {
        //instances
        App myApp = new App();
        Months convert = new Months();

        //input
        myApp.input(convert);

        //output
        myApp.output(convert);
    }

    public void input(Months instance)
    {
        //scan for numerical value
        System.out.print("Please enter the number of the month: ");
        instance.setNumMonth(month.nextInt());
    }
    public void output(Months instance)
    {
        System.out.println(instance.convert(instance.numMonth));
    }
}