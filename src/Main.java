import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> mentees = new ArrayList<String>();
        String name;
        int count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please, add a name to the list");
        name = reader.readLine();
        mentees.add(name);

        do {
            System.out.println("Who else would you like to add to the list?");
            name = reader.readLine();
            mentees.add(name);
            count++;
        }

        while (count < 9);

        System.out.print("These are the names you entered \n");
        for (String i : mentees) {
            System.out.print(i + "\n");
        }

        Collections.shuffle(mentees);

        List<String> pairOne = mentees.subList(0, 2);
        List<String> pairTwo = mentees.subList(2, 4);
        List<String> pairThree = mentees.subList(4, 6);
        List<String> pairFour = mentees.subList(6, 8);
        List<String> pairFive = mentees.subList(8, 10);

        System.out.print("\nThis is their grouping \n");
        System.out.print("Group 1: " + pairOne + "\n");
        System.out.print("Group 2: " + pairTwo + "\n");
        System.out.print("Group 3: " + pairThree + "\n");
        System.out.print("Group 4: " + pairFour + "\n");
        System.out.print("Group 5: " + pairFive + "\n");




    }

}

