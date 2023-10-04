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

            int[] talen = {4,5,2};
            if (talen[0]>talen[1]&&talen[0]>talen[2]){
                System.out.println("Första talet är större än det andra talen");
            } else if (talen[0]>talen[1]&&talen[0]<talen[2]){
                System.out.println("Första talet är större än andra talet men inte tredje");
            } else if (talen[0]<talen[1]&&talen[0]>talen[2]){
                System.out.println("Första talet är mindre än andra talet men större än tredje talet");
            }

            if (talen[0]<talen[1]&&talen[0]<talen[2]){
                System.out.println("Första talet är mindre än det andra talen");
            } else if (talen[0]<talen[1]&&talen[0]>talen[2]){
                System.out.println("Första talet är mindre än andra talet men större än tredje talet");
            } else if (talen[0]>talen[1]&&talen[0]<talen[2]){
                System.out.println("Första talet är större än andra talet men mindre än tredje talet");
            }

            if (talen[0]==talen[1]&&talen[0]==talen[2]){
                System.out.println("Första talet är samma som de andra talen");
            } else if (talen[0]!=talen[1]&&talen[0]==talen[2]){
                System.out.println("Första talet är inte samma som andra men samma som tredje talet");
            } else if (talen[0]==talen[1]&&talen[0]!=talen[2]){
                System.out.println("Första talet är samma som andra men inte samma som tredje talet");
            }

            System.out.println("Skriv ett tal för att testa");
            int gissning = tangentbord.nextInt();
            int orginal=gissning;

            gissning+=7;
            gissning*=2;
            gissning-=6;
            gissning/=2;
            gissning+=3;
            gissning-=orginal;

            System.out.println(gissning+" är ditt tal?");

        }
    }
    
}
