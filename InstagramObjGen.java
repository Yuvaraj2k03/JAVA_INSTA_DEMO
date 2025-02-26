import java.util.*;
public class InstagramObjGen
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        Insta user1=new Insta("Yuva","yuva@123",1234,9597208527L);
        Insta user2=new Insta("Vikash","chikko@maja",2345,9865473912L);

        boolean flag=true;
        do
        {
            System.out.println("1.Display all the details\n2.Show Individual Details\n3.Change values\n4.Exit");
            int input=sc.nextInt();
            switch (input)
            {
                case 1:
                {
                    boolean flag1=true;
                    do {
                        System.out.println("Wlecome to My WebPage");
                        System.out.println("Select any of the user....!");
                        System.out.println("1.user1\n2.user2\n3.Exit");
                        int input1 = sc.nextInt();
                        switch (input1)
                        {
                            case 1:
                            {
                                user1.detailsOfInsta();
                                break;
                            }
                            case 2:
                            {
                                user2.detailsOfInsta();
                                break;
                            }
                            case 3:
                            {
                                flag1=false;
                                break;
                            }
                        }
                    }while(flag1);
                }
                break;
                case 2:
                {
                    boolean flag3=true;
                    do
                    {
                        System.out.println("Show individual Details.....");
                        System.out.println("1.user1\n2.user2\n3.Exit");
                        int selectUser=sc.nextInt();
                        switch (selectUser)
                        {
                            case 1:
                            {
                                boolean flag0 = true;
                                do
                                {
                                    System.out.println("1.username\n2.MailId\n3.Contact\n4.Exit");
                                    int input2 = sc.nextInt();
                                    switch (input2)
                                    {
                                        case 1:
                                        {
                                            System.out.println(user1.username);
                                            break;
                                        }
                                        case 2:
                                        {
                                            System.out.println(user1.getMailId());
                                            break;
                                        }
                                        case 3:
                                        {
                                            System.out.println(user1.getcontact());
                                            break;
                                        }
                                        case 4:
                                        {
                                            flag3 = false;
                                            break;
                                        }
                                    }
                                    break;
                                } while (flag0);
                            }
                            case 2:
                            {
                                boolean flag5=true;
                                do {
                                    System.out.println("1.username\n2.MailId\n3.Contact\n4.Exit");
                                    int input2 = sc.nextInt();
                                    switch (input2) {
                                        case 1: {
                                            System.out.println(user2.username);
                                            break;
                                        }
                                        case 2: {
                                            System.out.println(user2.getMailId());
                                            break;
                                        }
                                        case 3: {
                                            System.out.println(user2.getcontact());
                                            break;
                                        }
                                        case 4: {
                                            flag3 = false;
                                            break;
                                        }
                                    }
                                    break;
                                }while (flag5);
                            }
                        }
                        break;
                    }while(flag3);
                    break;
                }
                case 3:
                {
                    boolean flag4=true;
                    do
                    {
                        System.out.println("Here Comes the changing features....[]");
                        System.out.println("Enter any of the user to change...!");
                        System.out.println("1.User1\n2.User2\n3.Exit");
                        int input3= sc.nextInt();

                        switch (input3)
                        {
                            case 1:
                            {
                                boolean userselect=true;
                                do {
                                    System.out.println("1.Change Username\n2.Change MailId\n3.Change password\n4.Change Contact\5.Exit");
                                    int input5 = sc.nextInt();
                                    switch (input5) {
                                        case 1: {
                                            System.out.print("Enter the Username : ");
                                            String a = sc.nextLine();
                                            user1.setUsername(a);
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("Enter the MailId : ");
                                            String b = sc.nextLine();
                                            user1.setUsername(b);
                                            break;
                                        }
                                        case 3: {
                                            System.out.print("Enter the Password : ");
                                            String a = sc.nextLine();
                                            user1.setUsername(a);
                                            break;
                                        }
                                        case 4: {
                                            System.out.print("Enter the Contact : ");
                                            String a = sc.nextLine();
                                            user1.setUsername(a);
                                            break;
                                        }
                                        case 5: {
                                            userselect = false;
                                            break;
                                        }
                                    }
                                    break;
                                }while(userselect);
                            }
                            case 2:
                            {
                                boolean userselect=true;
                                do {
                                    System.out.println("1.Change Username\n2.Change MailId\n3.Change password\n4.Change Contact\5.Exit");
                                    int input5 = sc.nextInt();
                                    switch (input5) {
                                        case 1: {
                                            System.out.print("Enter the Username : ");
                                            String a = sc.nextLine();
                                            user2.setUsername(a);
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("Enter the MailId : ");
                                            String b = sc.nextLine();
                                            user2.setUsername(b);
                                            break;
                                        }
                                        case 3: {
                                            System.out.print("Enter the Password : ");
                                            String a = sc.nextLine();
                                            user2.setUsername(a);
                                            break;
                                        }
                                        case 4: {
                                            System.out.print("Enter the Contact : ");
                                            String a = sc.nextLine();
                                            user2.setUsername(a);
                                            break;
                                        }
                                        case 5: {
                                            userselect = false;
                                            break;
                                        }
                                    }
                                    break;
                                }while(userselect);
                            }
                            case 3:
                            {
                                flag4=false;
                                break;
                            }
                        }
                        break;
                    }while(flag4);
                    break;
                }
                case 4:
                {
                    flag=false;
                    break;
                }
            }
        }while (flag);
    }
}