package puppy;
import java.util.*;
public class VirtualPuppyApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		VirtualPuppy pongo = new VirtualPuppy("Pongo");
		
		System.out.println("Hello new friend!");
		System.out.println("I am " + pongo.getName());
		System.out.println("A playful puppy");
		System.out.println("Attention:" + pongo.getAttentionLevel());
		System.out.println("Hunger:" + pongo.getHungerLevel());
		System.out.println("Thirst:" + pongo.getThirtLevel());
		System.out.println("Sleepiness:" + pongo.getSleepinessLevel());
		System.out.println("Cleanliness:" + pongo.getCleanlinessLevel());
		
		System.out.println("What would you like to do?");
		System.out.println("1 to play with Pongo");
		System.out.println("2 to feed Pongo");
		System.out.println("3 to give Pongo a drink");
		System.out.println("4 to put Pongo to bed");
		System.out.println("5 to take Pongo for a Walk");
		System.out.println("6 to end visit with Pongo");
		String puppyOption = input.nextLine(); 
		
		do{
			
			if (puppyOption.contentEquals ("1")) {
				pongo.play();
				System.out.println("Pongo loves to play!\nWould you like to do anything else?");
				puppyOption = input.nextLine();
				System.out.println("Attention:" + pongo.getAttentionLevel());
				System.out.println("Hunger:" + pongo.getHungerLevel());
				System.out.println("Thirst:" + pongo.getThirtLevel());
				System.out.println("Sleepiness:" + pongo.getSleepinessLevel());
				System.out.println("Cleanliness:" + pongo.getCleanlinessLevel());
				}
			
			else if (puppyOption.contentEquals("2")) {
				pongo.eat();
				pongo.tick();
				System.out.println("You fed Pongo his favorite treat!\nWhat else would you like to do with Pongo?");
				puppyOption = input.nextLine();
				System.out.println("Attention:" + pongo.getAttentionLevel());
				System.out.println("Hunger:" + pongo.getHungerLevel());
				System.out.println("Thirst:" + pongo.getThirtLevel());
				System.out.println("Sleepiness:" + pongo.getSleepinessLevel());
				System.out.println("Cleanliness:" + pongo.getCleanlinessLevel());
				
			}
			else if (puppyOption.contentEquals("3")) {
				pongo.drink();
				System.out.println("Pongo sure was thirsty! \nWhat's next?");
				puppyOption = input.nextLine();
				System.out.println("Attention:" + pongo.getAttentionLevel());
				System.out.println("Hunger:" + pongo.getHungerLevel());
				System.out.println("Thirst:" + pongo.getThirtLevel());
				System.out.println("Sleepiness:" + pongo.getSleepinessLevel());
				System.out.println("Cleanliness:" + pongo.getCleanlinessLevel());
				
				
			}
			else if (puppyOption.contentEquals("4")) {
				pongo.sleep();
				System.out.println("shsssss! Pongo is sleeping!");
				puppyOption = input.nextLine();
				System.out.println("Attention:" + pongo.getAttentionLevel());
				System.out.println("Hunger:" + pongo.getHungerLevel());
				System.out.println("Thirst:" + pongo.getThirtLevel());
				System.out.println("Sleepiness:" + pongo.getSleepinessLevel());
				System.out.println("Cleanliness:" + pongo.getCleanlinessLevel());
				
				
			}
			else if (puppyOption.contentEquals("5")) {
				pongo.poop();
				pongo.tick();				
				System.out.println("Pongo was excited for the walk, would you like to do anyting else?");
				puppyOption = input.nextLine();
				System.out.println("Attention:" + pongo.getAttentionLevel());
				System.out.println("Hunger:" + pongo.getHungerLevel());
				System.out.println("Thirst:" + pongo.getThirtLevel());
				System.out.println("Sleepiness:" + pongo.getSleepinessLevel());
				System.out.println("Cleanliness:" + pongo.getCleanlinessLevel());
				}
			
			else {
				System.out.println("Thank you for visiting Pongo!\nSee you next time!!");
				System.exit(0);
			}
			}while (!puppyOption.contentEquals ("6")); 
		
			
		}
		
		}
	
		
	


