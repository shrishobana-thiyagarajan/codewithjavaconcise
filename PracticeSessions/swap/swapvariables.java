public class swapvariables {
    public static void main(String[] args)
    {
        String x="Swap 1";
        String y="Swap 2";
        String temp;

        temp=x;
        x=y;
        y= temp;

        System.out.println("x1:"+x);
        System.out.println("y2:"+y);
    }
}

