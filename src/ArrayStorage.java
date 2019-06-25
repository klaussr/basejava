import java.util.ArrayList;
import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size = 0;

    void clear() {
        size = 0;
    }

    void save(Resume r) {
        int i = size();
        while (i < storage.length) {
            storage[i] = r;
            size++;
            return;
        }

    }

    Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].toString().equals(uuid)) {
                return storage[i];
            } else return null;
        }
        return storage[uuid.indexOf(uuid)];
    }

    void delete(String uuid) {
        Resume[] result = new Resume[size];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (storage[i].toString().equalsIgnoreCase(uuid)) {
                index = i;
            }
        }
        System.arraycopy(storage, 0, result, 0, index);
        System.arraycopy(storage, index + 1, result, index, size - index);
        for (int i = 0; i < result.length; i++) {
            storage[i] = result[i];
        }
        size--;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        size();
        Resume[] storageNotNull = new Resume[size];
        for (int i = 0; i < size; i++) {
            storageNotNull[i] = storage[i];
        }
        return storageNotNull;
    }

    int size() {
        return size;
    }
}
