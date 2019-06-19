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
        Resume a = null;
        for (int i = 0; i < size(); i++) {
            if (storage[i].toString().equalsIgnoreCase(uuid)) {
                a = storage[i];
            }
        }
        return a;
    }

    void delete(String uuid) {
        for (int i = 0; i < size(); i++) {
            if (storage[i].toString().equalsIgnoreCase(uuid)) {
                storage[i] = null;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] storage2 = new Resume[size()];
        for (int i = 0; i < size(); i++) {
            storage2[i] = storage[i];
        }
        return storage2;
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
