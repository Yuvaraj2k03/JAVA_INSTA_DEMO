import java.util.*;
public class Insta
{
    String username;
    private String mailId;
    private int password;
    private long contact;
    static Scanner sc=new Scanner(System.in);
    public Insta(String n,String m,int p,long c)
    {
        username=n;
        mailId=m;
        password=p;
        contact=c;
    }

    public void detailsOfInsta()
    {
        System.out.println("The name is : "+username);
        System.out.println("The mailId is : "+mailId);
        System.out.println("The Pass is : "+password);
        System.out.println("The contact is : "+contact);
    }

    public String getUsername()
    {
        System.out.println("ENter the pass: ");
        int input=sc.nextInt();
        if(input==contact) {
            return username;
        }
        else
        {
            return "Verification Failed";
        }
    }
    public String getMailId()
    {
        return mailId;
    }
    public int getPassword()
    {
        return password;
    }
    public long getcontact()
    {
        return contact;
    }
    public void setUsername(String newusername)
    {
        username=newusername;
    }
    public void setMailId(String newmailId)
    {
        username=newmailId;
    }
    public void setPassword(String newpassword)
    {
        username=newpassword;
    }
    public void setContact(String newcontact)
    {
        username=newcontact;
    }
}
