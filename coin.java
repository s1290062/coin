import java.util.*;
class coin{
    public static void main(String[] args){
	int a,i;
	Random random =new Random();
	System.out.println("Tossing a coin...");
	for(i=1;i<4;i++){
	    a = random.nextInt(2)%2;
	    if(a==1){   
		System.out.println("Round "+i+": Heads");
	       
	    }
	    if(a==0){
		System.out.println("Round "+i+": Tails");
	    }
	}
	System.out.println("Heads :1, Tails: 2");
	
    }
}
