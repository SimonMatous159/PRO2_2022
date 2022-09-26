import models.PizzaMenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) { //nevim proč to nechce commitnout
        System.out.println("Hello World");

        System.out.println("Hello again!");

        int num = 10;
        int num2 = 15;

        if(num == num2) {
            System.out.println(("num==num2"));
        }

         else if(num< num2) {
           System.out.println("num < num2");
        }
            boolean b1 = false;

            String text1 = "aaa";
            String text2 = "aaa";
            if (text1 == text2)
            {
                System.out.print("text1==text2");

            }
            else {

                System.out.print("text1!=text2");
            }

        PizzaMenuItem item1 = new PizzaMenuItem(190,"Havai", "Pineapple" );
        PizzaMenuItem item2 = new PizzaMenuItem(190,"Havai", "Pineapple" );
        PizzaMenuItem item3 = item1;

        System.out.println("item1 is not equal with item2");
        item3.setPrice(200);

        if(item1!=item2)
            System.out.println("item1 is not equal with item2");

        System.out.println(item1.toString());

        List<PizzaMenuItem> pizzaItems = new ArrayList<>();
        pizzaItems.add(item1);
        pizzaItems.add(item2);
        pizzaItems.add(new PizzaMenuItem(250,"debil","idiot"));

        for (PizzaMenuItem item: pizzaItems) {

            System.out.println(item);
        }
        }
        }

