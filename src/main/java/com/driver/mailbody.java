package com.driver;
import java.util.Date;

public class mailbody {
    Date date;
    String sender;
    String message;

    public mailbody(Date date, String sender, String message) {
        this.date = date;
        this.sender = sender;
        this.message = message;
    }
}
