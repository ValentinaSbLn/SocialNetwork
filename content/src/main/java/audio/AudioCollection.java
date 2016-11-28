package audio;

import utils.ContentActions;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AudioCollection {
    private long idCollection;
    private long idUser;
    private String nameCollection;
    private final List<Long> audioInCollection = new ArrayList<>();

    public AudioCollection(long idCollection, long idUser) {
        this.idCollection = idCollection;
        this.idUser = idUser;
    }

    public void add(long idAudio) {
        audioInCollection.add(idAudio);
    }

    public void delete(long id) {
        audioInCollection.remove(id);
    }

    public long getIdCollection() {
        return idCollection;
    }

    public long getIdUser() {
        return idUser;
    }

    public String getNameCollection() {
        return nameCollection;
    }

    public List<Long> getAudioInCollection() {
        return audioInCollection;
    }

    public void setNameCollection(String nameCollection) {
        this.nameCollection = nameCollection;
    }
}
