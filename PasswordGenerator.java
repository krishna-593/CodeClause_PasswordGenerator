import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    // The Constraints of the password are:
    // 1.The length of password must be greater than or equal to 8.
    // 2.It should contain at least one uppercase letter.
    // 3.It should contain at least one lowercase letter.
    // 4.It should contain at least one number.
    // 5.It should contain at least one of the following special characters: ~,!,@,#,$,%,^,&,*,(,:,_,+,-,=,),.,,,;,?,<,>

    public static char[] passwordgenerator(int n)
    {
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String specialchar = "~!@#$%^&*():_+-=.,;?<>";
        String numbers = "0123456789";

        char[] password=new char[n];
        String setpassword = uppercase + lowercase + specialchar + numbers;

        Random r=new Random();
        password[0] = uppercase.charAt(r.nextInt(uppercase.length()));
        password[1] = lowercase.charAt(r.nextInt(lowercase.length()));
        password[2] = numbers.charAt(r.nextInt(numbers.length()));
        password[3] = specialchar.charAt(r.nextInt(specialchar.length()));

        for(int i=4;i<n;i++)
        {
            password[i]=setpassword.charAt(r.nextInt(setpassword.length()));
        }
        return password;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the password required(Minimum length of the password is 8): ");
        int n=sc.nextInt();
        if(n<8)
        {
            System.out.println("Minimum length should be 8");
        }
        else
        {
            System.out.println("The generated password is:");
            System.out.println(passwordgenerator(n));
        }
    }
}
