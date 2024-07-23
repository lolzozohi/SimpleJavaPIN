import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    int[] PIN = {1234, 5678, 1010, 007, 1, 2024};

    Scanner in = new Scanner(System.in);
            int tries = 0;
            while(true) {
                System.out.println("Enter your PIN number:");
                int pin = in.nextInt();
                for(int i = 0; i < PIN.length; i++){
                if(pin == PIN[i]) {
                    System.out.println("Your PIN is correct!");
                  String[] targets = {"Jaden Metha", "Ridwan Sahoo", "Shereen Wu ", "Adarsh Bhakta", "Zahraa Khan" , "Allison Chowdhury ", "Pranav Vipat"};
                    
                  System.out.println(" ");
                  System.out.println("Targets:");
                      for (String target : targets) {
                              String[] names = target.split(" ");
                              String firstName = names[0];
                              String lastName = names[names.length - 1];

                              System.out.println("First Name: " + firstName + ", Last Name: " + lastName);

                              char firstInitial = firstName.charAt(0);
                              char lastInitial = lastName.charAt(0);
                              System.out.println("Initials: " + firstInitial + lastInitial);
                              System.out.println();
                          }
                    System.exit(0);
                }
                }
                tries++;
              
                if(tries >= 3) {
                    System.out.println("Your bank card is blocked!");
                    System.exit(0);
                }
                else if(tries == 1){
                    System.out.println("Your PIN is incorrect!");
                    }
                else if(tries == 2){
                      System.out.println("Your PIN is incorrect!");
                      System.out.println("You have one more try!");
                      }
                }
            }
  
        }
