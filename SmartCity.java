package JAVAENDSEM;

import java.util.Random;
import java.util.Scanner;
interface overall{
  void print(String text);
}
abstract class outputscreen{
  void display(){};
  void UserOutput(){};
}
public class SmartCity extends outputscreen implements overall {
        Scanner scan=new Scanner(System.in);
  static String airplane;
  class Plane{  
        String Board,Dest;
        int start_time,dest_time; 
        long date;
        int cost;
        Plane next;
        String airplane;  
        public Plane(String Board,String Dest,int start_time,int dest_time,long date,int cost,String airplane) {  
            this.Board = Board;  
            this.Dest=Dest;
            this.start_time=start_time;
            this.dest_time=dest_time;
            this.date=date;
            this.cost=cost;
            this.airplane=airplane;
        }
    }
    Plane head, tail;
    void addFlight(String Board,String Dest,int start_time,int dest_time,long date,int cost,String airplane) {  
        Plane newNode = new Plane(Board,Dest,start_time,dest_time,date,cost,airplane);    
        if(head == null) {  
            head = tail = newNode;  
        }  
        else {   
            tail.next = newNode; 
            tail = newNode;  
        }  
    }

    public void display(){
      Plane temp=head;
      print("List of available flights\n");
      while(temp!=null){
        print("From:"+temp.Board);
        print("To:"+temp.Dest);
        print("Take off time:"+temp.start_time);
        print("Landing Time:"+temp.dest_time);
        print("Cost:"+temp.cost);
        print("Date: "+temp.date);
        print("Airlines:"+temp.airplane);
        print("-----------------------");
        temp=temp.next;
      }
    }
    void UserOutput(){
      System.out.println("+--------------------------------------------------+");
      System.out.println("|                                                  |");
      System.out.println("|       Welcome To The Ultimate Travel Planner     |");
      System.out.println("|                                                  |");
      System.out.println("+--------------------------------------------------+");
      print("\nHello there,How can we help you today?\n");
      print("1) Book a Flight!\n");
      print("2)See all flights\n");
      print("3) Help me decide what to eat today!\n");
      print("4)I am done\n");
      int choice=scan.nextInt();
      scan.nextLine();
      if(choice==1){
        Airline();
      }else if(choice==2){
        display();UserOutput();
      }else if(choice==3){
        itenary i=new itenary();
        i.where();
      }else return;
    }

    void Airline(){
      Plane temp=head;
      int counter=0,stop=0,position=0;;
      print("Where do you want to start?");
      String board=scan.nextLine();
      print("And where do you want to go");
      String dest=scan.nextLine();
      print("When do you want to leave ?(DD/MM/YY)");
      int board_time =scan.nextInt();
      while(temp!=null){
        if(temp.Board.equalsIgnoreCase(board)&&temp.Dest.equalsIgnoreCase(dest)){
          counter++;
          if(counter==1&&stop==0){
            print("Good News! Flights are available");
            stop=1;
          }
          print(counter+".) "+board +" --> "+dest);
          print("    "+temp.airplane);
          print("    Start time:"+temp.start_time+"\n    Dest time:"+temp.dest_time);
          print("    Date:"+temp.date);
          print("----------------------------------");
        }
        temp=temp.next;
      }
      print("So,Which flight do you wish to fly with? (Type the number below)");
      int input=scan.nextInt();
      temp=head;
      counter=0;
      while(temp!=null){
        if(temp.Board.equalsIgnoreCase(board)&&temp.Dest.equalsIgnoreCase(dest)){
          counter++;
          if(counter==input){break;}
        }
        temp=temp.next;
      }
      payment(temp);
      if(counter==0){
        print("Flights Unavailable!");
        print("You have to change few flight to reach your destination from the desired boarding point");
        print("Please Try again in a few days!");
      }
    }
    void payment(Plane plane){
      scan.nextLine();
          print("-----------------------------");
          print(plane.Board +" --> "+plane.Dest);
          print("Company: "+plane.airplane);
          print("Start time:"+plane.start_time+"\nDest time:"+plane.dest_time);
          print("Date:"+plane.date);
          print("One-Way Cost:"+plane.cost);
          print("-----------------------------");
          print("Do you want to finalise this flight?");
          String answer=scan.nextLine();
          if(answer.equalsIgnoreCase("yes")){
            System.out.println("-----------------------");
            print("The total payment will be :Rupees "+plane.cost);
            System.out.println("Do you wish to proceed ?");
            answer=scan.nextLine();
            if(answer.equalsIgnoreCase("no")){
              print("error");
              return;
            }
            print("Perfect!");
            int otp=generateOTP();
            displayOTP(otp);
            System.out.println("Please enter the OTP!");
            int inputOTP=scan.nextInt();
            if(inputOTP==otp){
              print("Authentication Completed!");
              print("Please Wait!");
              try {
                Thread.sleep(5000);  // Sleep for 10 seconds
              } catch (InterruptedException e) {
                e.printStackTrace();
            }
        clearConsole();
              print("CONGRATS! YOUR FLIGHT HAS BEEN CONFIRMED!");
              print("Following are the details: ");
              print(plane.Board +" --> "+plane.Dest);
              print("Company: "+plane.airplane);
              print("Start time:"+plane.start_time+"\nDest time:"+plane.dest_time);
              print("Date:"+plane.date);
              print("One-Way Cost:"+plane.cost);

              print("HAVE FUN !!!!!");
              return;
            }else{ print("ERROR! ERROR! ERROR! WRONG OTP!");
            print("YOU WILL NOW BE REDIRECTED TO THE FRONT PAGE");
            scan.nextLine();
            try {
                Thread.sleep(5000);  // Sleep for 10 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clearConsole();
            
            Airline();
          }
          }else System.out.println("Please Try Again!"); Airline();
    }
       public void print(String text) {
        int delay=50;
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
                System.out.println(text.charAt(i));
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
public static int generateOTP() {
        int otpLength = 6;
        int otp = 0;

        Random random = new Random();
        for (int i = 0; i < otpLength; i++) {
            int digit = random.nextInt(10);  // Generates random digits from 0 to 9
            otp = otp * 10 + digit;
        }

        return otp;
    }

    public static void displayOTP(int otp) {
        System.out.println("Generated OTP: " + otp);
        System.out.println("OTP WILL DELETE IN 10 SECONDS PLEASE MEMORISE IT!!");
        try {
            Thread.sleep(10000);  // Sleep for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clearConsole();
    }
    public static void clearConsole() {
    try {
        final String os = System.getProperty("os.name");
        if (os.contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            Runtime.getRuntime().exec("clear");
        }
    } catch (final Exception e) {
        // Handle exception if unable to clear the console
    }
}

  public static void main(String args[]){
     SmartCity a=new SmartCity();
        a.addFlight("Bangalore","Goa",0700,830,060723,2400,"Air Asia");
        a.addFlight("Bangalore","Goa",900,1030,060723,2430,"Ingigo");
        a.addFlight("Bangalore","Goa",0400,530,070723,2400,"Air Asia");
        a.addFlight("Goa","Chennai",2000,2140,050723,4358,"Spice Jet");
        a.addFlight("Goa","Chennai",1900,2040,060723,4358,"Vistara");
        a.addFlight("Goa","Chennai",1700,1840,070723,4358,"Indigo");
        a.addFlight("Goa","Chennai",400,540,070723,4358,"Indigo");
        a.addFlight("Goa","Bangalore",800,930,070723,2800,"Indigo");
        a.addFlight("Goa","Bangalore",900,1030,070723,2750,"Vistara");
        a.addFlight("Goa","Bangalore",1000,1130,070723,2749,"Air Asia");
        a.addFlight("Bangalore","Chennai",1200,1300,060723,1800,"Air Asia");
        a.addFlight("Bangalore","Chennai",1300,1400,070723,1980,"Spice Jet");
        a.addFlight("Bangalore","Chennai",1400,1500,050723,1900,"Tiger Man");
        a.addFlight("Chennai","Goa",800,930,060723,2300,"Air Asia");
        a.addFlight("Chennai","Goa",100,230,060723,2900,"Singapore Airline");
        a.addFlight("Chennai","Goa",000,130,060723,2200,"Spice Jet");
        a.UserOutput();
  }
  
}
