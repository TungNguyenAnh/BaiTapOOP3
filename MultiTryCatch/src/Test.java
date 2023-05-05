import java.util.Scanner;

public class Test
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        try
        {
            int n = Integer.parseInt(scn.nextLine());
            if (99%n == 0)
                System.out.println(n + " is a factor of 99");
        }
        catch (NumberFormatException | ArithmeticException ex)
        {
            System.out.println("Exception encountered " + ex);
        }
    }
}

// Có tất cả 2 khối lệnh catch, "catch 1 sử dụng để catch lỗi ArithmeticException, catch thứ 2 dùng để catch lỗi NumberFormatException)
// GeeksforGeeks
//Number Format Exception java.lang.NumberFormatException: For input string: "GeeksforGeeks"
//bởi vì dữ liệu nhập vào không chính xác nên đã sử dụng lệnh try catch
//0
//Arithmetic java.lang.ArithmeticException: / by zero
// dữ liệu nhập vào đúng
// nhập vào 4 không có gì xảy ra
//nhập vào 3