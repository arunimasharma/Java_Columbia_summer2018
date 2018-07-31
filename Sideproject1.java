package sct;
 import java.util.Scanner; 
public class Sideproject1 {
	
	public Sideproject1() {
		// TODO Auto-generated constructor stub
	}
system.out.println("Hi")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Welcome to SpaceQuest");
		System.out.println("To begin your adventure, please type 1 ");
		int Begin=input.nextInt();
		if(Begin==1)
System.out.println("Hello agent, you have been recruited for a special mission.");
System.out.println("If you choose to embark on this dangerous quest, we will start with");
System.out.println("your name. Please enter your favorite number ");
int Myname = input.nextInt  ();
System.out.println("Ok agent" + Myname );
System.out.println("Sorry that we had to convert your name to a number.");
System.out.println("We cannot risk the enemy revealing your secret identity." );
System.out.println();
System.out.println("Alrighy then, I should introduce myself. I am beepo, your UI");
System.out.println("Agent" + Myname + " are you ready?");
System.out.println("Answer 1 for yes, and 2 for no");
int Hello=input.nextInt();
if(Hello==1) {
	System.out.println("Awesome!");
	
}else {
	System.out.println("This is awkward. I was expecting you to say yes.");
	System.out.println("You are going on this mission anyway!");
	
}

System.out.println("This mission will test your intellect and courage." );
System.out.println("For our first order of business, we will enter our spaceship.");
System.out.println("Don't worry, I made sure that it is safe.");
System.out.println("Please strap in your seatbelt! Our first destination will take us to the planet Mars, ");
System.out.println("intelligence operatives have told us about a secret dungeon full of stolen candy");
System.out.println();
System.out.println(" Our mission is to retrieve these items.");
System.out.println("In order to do so, we have to sneak in the enemies' secret base. ");
System.out.println("(You look to the left and see the timer count down )");
System.out.println();

System.out.println("Beepo: Only 3 seconds left!");
System.out.println("3");
System.out.println("2");
System.out.println("1!");
System.out.println();
System.out.println("You start to float, as you head toward the upper atmosphere");
System.out.println("THIS IS INCREDIBLE! Being a UI, I have never been to space before!"); 
System.out.println();
System.out.println();
System.out.println("5 minutes later...");
System.out.println("Oh no! We ran into a problem with the engine!");
System.out.println( "agent"+Myname+  "  Choose a wire to cut");
System.out.println();
System.out.println("Type in 1, 2, or  3.  I believe in you agent"+ Myname);
int Wire=input.nextInt();
if(Wire==1) {
	System.out.println("YES! The engine is back online!");
	
}else if(Wire==2) {
	System.out.println("That was a close one! The engine is safe!");
	
}else { 
	System.out.println("Correct! I was so nervous, thank you!");

}
System.out.println();
System.out.println("10 minutes later...");
System.out.println("Are you serious right now! ");
System.out.println("We are right across from an asterioid field agent"+ Myname );
System.out.println("Choose a direction to move! 1 for right and 2 for left");
int Direction=input.nextInt();
if(Direction==1) { 
	System.out.println();
	System.out.println();
	System.out.println("Agent" +Myname +", we are heading straight to planet Java!");
	System.out.println("Looks like the right direction was not right!");
}else {
	
	System.out.println("Rats! We are off course! We are now set for Planet Java");
	

}


System.out.println("15 minutes later...");
System.out.println();
System.out.println();
System.out.println("agent"+ Myname);
System.out.println(" Wake up!");
System.out.println("(You begin to open your eyes and notice a world with java code)");
System.out.println("This planet is Java. Known for it's complex systems, Planet Java is a popular tourist attraction");
System.out.println();
System.out.println();
System.out.println();
System.out.println("As you can see, the lands and the sky are written in the  boolean and integer ");
System.out.println("data type");
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println("(Suddenly a large computer appears before you and Beepo) ");
System.out.println();
System.out.println(" Hey! I am Carle The Computer! ");
System.out.println("Type in 1 to listen to what Carle has to say");
System.out.println("Type in 2 to run away");
System.out.println("Type in 3 to sleep");
int DanDragon=input.nextInt();
if(DanDragon==1) {
	System.out.println(" Carle:Thank you!");
	System.out.println();
	System.out.println();
} else if (DanDragon==2) {
	System.out.println("agent"+ Myname + " you should probably listen");
	System.out.println();
	System.out.println();
}else if(DanDragon==3) {
	System.out.println("Now is not the time for that! ");
	System.out.println();
	System.out.println();
}
System.out.println("Carle: I see that you are in need of a spaceship");
System.out.println(" I will only provide you with one if you can solve my coding question.");
System.out.println("This is Planet Java after all!");
		
System.out.println(" Beepo: I am not that great with riddles. This is all you agent"+Myname+".");
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println(" Carle: Is java an object oriented programming language?");
System.out.println("Type in 1 for yes, and 2 for no");
int Riddle=input.nextInt();
if (Riddle==1) {
	System.out.println("Fantastic!");

}else {
	System.out.println( "Carle: Sorry that is incorrect. However, I am feeling nice today.");
}
System.out.println();
System.out.println();
System.out.println();
System.out.println(" Beepo: Great job agent!");
System.out.println();
System.out.println();
System.out.println("(You blink)");
System.out.println("(You open your eyes to find yourself in a new transportation vessel soaring through the depths");
System.out.println("of space.)");
System.out.println();
System.out.println();
System.out.println("Beepo: What's our next move agent?");
System.out.println();
System.out.println();
System.out.println("(You look outside the spacecraft to see a group of stars forming this pattern below...)");
int i;
int j; 
for(i=0;i<4;i++){
for(j=1;j<=i;j++ ) {
      System.out.print("*");
    
}
System.out.println();
}
for(; i>=0;i--) {
for(j=1; j<=i; j++) {
System.out.print('*');
}
System.out.println();




}
System.out.println("(You look below your feet. There is a pattern of bollts and nails...) ");

int a;
int b; 
int k;

for ( a=0; a<8; a++)
{
for(b=a;b<8;b++) {

	 System.out.print(" ");
}
		for(  k=0; k<=a; k++) {
		System.out.print("* "); 	 
	 





}
		System.out.println();
	}
	
System.out.println();
System.out.println();
System.out.println("Agent"+Myname);
System.out.println("Choose a pattern to follow.");
System.out.println("Type 1 for the first pattern, and 2 for the second. ");
int Pattern=input.nextInt();
if(Pattern==1) {
	System.out.println(" Agent, we are heading to a black hole. This mission is a failure. ");
			
}else {
	System.out.println(" Agent,  we are heading to a black hole. This mission is a failure.");
	System.out.println("Game over");
}
	
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println("SpaceQuest Part 2");
System.out.println();
System.out.println();
System.out.println();
System.out.println("15 years after the events of SpaceQuest, we begin a new adventure. Alien forces have taken over");
System.out.println();
System.out.println();
System.out.println();
System.out.println("It is up to you now, avenge the agent in SpaceQuest!");
System.out.println();
	

Scanner num = new Scanner(System.in);
String f;
f = num.nextLine() ;


System.out.println("Beeee, Beeeeee, Beeeee...");
System.out.println("Captain " + a + "! The Spaceship is now heading to the Black Hole ‘Fukushima’!");
System.out.println("According to our knowledge, If we are attracted by the gravity of the Black Hole, we will not be able to get out of the obitor.");
System.out.println("And everyone in the ship will die!");
System.out.println("1. Trying to turn the spaceship around.");
System.out.println("2. Keep heading towards Fukushima.");
Scanner scan2=new Scanner(System.in);
int  g = scan2.nextInt();
		
if (g <= 1)
{System.out.println("Yes, Captain. Everyone on position.");
System.out.println("Power up, all the way back.");
System.out.println("Captain, I guess we are now facing another problem.");
System.out.println("The engine is slowing down. We have to find a Way to fix it.");
System.out.println("1.Ask the genius engineer Dr. Ralph to fix it as fast as he can.");
System.out.println("2.Go back to the engine room and try to fix the problem with the engine group.");
Scanner scan3=new Scanner(System.in);
int c = scan3.nextInt();
if (c <= 1)
{System.out.println("Dr.Ralph has headed to the engine room");
System.out.println("The engine of the ship is now extremely unstable, it is gonna explode under any kind of condition.");
System.out.println("1.Command Dr. Ralph to fix the engine in 30 minutes, otherwise he will be executed.");
System.out.println("2.Give up the Recycle room of the spaceship to decrease the burden of the engine.");
Scanner scan4=new Scanner(System.in);
int d = scan4.nextInt();
if (d<=1)
{System.out.println("Dr. Ralph has taken the escape capsule and left the ship.");
System.out.println("The main engineer of the spaceship is exploding.");
System.out.println("The operating room is now lost control.");
System.out.println("Everyone now is heading to the escape capsule.");
System.out.println("1.Run to the escape capsule room, take one capsule, and fly far away from the spaceship.");
System.out.println("2.Leave the escape capsules to other crew members and watch deeply inside the black hole.");
Scanner scan5=new Scanner(System.in);
int e= scan5.nextInt();
if (e <= 1)
{System.out.println("You have fled away the spaceship, but the your escape capsule hit a meteoroite.");
System.out.println("You died");
System.out.println("Game Over...");}
else
{System.out.println("Fukushima is like a black eye in the boundless universe.");
System.out.println("With the most extraordinary sight, the spaceship explodes.");
System.out.println(a + " died with honor.");}}
else
{System.out.println("The spaceship now is able to flee Fukushima.");
System.out.println("You have saved thousands of lives.");}}
else
{System.out.println("Now, Captain Natasha will control everything that happens in the operating room.");}}
else
{System.out.println("All right, it's time to face an adventure.");
System.out.println("Let's see what is in the black hole");}

	
	}
	
}









 


