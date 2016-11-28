package photo;

import java.util.ArrayList;
import java.util.List;

public class PhotoAlbum {
    private long idAlbum;
    private long idUser;
    private String nameAlbum;
    private final List<Long> photosInAlbum = new ArrayList<>();

    public PhotoAlbum(long idAlbum, long idUser) {
        this.idAlbum = idAlbum;
        this.idUser = idUser;
    }

    public long getIdAlbum() {
        return idAlbum;
    }

    public long getIdUser() {
        return idUser;
    }

    public String getNameAlbum() {
        return nameAlbum;
    }

    public void setNameAlbum(String nameAlbum) {
        this.nameAlbum = nameAlbum;
    }

    public List<Long> getPhotosInAlbum() {
        return photosInAlbum;
    }

    public void add(long idPhoto) {
        photosInAlbum.add(idPhoto);
    }

    public void delete(long idPhoto) {
        photosInAlbum.remove(idPhoto);
    }

}
