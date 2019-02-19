//Understanding Stack basics Push,pop,IsFull


import java.util.Arrays;

public class TheStack {

	private String[] stackArray;
	private int stacksize;
	private int topOfStack= -1;


	TheStack(int size){
		stacksize =size;
		 stackArray = new String[size];
		Arrays.fill(stackArray, "-1");
		
	}
	
	public void push(String element) {
		
		if(topOfStack+1 < stacksize) {
			topOfStack++;
			stackArray[topOfStack] = element;
		}
		else {
			System.out.println("Stack size is not that big");
		}
		
		
	}
	
	public void pop() {
		if(topOfStack >= 0) {
			System.out.println("element " +stackArray[topOfStack] +" was removed" );
			stackArray[topOfStack]= "-1";
			topOfStack--;
			
		}
		else {
			System.out.println("Sorry you dont have enough elements");
		}
		
	}
	
	public boolean isFull() {
		
		if(topOfStack+1>= stacksize) {
			return true;
		}
		else return false;
	}
	
	


    public void displayTheStack(){
   

            for(int n = 0; n < 61; n++)System.out.print("-");
        System.out.println();
        for(int n = 0; n < stacksize; n++){
            System.out.format("| %2s "+ " ", n);

           }
          System.out.println("|");
           for(int n = 0; n < 61; n++)System.out.print("-");
           System.out.println();

            for(int n = 0; n < stacksize; n++){
            if(stackArray[n].equals("-1")) System.out.print("|     ");

                else System.out.print(String.format("| %2s "+ " ", stackArray[n]));
         }   
            System.out.println("|");
       for(int n = 0; n < 61; n++)System.out.print("-");

            System.out.println();

         

         }

	
	
	public static void main(String[] args) {
		
		
		TheStack mystack = new TheStack(10);
		mystack.push("10");
		
		mystack.push("16");
		mystack.push("1");
		mystack.push("7");
		mystack.push("13");
		mystack.push("16");
		mystack.push("1");
		mystack.push("7");
		mystack.push("13");
		mystack.push("16");
		mystack.push("1");
		mystack.displayTheStack();
		System.out.println(mystack.isFull());
		
	}
	
	
	
}
