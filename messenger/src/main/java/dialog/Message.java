package dialog;

import java.time.LocalDate;

public class Message {
    private final long idDialog;
    private final long idSender;
    private final String text;
    private final LocalDate date;


    public Message(long idDialog, long idSender, String text, LocalDate date) {
        this.idDialog = idDialog;
        this.idSender = idSender;
        this.text = text;
        this.date = date;
    }

    public long getIdDialog() {
        return idDialog;
    }

    public long getIdSender() {
        return idSender;
    }

    public String getText() {
        return text;
    }

    public LocalDate getDate() {
        return date;
    }
}
