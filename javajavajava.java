package JAVAENDSEM;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
interface city{
    void goa(String location);
    void bengaluru(String location);
    void chennai(String location);
    String weather(String location);
}
    class itenary implements city,overall{
        abstract class location{}
        private static boolean stopAnimation = false;
        Scanner scan=new Scanner(System.in);
        void where(){
            print("Hello There!");
            print("Where are you currently?");
            String location=scan.nextLine();
            print("Perfect!");
            if(location.equalsIgnoreCase("goa")){
                goa("goa");
            }else if(location.equalsIgnoreCase("bengaluru")){
                bengaluru("bengaluru");
            }else if(location.equalsIgnoreCase("chennai")){
                chennai("chennai");
            }
        }
        
        public void goa(String location){
            print("We are checking the weather in your location now!\n\n\n\n");
            runLoadingAnimation(3,3);
            String weather=weather(location);
            print("In "+location+",The weather is : "+weather);
            if(weather.contains("rain")|weather.contains("wind")|weather.contains("cloud ")){
                print("We can see that it is rainy there.");
                print("We would recommend having some hot hot samosa's from Tindi's Kitchen");
            }else if(weather.contains("sun")|weather.contains("hot")){
                print("We can see that it is  sunny there!\n");
                print("We would recommend having some cold ice Gola's from Bala's Ice\n");
            }
            print("What part of your day do you want us to plan?");
            print("Breakfast\nLunch\nDinner\nWhole Day");
            String input=scan.nextLine();
            print("--------------------");
            print("Sounds Great!");
            print("--------------------");
            if(input.equalsIgnoreCase("breakfast")){
                print("Following are some of our favourite breakfast spots in "+location+" :)",50);
                print("Amma's Kitchen               (Sponsored)\n",50);
                print("MutthuRaj's morning dungeon\n",50);
                print("Beer,Food and Beer\n",50);
            } else if (input.equalsIgnoreCase("lunch")) {
                print("Here are some amazing lunch places in Goa:", 50);
                print("Fisherman's Wharf\n", 50);
                print("Gunpowder\n", 50);
                print("Souza Lobo\n", 50);
            } else if (input.equalsIgnoreCase("dinner")) {
                print("You can't leave Goa without trying these restaurant!", 50);
                print("Vinayak Family Restaurant\n", 50);
                print("Black Sheep Bistro\n", 50);
                print("The Fisherman's Wharf\n", 50);
            }else if(input.equalsIgnoreCase("Whole Day")){
                printf("Start your day with a hot coffee from Ramesh's Coffee\n");
                printf("Have Goa's traditional breakfast at Muthuraj Cafe\n");
                printf("Indulge in mouth-watering Goan delicacies like Poha, Upma, and Bebinca.");

                printf("Head to the beach from 10:00 AM to 11:30 AM\n");
                printf("Enjoy the sun, sand, and surf at one of Goa's beautiful beaches like Calangute Beach or Baga Beach.");
                printf("Take a dip in the turquoise waters and relax under the shade of palm trees.");

                printf("Have a delicious Goan seafood lunch\n");
                printf("Visit a local beach shack or seafood restaurant and savor the flavors of Goan cuisine.");
                printf("Try dishes like Goan Fish Curry, Prawn Balchão, and Crab Xacuti.");

                printf("Explore the vibrant markets of Goa\n");
                printf("Visit the Anjuna Flea Market or the Mapusa Market to shop for souvenirs, clothing, and local handicrafts.");
                printf("Immerse yourself in the lively atmosphere and bargain for unique treasures.");

                printf("Engage in water sports activities\n");
                printf("Experience the thrill of water sports like jet skiing, parasailing, or banana boat rides at a beach.");
                printf("Feel the adrenaline rush as you glide over the waves and take in the breathtaking coastal views.");

                printf("Relax with a sunset cruise on the Mandovi River\n");
                printf("Embark on a scenic river cruise and witness the mesmerizing sunset over the Goan coastline.");
                printf("Enjoy live music, dance performances, and indulge in delicious Goan snacks and drinks.");

                printf("Savor a delectable Goan dinner\n");
                printf("Try authentic Goan cuisine at a local restaurant, with options like Chicken Cafreal, Pork Vindaloo, or Vegetarian Sorpotel.");
                printf("End your meal with a sweet treat of Bebinca, a traditional Goan dessert.");

                printf("Enjoy the vibrant nightlife in Goa\n");
                printf("Visit popular clubs and beachfront bars to dance the night away to foot-tapping music and enjoy live performances.");

                printf("Wrap up your day with fond memories of Goa's charm and beauty!\n");

            }
        }
        public void bengaluru(String location){
            print("We are checking the weather in your location now!\n\n\n\n");
            runLoadingAnimation(3,3);
            String weather=weather(location);
            print("In "+location+",The weather is : "+weather);
            if(weather.contains("rain")|weather.contains("wind")|weather.contains("cloud ")){
                print("We can see that it is rainy/windy there.");
                print("We would recommend having some hot hot samosa's from Tindi's Kitchen");
            }else if(weather.contains("sun")|weather.contains("hot")){
                print("We can see that it is  sunny there!\n");
                print("We would recommend having some cold ice Gola's from Bala's Ice\n");
            }else{
                print("A lazy day is what you need!");
                print("The best place to do that is by eating Death By Chocolate From CornerHouse");    
            }
            print("What part of your day do you want us to plan?");
            print("Breakfast\nLunch\nDinner\nWhole Day");
            String input=scan.nextLine();
            print("--------------------");
            print("Sounds Great!");
            print("--------------------");
            if(input.equalsIgnoreCase("breakfast")){
                print("Following are some of our favourite breakfast spots in "+location+" :)",50);
                print("Asha Tiffin               (Sponsored)\n",50);
                print("Rameshwaram's Cafe\n",50);
                print("Madurai Idly\n",50);
            } else if (input.equalsIgnoreCase("lunch")) {
                print("Here are some amazing lunch places in  "+location+" :", 50);
                print("Truffles\n", 50);
                print("Tindi Mindi\n", 50);
                print("Ramesh's Cafe\n", 50);
            } else if (input.equalsIgnoreCase("dinner")) {
                print("You can't leave  "+location+" without trying these restaurant!", 50);
                print("Vinayak Family Restaurant\n", 50);
                print("Black Sheep Bistro\n", 50);
                print("The Fisherman's Wharf\n", 50);
            }else if(input.equalsIgnoreCase("Whole Day")){
                printf("Start your day with a refreshing breakfast at MTR (Mavalli Tiffin Room)\n");
                printf("Indulge in traditional South Indian breakfast items like Masala Dosa, Idli, and Filter Coffee.");

                printf("Visit the historic Bangalore Palace\n");
                printf("Explore the magnificent Bangalore Palace, known for its stunning architecture and beautiful gardens.");
                printf("Take a guided tour to learn about the history of the palace and the royal family.");

                printf("Explore the bustling streets of MG Road\n");
                printf("Take a leisurely stroll along MG Road, one of Bangalore's iconic shopping and entertainment districts.");
                printf("Browse through a variety of shops, boutiques, and malls, and grab a quick snack at a local street vendor.");

                printf("Discover the serene beauty of Lalbagh Botanical Garden\n");
                printf("Immerse yourself in the lush greenery and vibrant flora at Lalbagh Botanical Garden.");
                printf("Take a peaceful walk, admire the majestic glasshouse, and enjoy the tranquility of this urban oasis.");

                printf("Enjoy a delectable lunch at Mavalli Tiffin Room (MTR)\n");
                printf("Savor authentic Kannadiga cuisine at MTR, renowned for its mouth-watering dishes like Bisibele Bath and Rava Idli.");
                printf("Don't miss their signature dessert, the MTR-style Badam Halwa.");

                printf("Visit the Bangalore Fort and Tipu Sultan's Summer Palace\n");
                printf("Explore the historical Bangalore Fort and admire its architectural splendor.");
                printf("Continue to Tipu Sultan's Summer Palace, a magnificent structure that reflects the grandeur of the past.");

                printf("Indulge in a shopping spree at Commercial Street\n");
                printf("Experience the vibrant atmosphere and shop for trendy clothing, accessories, and handicrafts at Commercial Street.");
                printf("Discover unique items and grab some souvenirs to remember your time in Bangalore.");

                printf("Relax at Cubbon Park\n");
                printf("Take a leisurely stroll through the serene Cubbon Park, a green oasis in the heart of the city.");
                printf("Enjoy the beautiful landscapes, peaceful ambiance, and escape the bustling city for a while.");

                printf("Experience the city's nightlife at UB City\n");
                printf("Head to UB City, a luxury mall and entertainment complex, known for its upscale restaurants, bars, and lounges.");
                printf("Indulge in fine dining at 'Karavalli,' one of the best restaurants in Bangalore, offering exquisite coastal cuisine.");

                printf("End your day with a visit to Bangalore's famous microbreweries\n");
                printf("Unwind and sample a variety of craft beers at one of the city's popular microbreweries.");
                printf("Enjoy the vibrant atmosphere, live music, and spend some quality time with friends or loved ones.");

                printf("Reflect on the day's adventures and cherish the memories of your visit to Bangalore!\n");

            }
        }
        public void chennai(String location){
            print("We are checking the weather in your location now!\n\n\n\n");
            runLoadingAnimation(3,3);
            String weather=weather(location);
            print("In "+location+", the weather is: "+weather);
            if(weather.contains("rain")|weather.contains("wind")|weather.contains("cloud ")){
                print("We can see that it is rainy/windy there.");
                print("We would recommend having some piping hot filter coffee from Saravana Bhavan");
            }else if(weather.contains("sun")|weather.contains("hot")){
                print("We can see that it is sunny there!\n");
                print("We would recommend having some refreshing tender coconut water from Marina Beach\n");
            }else{
                print("It looks like a calm day!");
                print("The best way to enjoy it is by visiting Marina Beach");    
        }
            print("What part of your day do you want us to plan?");
            print("Breakfast\nLunch\nDinner\nWhole Day");
            String input=scan.nextLine();
            print("--------------------");
            print("Sounds great!");
            print("--------------------");
            if(input.equalsIgnoreCase("breakfast")){
                print("Here are some popular breakfast spots in "+location+" :)",50);
                print("Sangeetha Veg Restaurant\n",50);
                print("Murugan Idli Shop\n",50);
                print("Hotel Saravana Bhavan\n",50);
            } else if (input.equalsIgnoreCase("lunch")) {
                print("Here are some amazing lunch places in "+location+" :", 50);
                print("Anjappar Chettinad Restaurant\n", 50);
                print("Ponnusamy Restaurant\n", 50);
                print("Buhari Hotel\n", 50);
            } else if (input.equalsIgnoreCase("dinner")) {
                print("You can't leave "+location+" without trying these restaurants!", 50);
                print("Dakshin\n", 50);
                print("Murugan Idli Shop\n", 50);
                print("Azzuri Bay\n", 50);
            }else if(input.equalsIgnoreCase("Whole Day")){
                print("Start your day with a visit to the Kapaleeshwarar Temple\n");
                print("Experience the architectural beauty and spiritual ambiance of this famous Hindu temple dedicated to Lord Shiva.");

                print("Explore the historical Fort St. George\n");
                print("Discover the rich history of Chennai by visiting Fort St. George, the first British fortress in India.");
                print("Explore the museum, St. Mary's Church, and enjoy a scenic view of the Bay of Bengal.");

                print("Relax at Marina Beach\n");
                print("Take a leisurely walk along Marina Beach, one of the longest urban beaches in the world.");
                print("Enjoy the fresh sea breeze, indulge in local street food, and watch the mesmerizing sunset.");

                print("Visit the Government Museum\n");
                print("Explore the diverse collections at the Government Museum, including archaeological artifacts, art, and natural history exhibits.");

                print("Enjoy a traditional South Indian lunch at Murugan Idli Shop\n");
                print("Savor authentic South Indian dishes like idli, dosa, and vada at Murugan Idli Shop, a renowned restaurant in Chennai.");

                print("Discover the beauty of San Thome Basilica\n");
                print("Visit the San Thome Basilica, a magnificent church built over the tomb of St. Thomas the Apostle.");
                print("Admire the Gothic architecture and soak in the spiritual atmosphere of this historic landmark.");

                print("Shop for traditional crafts at Pondy Bazaar\n");
                print("Explore the bustling Pondy Bazaar, a popular shopping destination in Chennai.");
                print("Browse through a wide range of clothing, jewelry, and handicrafts, and shop for souvenirs.");

                print("Experience the vibrant culture of DakshinaChitra\n");
                print("Visit DakshinaChitra, a living museum that showcases the art, architecture, and culture of South India.");
                print("Explore traditional houses, crafts, and enjoy cultural performances.");

                print("Indulge in a delicious dinner at Murugan Idli Shop\n");
                print("Treat yourself to a sumptuous dinner at Murugan Idli Shop and enjoy their famous variety of idlis and other South Indian delicacies.");

                print("End your day with a visit to Elliot's Beach\n");
                print("Relax and unwind at Elliot's Beach, also known as Besant Nagar Beach.");
                print("Take a peaceful walk, enjoy the serene atmosphere, and savor some local street food.");

                print("Reflect on the day's adventures and cherish the memories of your visit to Chennai!\n");
    }
}

        public String weather(String location){
                    try {
            String apiKey = "d3decbe2c7d74c1a87b181800230307"; // Replace with your WeatherAPI key
            String url = "https://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + location;

            // Send HTTP GET request
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");

            // Read response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Extract weather condition from JSON response
            String condition = extractWeatherCondition(response.toString());

            // Print weather condition
            return condition;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private String extractWeatherCondition(String jsonResponse) {
        String condition = null;
        try {
            // Extract condition from the JSON response
            int startIndex = jsonResponse.indexOf("\"text\":\"") + 8;
            int endIndex = jsonResponse.indexOf("\"", startIndex);
            condition = jsonResponse.substring(startIndex, endIndex);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return condition;
    }
        
    public static void runLoadingAnimation(int repetitions, int dots) {
        try {
            System.out.print("Loading");
            for (int i = 1; i <= repetitions; i++) {
                
                for (int j = 0; j < dots; j++) {
                    System.out.print(".");
                    Thread.sleep(250); // Adjust the sleep duration to change the speed of animation
                }

                // Deleting the dots
                for (int j = 0; j < dots; j++) {
                    System.out.print("\b \b"); // Use backspace characters to overwrite the dots
                    Thread.sleep(250); // Adjust the sleep duration to change the speed of animation
                }
            }
            System.out.print("\b\b\b\b\b\b\b");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

     public void print(String text) {
        int delay=75;
        try {
            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i));
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
    public void printf(String text) {
        int delay=25;
        try {
            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i));
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
         public void print(String text,int delay) {
        try {
            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i));
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
    public class javajavajava {
    public static void main(String args[]){
        itenary a=new itenary();
        a.where();
    }
}
