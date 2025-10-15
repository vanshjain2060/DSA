import java.util.*;;
public class MeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int maxi = Math.max(a, Math.max(c, b));
        int mini = Math.min(a, Math.min(c, b));
        int mid = c;
        if(a != mini && a != maxi) mid = a;
        else if(b != mini && b != maxi) mid = b;
        else if(c != mini && c != maxi) mid = c;
        
        System.out.println(Math.abs(mid - maxi) + (mid - mini));
    }
}
