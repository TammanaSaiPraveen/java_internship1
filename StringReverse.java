import java.util.*;
import java.lang.*;
class StringReverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input String That Need To Reverse : ");
        String str=sc.nextLine();
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
}
