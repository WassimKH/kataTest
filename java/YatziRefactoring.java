
import java.util.Arrays;

public class YatziRefactoring {

	    public static int chance(int [] dice)
	    {
	    	int total = 0;
	    	total =  Arrays.stream(dice).sum();
	        return total;
	    }

	    public static int yatzy(int [] dice)
	    {
	       int referenceVal=dice[0];
	       if(Arrays.stream(dice).allMatch(p -> p== referenceVal)){
	    	   return 50;
	       }
	       return 0;
	    }

	    public static int onesTwosThreesFoursFivesSixes(int numberChoose, int [] dice) {    	
	    	int total = 0;
	    	total = (int) Arrays.stream(dice).filter(d->d==numberChoose).sum();
	        return total;
	    }

	    public YatziRefactoring(){}

		public static int score_pair(int [] dice)
	    {
	    	Arrays.sort(dice);
	    	int max=0;
	    	try {
	    		
		    	for(int i=0; i<dice.length-1; i++){
		    		if(dice[i]==dice[i+1] && dice[i]>max){
		    			max = dice[i];
		    		}
		    	}
		        
		    	}catch(IndexOutOfBoundsException e){
		    		System.err.println("Erreur: vérifier l'ndex du tableau" + e);
		    	}finally {
		    		max= max*2;
		    	}
	    	return max;
	    }

		public static int two_pair(int [] dice)
	    {
	    	Arrays.sort(dice);
	    	int numberOfpair =0;
	    	int  total=0;
	    	try{
		    	for(int i=0; i<dice.length-1; i++){
		    		if(dice[i]==dice[i+1]){	    			
		    				total += dice[i]*2;
		    				numberOfpair++;
		    				i++;
		    		}
		    	}
	    	
		    }catch(IndexOutOfBoundsException e){
	    		System.err.println("Erreur: vérifier l'index du tableau" + e);
		    }
	    		if(numberOfpair==2)
		    	    return total;
		    	else
		    		return 0;

	    }

	    public static int number_of_a_kind(int number, int [] dice)
	    {
	    	 Arrays.sort(dice);
			 switch(number){
	 		    case 3:
	 				for(int i=0; i<dice.length-2; i++){
	 					if((dice[i]==dice[i+1]) && (dice[i+1]==dice[i+2])){
	 						return dice[i] * 3;
	 					}
		    			
		    		}
		    		break;
		    	case 4:		
		    		for(int i=0; i<dice.length-3; i++){
		    			if(dice[i]==dice[i+1] && dice[i+1]==dice[i+2] && dice[i+2]==dice[i+3]){
				    		return dice[i] * 4;
			    		}
		    		}			    	
			    	break;
			 }
			 return 0;
	    }


	    public static int smallStraight(int [] dice)
	    {
	    	Arrays.sort(dice);
	        if(dice[0]==1 && dice[1]==2 && dice[2]==3 && dice[3]==4 && dice[4]==5)
	        return 15;
	        else
	        return 0;
	    }

	    public static int largeStraight(int [] dice)
	    {
	    	Arrays.sort(dice);
	    	 if(dice[0]==2 && dice[1]==3 && dice[2]==4 && dice[3]==5 && dice[4]==6)
	 	        return 20;
	 	        else
	 	        return 0;
	    }

	    public static int fullHouse(int [] dice)
	    {
	    	Arrays.sort(dice);
	    	int total = 0;
	    	if(dice[0]==dice[1]  && dice[1]==dice[2] && dice[3]==dice[4] 
	    		|| dice[0]==dice[1]  && dice[2]==dice[3] && dice[3]==dice[4]){
	    		
	    		total = (int) Arrays.stream(dice).sum();
	    }
	    	return total;
	    }
}
