package kirukarthick.javacert.encap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EncapExample {
    public static void main(String[] args){
        try {
            int bookNum;
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);
            MemberInfo mi = new MemberInfo();
            Books book = new Books();
            System.out.println("Enter Name");
            mi.setName(br.readLine());
            System.out.println("Enter ID");
            mi.setId(Integer.parseInt(br.readLine()));
            System.out.println("Enter email id");
            mi.setEmail(br.readLine());
            System.out.println("Select a book " +
                    "1.Thirukkural " +
                    "2.other");
            bookNum= Integer.parseInt(br.readLine());
            switch (bookNum)
            {
                case 1 :
                    book.setName("Thirukkural");
                    break;
                case 2 :
                    book.setName("Humans of New York");
                    break;
            }
            System.out.println("=========================");
            System.out.println("Basic Member Info ");
            System.out.println("=========================");
            System.out.println("Name :"+ mi.getName());
            System.out.println("ID :"+ mi.getId());
            System.out.println("Email :"+ mi.getEmail());
            System.out.println(book.getsearch());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
