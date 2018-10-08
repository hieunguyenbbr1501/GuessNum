/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guess;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author admin
 */
public class Guess{
    public static void main(String[] args)
{
    Random number = new Random();
    int n = number.nextInt(100)+1;
    int count = 0;
    for(int i=0;i<10;i++)
    {
        count++;
        Scanner r = new Scanner(System.in);
        int a = r.nextInt();
        if(a<n)
        {
            System.out.println("nho hon so da cho");
        }
        if(a>n)
        {
            System.out.println("lon hon so da cho");
        }
        if(a==n)
        {
            System.out.println("dap an chinh xac");
            break;
        }
        if(count==10&&a!=n)
        {
            System.out.println("het luot doan");
            break;
        }
    }
}
} 
