package photo;

import java.nio.file.Path;

public class Photo {
    private static long idPhoto = 0; //
    private String name;
    private Path pathToPhotoFile;

    public Photo(String name, Path pathToPhotoFile) {
        idPhoto++;
        this.name = name;
        this.pathToPhotoFile = pathToPhotoFile;

    }


    public static long getIdAudio() {
        return idPhoto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Path getPathToPhotoFile() {
        return pathToPhotoFile;
    }

    public void setPathToPhotoFile(Path pathToPhotoFile) {
        this.pathToPhotoFile = pathToPhotoFile;
    }
}
