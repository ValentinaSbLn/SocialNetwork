package dialog;


import java.util.ArrayList;
import java.util.List;

public class Dialog {
    private final long idFirstUser;
    private final long idSecondUser;
    private final List<Message> messageInDialog=new ArrayList<>();

    public Dialog(long idFirstUser, long idSecondUser) {
        this.idFirstUser = idFirstUser;
        this.idSecondUser = idSecondUser;
    }

    public long getIdFirstUser() {
        return idFirstUser;
    }

    public long getIdSecondUser() {
        return idSecondUser;
    }

    public List<Message> getMessageInDialog() {
        return messageInDialog;
    }

}
