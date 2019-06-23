import java.util.ArrayList;
import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size = size();

    void clear() {
        for (int i = 0; i < size; i++) {
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
        for (int i = 0; i < size; i++){
            if(storage[i].toString().equals(uuid)) {
                return storage[i];
            }
            else return null;
        }
        return storage[uuid.indexOf(uuid)];
    }

    void delete(String uuid) {
        for (int i = 0; i < size; i++){
            if (storage[i].toString().equals(uuid)){
                storage[i] = null;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        size();
        Resume[] storageNotNull = new Resume[size];
        int j = 0;
        for (int i = 0; i < size+1; i++) {
            if (storage[i] != null) {
                storageNotNull[j] = storage[i];
                j++;
            }
        }
        return storageNotNull;
    }

    int size() {
        size = 0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                size++;
            }
        }
        return size;
    }
}
