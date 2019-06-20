import java.util.ArrayList;
import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                storage[i] = null;
            }
        }
    }

    void save(Resume r) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = r;
                return;
            }
        }
    }

    Resume get(String uuid) {
        for (Resume r : storage)
            return r.toString().equalsIgnoreCase(uuid) ? r : null;
        return null;
    }

    void delete(String uuid) {
        ArrayList<Resume> list = new ArrayList<>(Arrays.asList(storage));
        list.remove(get(uuid));
        storage = list.toArray(new Resume[list.size()]);
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] storageNotNull = new Resume[size()];
        for (int i = 0; i < size(); i++) {
            storageNotNull[i] = storage[i];

        }
        return storageNotNull;
    }

    int size() {
        int size = 0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                size++;
            }
        }
        return size;
    }
}
