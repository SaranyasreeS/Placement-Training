import java.util.*;
public class ValidatePassword {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a passwer: ");
        String s = scan.nextLine();
        int l = s.length();
        int uc = 0, lc = 0, dc = 0, sc = 0;
        boolean sp = true;
        if(l >= 8){
            for(int i = 0; i < l; i++){
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') uc++;
                else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') lc++;
                else if(s.charAt(i) >= '0' && s.charAt(i) <= '9') dc++;
                else if(s.charAt(i) == ' '){
                    sp = false;
                }
                else{
                    sc++;
                }
            }
            if(l >= 8 && uc >=1 && lc >= 2 && dc >= 1 && sc >= 1 && sp){
                System.out.println("Valid Password.");
            }else{
                System.out.println("Not a valid password.");
            }
        }
    }
}
