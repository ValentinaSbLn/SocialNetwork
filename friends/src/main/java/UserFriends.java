import profile.ProfileUser;

import java.util.ArrayList;
import java.util.List;

public class UserFriends implements FriendsActions {
    private final long idUser;
    private final List<Long> friends = new ArrayList<Long>();

    public UserFriends(long idUser) {
        this.idUser = idUser;
    }

    @Override
    public void addFriends(long idFriends) {
        friends.add(idFriends);
    }

    @Override
    public void deleteFriends(long idFriends) {
        friends.remove(idFriends);
    }

    public List<Long> getFriendsList() {
        return friends;
    }
}
