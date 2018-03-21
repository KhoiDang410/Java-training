/*Project 1
Create a program that determines whether a bill proposed in the United States Congress has
become a law. The first step in having a bill become a law is to have it pass the United States
House of Representatives. Since there are 435 representatives in the House, a majority of them
(218 or more) would have to vote for the bill to have it pass. The program should prompt the
user for the number of representatives voting for the bill. If the bill does not pass the House then
the program should end by informing the user that the bill did not pass the House and did not
become a law.
If a bill passes the House then the bill will move to the United States Senate. There are 100
senators in the Senate and a majority of them (51 or more) would need to vote for a bill to have it
pass. The program should prompt the user for the number of senators voting for the bill. If the
bill does not pass the Senate then the program should end by informing the user that the bill did
not pass the Senate and did not become a law.
If a bill passes the Senate then the bill is sent to the President of the United States. He or she has
the option to sign or veto it. The program should prompt the user for the president’s action. If
the president signs the bill then the bill becomes a law. The program should end by informing
the user that the bill has become law.
If the president vetoes the law the bill is sent back to Congress for a potential override of the
president’s veto. The override vote begins in the House. The House must vote again, but now a
two thirds of the representatives (290 or more) must vote for the bill to override it in the House.
The program should prompt the user for the number of representatives voting to override the
president’s veto. If the bill does not get at least 290 votes then the program should end by
informing the user that the House was unable to override the president’s veto and the bill did not
become a law.
If the House is able to override the president’s veto then the bill will move the Senate. The
Senate must vote again, but now two thirds of the senators (67 or more) must vote for the bill to
override it in the Senate. The program should prompt the user for the number of senators voting
to override the president’s veto. If the bill does not get at least 67 senators the program should
end by informing the user that the Senate was unable to override the president veto and the bill
did not become a law. If the Senate is able to override the president’s veto the program should
inform the user that veto is overridden and the bill becomes a law without the president’s
signature.*/
import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        // pass the US House of Representatives
        System.out.println("Input the number of representatives voting for the bill");
        Scanner keyboard = new Scanner(System.in);
        int numberOfRepresentatives=keyboard.nextInt();
        if (numberOfRepresentatives<218){
            System.out.println("The bill did not pass the House and did not become a law");
        }else {

            //pass the US Senate
            System.out.println("Input the number of senators voting for the bill");
            int numberOfSenator = keyboard.nextInt();
            if (numberOfSenator<51){
                System.out.println("The bill did not pass the Senate and did not become a law");
            }else{

                //pass the President
                System.out.println("Does the president sign the bill? yes/no");
                String isSign = keyboard.next();
                if (isSign.toLowerCase().trim().equals("yes")){
                    System.out.println("The bill had become law");
                }
                else{

                    //Override vote in Representatives
                    System.out.println("Input the number of Representatives voting to override the president's veto");
                    numberOfRepresentatives = keyboard.nextInt();
                    if(numberOfRepresentatives<290){
                        System.out.println("The House was unable to override the president's veto and the bill did not become a law");
                    }else{

                        //override vote in Senate
                        System.out.println("Input the number of Senators voting to override the president's veto");
                        numberOfSenator=keyboard.nextInt();
                        if(numberOfSenator<67){
                            System.out.println("The Senate was unable to override the president veto and the bill did not become a law");
                        }else System.out.println("The veto is overridden and the bill becomes a law without the president’s signature");
                    }
                }
            }} 
            keyboard.close();
    }
}
