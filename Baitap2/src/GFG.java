import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
        // Initializing String variable with null value
        String ptr = null;

        // Checking if ptr is null using try catch.
        try
        {
            if ("gfg".equals(ptr))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("Caught NullPointerException");
        }
    }
}


// khi chay doan ma tren thi se xay ra loi Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "ptr" is null
//	at GFG.main(GFG.java:9)

//sau khi sua code

//doan code da chay duoc va in ra NullPointerException Caught, boi vi khi su dung try catch da xu ly duoc ngoai le NullPointerException

//sua code lan 2

//in ra notsame, vi khong xay ra ngoai le