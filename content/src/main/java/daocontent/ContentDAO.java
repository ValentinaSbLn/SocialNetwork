package daocontent;


import javax.swing.text.AbstractDocument;

public interface ContentDAO<T> {
    T get(long id);

    void create(T t);

    void update(T t);

    void delete(T t);
}
