//program for implementing operators
public class programa{
    public static void main(String[] args){
        int a=20; int b=30; 
        int c=a/b; //arithmetic operator
        int d=a||b; //bitwise operator
        //ternary operator
        int e=(c>d)?c:d;
    }
}

//program for find out prime number
public class programb{
    static void checkprime(int n){
        int i,m=0,f=0; m=n/2;
        if(n==0||n==1) System.out.println("Not a prime");
        else {
            for(i=2;i<=m;i++){      
                if(n%i==0){      
                 System.out.println("Not a prime");      
                 f=1;  break;      
                }      
               }      
    if(f==0)  { System.out.println("Is Prime"); }  
        }

    }
    public static void main(String[] args){
        //taking the number as input
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        checkprime(a);
    }
}

//program to check year is leapyear or not
public class programc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        boolean leap=false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0) leap=true;
                else leap=false;
            }
            else leap=true;
        }
        else leap=false;
        if(leap) System.out.println("Leap year");
        else System.out.prinln("Not a Leap Year")
    }
}
//program to find sum of first ten numbers
public class programd{
public static void main(String[] args){
    int sum=0;
    for(int i=0;i<10;i++){
        sum+=i;
    }
    System.out.print(sum);
}
}

//program to implement swtich statement
public class programe{
    public static void main(String[] args){
        int answer=5;
        String day="";
        swtich(answer){
            case 0:day="Sunday";
            break;
            case 1:day="Monday";
            break;
            case 2:day="Tuesday";
            break;
            case 3:day="Wednesday";
            break;
            case 4:day="Thursday";
            break;
            case 5:day="Friday";
            break;
            case 6:day="Saturday";
            break;
        }
        System.out.println(day);
    }
}