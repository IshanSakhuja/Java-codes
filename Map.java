import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Long> ishan = new HashMap<>();
        int i,j,num,test;
        Long temp;
        String str;
        test = scanner.nextInt();
        for(i=0;i<test;i++)
        {
            scanner.nextLine();
            str = scanner.nextLine();
            temp = scanner.nextLong();
            ishan.put(str,temp);
        }
        scanner.nextLine();
        for(i=0;i<test;i++)
        {
            str = scanner.nextLine();
            if(ishan.get(str) == null)
                System.out.println("Not found");
             else
                System.out.println(str+"="+ishan.get(str));
        }
    }
}