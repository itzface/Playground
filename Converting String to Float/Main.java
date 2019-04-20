import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner input  = new Scanner(System.in);
    String S = input.nextLine();
    int length = S.length();
    double aftDec = 0;
    double befDec = 0;
    int flag= 0;
    for(int i= 0;i<length;i++)
    {
      if(S.charAt(i)=='.')
        flag=1;
    }
    if(flag==1)
       {
         for(int i = length-1;S.charAt(i)!='.'&&i>=0;i--)
         {
           aftDec = aftDec/10+(S.charAt(i)-'0');
         }
         aftDec = aftDec/10;
         for(int i = 0;S.charAt(i)!='.';i++)
         {
           befDec = befDec*10+(S.charAt(i)-'0');
         }
       }
       else
       {
         for(int i =0;i<length;i++)
         {
           befDec= befDec*10+(S.charAt(i)-'0');
         }
       }
       double sum = (aftDec+befDec);
       System.out.printf("%6f",sum);
       }
       }
    
  
