package lab_01;

import java.util.Scanner;

/**
 * This program helps children to learn multiplication.
 */
public class PowerOf {

    /**
     * lab_01.Main method of the lab_01.PowerOf class. This method starts the game, and runs its needed methods.
     * @param args
     */
    public static void main(String[] args){
        PowerOf powerOf = new PowerOf();
        powerOf.runPowerOf();
    }

    private void runPowerOf(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int baseNumber = Integer.parseInt(scanner.nextLine());  ////Parse String input to int

        System.out.print("Enter your guessed power of the above number: ");
        int possiblePowerOf = Integer.parseInt(scanner.nextLine()); //Parse String input to int

        System.out.println("===========");
        System.out.println("Output: "+ checkPowerOf(baseNumber, possiblePowerOf));  //Check powerOf and print result
    }

    /**
     * While powerOf is bigger than base, divide powerOf by base.
     * If it is smaller check if powerOf is 1, if it is true than powerOf is power of base.
     * @param base number as int
     * @param powerOf number as int
     * @return true if powerOf is power of base, else return false
     */
    private boolean checkPowerOf(int base, int powerOf) {
        int power = 0;
        while(powerOf >= base) {
            powerOf/=base;
            power++;
        }
        if(powerOf==1){
            System.out.println("Power: "+power);
            return true;
        }
        return false;
    }
}
