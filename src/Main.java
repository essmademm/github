import java.util.*;
public class Main {
    public static void main(String[] args) {
        ///////merge Unique Elements (Books)
        ArrayList<String> b1 = new ArrayList<>(Arrays.asList("do", "re", "me"));
        ArrayList<String> b2 = new ArrayList<>(Arrays.asList("fa", "sol", "do"));

        Set<String> uniqueb = new HashSet<>();
        uniqueb.addAll(b1);
        uniqueb.addAll(b2);

        System.out.println(uniqueb);


        /// ///////2. Find Maximum Element (Longest Movie Title)
        ArrayList<String> movies = new ArrayList<>(Arrays.asList(
                "lord of ring", "moonight", " Dark night"));

        String longest = movies.get(0);

        for (String movie : movies) {
            if (movie.length() > longest.length()) {
                longest = movie;
            }
        }

        System.out.println("Longest movie tit: " + longest);



        /// ///////////3. Count Occurrences ("Pizza")
        ArrayList<String> foods = new ArrayList<>(Arrays.asList(
                "Pizza", "Burger", "Piza", "Pasta", "Pizza"));

        int count = 0;
        for (String food : foods) {
            if (food.equals("Pizza")) {
                count++;
            }
        }

        System.out.println("Pizza apears: " + count + " times");




        ///////4. Remove All Matching Elements ("Banana")
        ArrayList<String> fs = new ArrayList<>(Arrays.asList(
                "Apple", "Banana", "Orang", "Banana"));

        fs.removeIf(fruit -> fruit.equals("Banana"));

        System.out.println(fs);




        /// ///////5. Replace All Elements with "Black"

        ArrayList<String> colors = new ArrayList<>(Arrays.asList(
                "red", "Blue", "gren"));

        Collections.fill(colors, "Black");

        System.out.println(colors);




        /// /////6. Check Sublist Presence (Sports)

        ArrayList<String> sport = new ArrayList<>(Arrays.asList(
                "footbal", "cricket", "Tennis", "hockey"));

        ArrayList<String> check = new ArrayList<>(Arrays.asList(
                "footbal", "Tennis"));

        boolean result = sport.containsAll(check);

        System.out.println("Sublist present: " + result);




        /// //7. Find First and Last Index of "Rose"

        ArrayList<String> fl = new ArrayList<>(Arrays.asList(
                "rosa", "Lily", "lulip", "rosa", "romashka"));

        System.out.println("first index: " + fl.indexOf("rosa"));
        System.out.println("Last index: " + fl.lastIndexOf("rosa"));




/// //////8. Remove Duplicates (Animals)
        ArrayList<String> animal = new ArrayList<>(Arrays.asList(
                "cat", "dog", "cat", "hors", "dog"));

        Set<String> uniqueAnimals = new LinkedHashSet<>(animal);
        animal.clear();
        animal.addAll(uniqueAnimals);

        System.out.println(animal);




        /// ////////9. Convert ArrayList to Array (Cities)
        ArrayList<String> cities = new ArrayList<>(Arrays.asList(
                "bishkek", "london", "ankara"));

        String[] cityArray = cities.toArray(new String[0]);

        System.out.println(Arrays.toString(cityArray));



/// //////////////////10. Convert Array to ArrayList (Numbers)

        Integer[] numbers = {1, 2, 3, 4, 5};

        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));

        System.out.println(numberList);









    }
}