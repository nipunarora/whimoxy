import java.io.*;
public class EncryptReader extends Reader {
	private String DecryptedSentense;
	
	public void read(String EncryptedSentense)
	{
		DecryptedSentense="";
		for(int i=0;i<EncryptedSentense.length();i++)
		DecryptedSentense = DecryptedSentense+decrypt(EncryptedSentense.charAt(i));
	}
	private char decrypt(char c)
	{
		if('D'<=c && c<='Z' || 'd'<=c && c<='z')
		{
			return c-=3;
		}
		else
		{
			return c = (char)(c+23);
		}
	}
	public void display()
	{
		System.out.println(DecryptedSentense);
	}
	public void close()
	{
		
	}
	public int read(char [] a,int b,int c)
	{
		return 0;	
	}
}
