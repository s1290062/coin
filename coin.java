import java.util.*;

class coin{
    public static void main(String[] args){

	int i,a,c=0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Who are you?");
	System.out.print(">");
	String name = sc.next();
	System.out.println("Hello, "+name+"!");
	

	Random random =new Random();
	System.out.println("Tossing a coin...");
	for(i=1;i<4;i++){
	    a = random.nextInt(2)%2;
	    if(a==1){   
		System.out.println("Round "+i+": Heads");
		c++;
	    }
	    if(a==0){
		System.out.println("Round "+i+": Tails");
	    }
	}
	    System.out.println("Heads :1, Tails: 2");
	    if(c>=2) System.out.println(name+" won!");
	    else System.out.println(name+" lost!");



	
    }
}
