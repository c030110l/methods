import java.util.Scanner;

class question7 {
    
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int numdice = 0;   
        int sides   = 0;   
        int dieroll = 0;   
        int total   = 0;   
        String ans  = "y"; 
        
        while (ans.equals("y")) {
            System.out.print("How many dices are you rolling? ");
            numdice = sc.nextInt();
            System.out.print("How many sides do these dice have? ");
            sides = sc.nextInt();
           
            System.out.println("");
            System.out.print("You rolled a: ");
            
            total = 0;
            for (int i = 0; i < numdice; i++) {
                dieroll = rollDie(sides);
                total = total + dieroll;
                System.out.print(dieroll + " ");
            }
            
            System.out.println("");
            System.out.println("Total: " + total);
            System.out.println("");
            
            System.out.print("plat again? [y,n] ");
            ans = sc.next();
            System.out.println("");            
        }
    }
    
    public static int rollDie(int s) {
        return (int) (Math.random()*s)+1;
    }
}
