package utils;

import java.nio.file.Path;

/**
 * Created by Valentina on 28.11.2016.
 */
public interface ContentActions<T> {
    /**
     * Method, that adds content
     */
    void add(T t);

    /**
     * Method, that delete content
     */
    void delete(T t);

    /**
     * Method, that searches for content
     *
     * @param name Name file
     * @return content
     */
    T search(String name);
}
