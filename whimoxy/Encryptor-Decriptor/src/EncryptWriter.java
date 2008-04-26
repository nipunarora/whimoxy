import java.io.*;
public class EncryptWriter extends Writer  {
	String EncryptedSentense;
	
	public void write(String A)
	{
		EncryptedSentense = "";
		for(int i=0;i<A.length();i++)
		EncryptedSentense = EncryptedSentense+encrypt(A.charAt(i));
	}
	
	private char encrypt(char c)
	{
		if('A'<=c && c<='W' || 'a'<=c && c<='W' )
		{
			 c+=3;
		}
		else
		{
			c = (char)(c-23);
		}
		return c;
	}
	public void display()
	{
		System.out.println(EncryptedSentense);
	}
	public void flush()
	{
		
	}
	public void close()
	{
		
	}
	public void write(char [] a,int b,int c)
	{
		
	}
}

