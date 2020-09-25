package kirukarthick.javacert.encap;

public class MemberInfo {
    private String memberName; //cannot be accessed directly outside this class
    private int memberId; //cannot be accessed directly outside this class
    private String memberEmail;   //cannot be accessed directly outside this class

    public String getName() {
        return memberName;
    }

    public void setName(String name) {
        this.memberName = name;
    }

    public int getId() {
        return memberId;
    }

    public void setId(int id) {
        this.memberId = id;
    }

    public String getEmail() { return memberEmail; }

    public void setEmail(String email) {
        this.memberEmail = email;
    }
}
