package kirukarthick.javacert.encap;

public class Books {
    private int code; //cannot be accessed directly outside this class
    private String text; //cannot be accessed directly outside this class

    {
        text = "The Tirukkural, or shortly the Kural, is a classic Tamil " +
                "language text consisting of 1,330 short couplets of seven words each, " +
                "or Kurals. The text is divided into three books, each with aphoristic " +
                "teachings on virtue, wealth and love.";
    }

    public String getsearch(){
     if(code == 133) {
         return this.text;
     }
     else {
         return "Book not available";
     }
    }
    public void setName(String name)
    {
        if(name.equals("Thirukkural")) {
            code = 133;
        }
        else {
            code = 1;
        }
    }

}
