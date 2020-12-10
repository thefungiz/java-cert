package gayer.javacert.util;

import java.text.DateFormat;
import java.util.Date;

public class Header {

    public Header(String app){
        System.out.println("Application: "+ app);
        System.out.println("Running Time: " + getDate());

    }

    private String getDate() {
        String date = "unknown";
        Date now = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        return date = dateFormat.format(now);
    }
}
