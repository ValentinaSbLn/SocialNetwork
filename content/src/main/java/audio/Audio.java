package audio;

import java.nio.file.Path;

public class Audio {

    private static long idAudio = 0;  //Поменять генерацию id
    private String name;
    private Path pathToAudioFile;

    public Audio(String name, Path pathToAudioFile) {
        idAudio++;
        this.name = name;
        this.pathToAudioFile = pathToAudioFile;

    }

    public static long getIdAudio() {
        return idAudio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Path getPathToAudioFile() {
        return pathToAudioFile;
    }

    public void setPathToAudioFile(Path pathToAudioFile) {
        this.pathToAudioFile = pathToAudioFile;
    }
}
