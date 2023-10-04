import java.util.Scanner;

public class uppg1_operation {
    public static void main(String[] args) throws Exception {
        System.out.println("Skriv 2 heltal: ");
        try (Scanner tangentbord = new Scanner(System.in)){
            int[] heltal = new int[2];
            heltal[0] = tangentbord.nextInt();
            heltal[1] = tangentbord.nextInt();

            if (heltal[0]==heltal[1]){
                System.out.println("Dina tal är samma tal ");
            } else {
                System.out.println("Dina heltal är inte samma tal");
            }

            if (heltal[0]<heltal[1]){
                System.out.println("Ditt första heltal är mindre än det andra!");
            } else {
                System.out.println("Ditt första heltal är inte mindre än det andra!");
            }

            if (heltal[0]>heltal[1]){
                System.out.println("Ditt första heltal är större än det andra!");
            } else {
                System.out.println("Ditt första heltal är inte större än det andra!");
            }
        }
    }
    
}
