import java.util.Random;
import java.util.Scanner;

public class PartB
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        Q1();
        Q2();
        Q3();
        Q4();
        scan.close();
    }

    public static void Q1()
    {
        while (true)
        {
            String basic="The circumference of the ";
            System.out.println("Pick a shape: square, rectangle, cirecle (or q to quit)");
            String input = scan.nextLine();
            if(input.equals("q"))
            {
                return;
            }
            if(input.equals("square"))
            {
                double a;
                System.out.println("Enter the side length a: ");
                a = scan.nextDouble();
                System.out.println(basic + " square is: " + a*4);
                System.out.println("The area of the sqaure is: " + a*a);
            }
            else if (input.equals("rectangle"))
            {
                double a, b;
                System.out.println("Enter the side length a: ");
                a = scan.nextDouble();
                System.out.println("Enter the side length b: ");
                b = scan.nextDouble();
                System.out.println(basic + " rectangle is: " + (2*a + 2*b));
                System.out.println("The area of the rectangle is: "+ a*b);
            }
            else if (input.equals("circle"))
            {
                double r;
                System.out.println("Enter the radius: ");
                r = scan.nextDouble();
                System.out.println(basic + " circle is: " + (Math.PI * r * 2));
            }
        }
    }

    public static void Q2() {
        System.out.println("Q2: Enter the current day (1-31): ");
        int num = scan.nextInt();
        System.out.println("Enter the current month: (1-12)");
        int num2 = scan.nextInt();
        switch(num)
        {
            case 1 : System.out.println("You selected the 1st of ");
            case 2 : System.out.println("You selected the 2nd of ");
            case 3 : System.out.println("You selected the 3rd of ");
            case 4 : System.out.println("You selected the 4th of ");
            case 5 : System.out.println("You selected the 5th of ");
            case 6 : System.out.println("You selected the 6th of ");
            case 7 : System.out.println("You selected the 7th of ");
            case 8 : System.out.println("You selected the 8th of ");
            case 9 : System.out.println("You selected the 9th of ");
            case 10 : System.out.println("You selected the 10th of ");
            case 11 : System.out.println("You selected the 11th of ");
            case 12 : System.out.println("You selected the 12th of ");
            case 13 : System.out.println("You selected the 13th of ");
            case 14 : System.out.println("You selected the 14th of ");
            case 15 : System.out.println("You selected the 15th of ");
            case 16 : System.out.println("You selected the 16th of ");
            case 17 : System.out.println("You selected the 17th of ");
            case 18 : System.out.println("You selected the 18th of ");
            case 19 : System.out.println("You selected the 19th of ");
            case 20 : System.out.println("You selected the 20th of ");
            case 21 : System.out.println("You selected the 21st of ");
            case 22 : System.out.println("You selected the 22nd of ");
            case 23 : System.out.println("You selected the 23rd of ");
            case 24 : System.out.println("You selected the 24th of ");
            case 25 : System.out.println("You selected the 25th of ");
            case 26 : System.out.println("You selected the 26th of ");
            case 27 : System.out.println("You selected the 27th of ");
            case 28 : System.out.println("You selected the 28th of ");
            case 29 : System.out.println("You selected the 29th of ");
            case 30 : System.out.println("You selected the 30th of ");
            case 31 : System.out.println("You selected the 31st of ");
            default : System.out.println("Invalid Date");
        }

        if(num2 == 1) {
            System.out.println("January");
        } else if (num2 == 2 && num<30) {
            System.out.println("February");
        } else if (num2 == 3) {
            System.out.println("March");
        } else if (num2 == 4 && num<31) {
            System.out.println("April");
        } else if (num2 == 5) {
            System.out.println("May");
        } else if (num2 == 6 && num<31) {
            System.out.println("June");
        } else if (num2 == 7) {
            System.out.println("July");
        } else if (num2 == 8) {
            System.out.println("Augst");
        } else if (num2 == 9 && num<31) {
            System.out.println("September");
        } else if (num2 == 10) {
            System.out.println("October");
        } else if (num2 == 11 && num<31) {
            System.out.println("November");
        } else if (num2 == 12) {
            System.out.println("December");
        } else {
            System.out.println("Invalid Month or Date");
        }
    }

public static void Q3() {
    System.out.println("Q3: Enter how many numbers you want to check for primality: ");
    int n = scan.nextInt();
    int counter = 0;
    for (int i = 0; i < n; i++) {
    if (i < 2)
    continue;
    boolean check = true;

    for (int j = 2; j * j <= i; j++) {
    if (i % j == 0) {
    check = false;
    break;
    } else {

    }
    }
        if (check == true) {
        counter++;
        } 
        else {}
    }

        System.out.println("There are: " + counter + " primes between 0 and " + n);
    }

    public static void Q4() {
        Random rng = new Random();

        String action;
        System.out.println("Q4: Let's play a game. Type \"A\" to attack, \"B\" to buff your next attack. Kill the enemy to win!");
        System.out.println("Q4: You must roll higher than the enemy armor class (12) to hit. Roll 20 for a critical hit!");
        System.out.println("Q4: Your damage is 2-16 (2d8)");

        int enemyHP = 100;
        int enemyArmour = 12;
        int critChsnce = 20;
        int buff = 5;
        int turn = 0;

        boolean buffed = false;
        while (true) {

            boolean doAttack = false;
            boolean playerTurn = false;
            while (!playerTurn) {
                action = scan.nextLine();
                playerTurn = true;
                switch (action) {
                    case "A", "a":
                        doAttack = true;
                        break;
                    case "B", "b":
                        check = true;
                        System.out.println("Buffing! +5 to your next attack roll and damage");
                        break;
                    default:
                        System.out.println("Invalid input");
                        playerTurn = false;
                }
            }

            if (doAttack) {
                turn++;
                int attackRoll = rng.nextInt(20) + 1;
                int damage = 0;
                System.out.print("You rolled: " + attackRoll);
                if(hit) {
                    attackRoll += 5;
                    System.out.print(" + 5 (buff active)\n");
                } else {
                    System.out.println();
                }
                if (attackRoll >= enemyArmour) {
                    damage = rng.nextInt(8) + 1;
                    damage += rng.nextInt(8) + 1;
                    if(buffed) {
                        damage += 5;
                    }
                    if (attackRoll == 20 || (buffed && attackRoll == 20 + 5)) {
                        damage *= 2;
                        System.out.print("Critical hit! ");
                    }
                    System.out.print("You dealt " + damage + " damage");
                    if(buffed) {
                        System.out.print(" (buffed attack)");
                    }
                    enemyHP -= damage;
                    System.out.println("\nEnemy HP: " + Math.max(0, enemyHP));

                } else {
                    System.out.println("Miss");
                }

                buffed = false;
                if (enemyHP <= 0) {
                    System.out.println("Enemy died in " + turn + " turns");
                    scan.close();
                    return;
                }
            }

        }
    }
}