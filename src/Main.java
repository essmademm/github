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




//////////////11. Find Common Elements (Countries)
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList(
                "USA", "KR", "Turkie", "KZ"));
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList(
                "KR", "Germany", "KZ"));

        l1.retainAll(l2);

        System.out.println("Common coun: " + l1);



/// /////////////12. Remove Even-Length Strings (Names)
//
        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Samira", "Jonny", "Asil", "Nur"));

        names.removeIf(name -> name.length() % 2 == 0);

        System.out.println(names);



/// //////////////////////3. Find Smallest Element (Shortest Song)
        ArrayList<String> songs = new ArrayList<>(Arrays.asList(
                "Stay", "Halazia", "Work"));

        String shor = songs.get(0);

        for (String song : songs) {
            if (song.length() < shor.length()) {
                shor = song;
            }
        }

        System.out.println("Shortest song: " + shor);



/// ////14. Replace All Vowels with "*"

        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "infinitive", "insomnia", "array"));

        for (int i = 0; i < words.size(); i++) {
            words.set(i, words.get(i).replaceAll("[aeiou]", "*"));
        }

        System.out.println(words);




        /// //////////5. Partition ArrayList (Even & Odd Numbers)

        ArrayList<Integer> numberss = new ArrayList<>(Arrays.asList(
                1, 2, 3, 4, 5, 6));

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : numberss) {
            if (num % 2 == 0)
                even.add(num);
            else
                odd.add(num);
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);




        /// ////////16. Rotate Elements by 2 Positions (Days)

        ArrayList<String> days = new ArrayList<>(Arrays.asList(
                "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));

        Collections.rotate(days, 2);

        System.out.println(days);



        ///////// 17. Remove Null Values (Student Names)
        ArrayList<String> students = new ArrayList<>(Arrays.asList(
                "Akim", null, "Islam", null, "Aruu"));

        students.removeIf(Objects::isNull);

        System.out.println(students);




/// ////////////////18. Find Second Largest String (by Length)

        ArrayList<String> movie = new ArrayList<>(Arrays.asList(
                "star", "mountains", "Masha", "Avatar"));

        movies.sort((z, c) -> c.length() - z.length());

        System.out.println("2. largest: " + movie.get(1));


/// ///////////////19. Replace Elements with Lengths (Fruits)

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
                "Apple", "Banan", "Kiwi"));

        ArrayList<Integer> lengths = new ArrayList<>();

        for (String fruit : fruits) {
            lengths.add(fruit.length());
        }

        System.out.println(lengths);






        /// //////////20. Create Nested ArrayList (Departments)

        ArrayList<ArrayList<String>> departments = new ArrayList<>();

        ArrayList<String> it = new ArrayList<>(Arrays.asList("Akim", "Baias"));
        ArrayList<String> hr = new ArrayList<>(Arrays.asList("Samira", "Joni"));

        departments.add(it);
        departments.add(hr);

        System.out.println(departments);





    }
}