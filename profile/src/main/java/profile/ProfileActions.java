package profile;

import audio.Audio;
import photo.Photo;

public interface ProfileActions {
    void addFriend(ProfileUser user);

    void addAudio(Audio audio);

    void addPhoto(Photo photo);

    void openChat();
}
