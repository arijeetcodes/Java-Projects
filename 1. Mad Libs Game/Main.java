import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // MAD LIBS GAME
        Scanner scanner = new Scanner(System.in);

        String name;
        String adjective;
        String noun;
        String object;
        String place;
        String animal;
        String verb1;
        String cloth;
        String verb2;
        String noun2;
        String food;
        String ex;
        String verb3;
        String num;
        String sub;

        System.out.print("Enter a Name: ");
        name = scanner.nextLine();
        System.out.print("Enter an Adjective: ");
        adjective = scanner.nextLine();
        System.out.print("Enter a Noun: ");
        noun = scanner.nextLine();
        System.out.print("Enter an Object: ");
        object = scanner.nextLine();
        System.out.print("Enter a Place: ");
        place = scanner.nextLine();
        System.out.print("Enter an Animal: ");
        animal = scanner.nextLine();
        System.out.print("Enter a Verb ending in -ing: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter a Clothing item: ");
        cloth = scanner.nextLine();
        System.out.print("Enter a Verb (Past Tense): ");
        verb2 = scanner.nextLine();
        System.out.print("Enter an Plural Noun: ");
        noun2 = scanner.nextLine();
        System.out.print("Enter a Food: ");
        food = scanner.nextLine();
        System.out.print("Enter a Silly Exclamation: ");
        ex = scanner.nextLine();
        System.out.print("Enter a Verb: ");
        verb3 = scanner.nextLine();
        System.out.print("Enter a Number: ");
        num = scanner.nextLine();
        System.out.print("Enter a Substance: ");
        sub = scanner.nextLine();

        System.out.println("\nOne morning, " + name + " woke up and discovered that their " + adjective + " " + noun + " had mysteriously disappeared.");
        System.out.println("Determined to find it, they grabbed their trusty " + object + " and traveled to the " + place + ".");
        System.out.println("On the way, they encountered a " + animal + " that was " + verb1 +" while wearing a " + cloth + ".");
        System.out.println("'Hey! Have you seen my " + noun + "?' asked " + name + ".");
        System.out.println("The " + animal + " replied, 'Of course! A " + adjective + " wizard took it to the " + place + "!'");
        System.out.println(name + " immediately " + verb2 + " toward the wizard's castle.");
        System.out.println("When they arrived, the wizard was sitting on a giant pile of " + noun2 + ", eating " + food + " and shouting, '" + ex + "!'");
        System.out.println("'Give me back my " + noun + "!' yelled " + name + ".");
        System.out.println("The wizard laughed and said, 'I'll give it back if you can " + verb3 + " " + num + " " + noun2 + " in " + num + " seconds!'");
        System.out.println("Somehow, " + name + " succeeded.");
        System.out.println("The wizard was so surprised that he " + verb2 + " into a " + adjective + " cloud of " + sub + ".");
        System.out.println(name + " finally got their " + noun + "back and went home.");
        System.out.println("It had been the most " + adjective + " day of their life.");
        System.out.println("The End.");

        scanner.close();
        }
    }