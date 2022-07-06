interface MyList<T> {
    void add(T o);

    void resize();

    void remove(int index);

    Object get(int index);

    int size();

    void clear();

    boolean contains(T o);

    int indexOf(T o);

    void set(int index, T o);


}

public class TList<T> implements MyList<T> {
    private static final int INITIALSIZE = 15;
    private Object[] values;
    private int actualSize;
    private int size = INITIALSIZE;

    public TList(Object[] values) {
        this.values = values;
    }

    public TList() {
        values = new Object[INITIALSIZE];
    }

    public void add(T o) {
        resize();
        values[actualSize] = o;
        actualSize++;
    }

    @Override
    public void resize() {
        Object[] newList = new Object[size + size / 2];
        System.arraycopy(values, 0, newList, 0, actualSize);
        values = newList;
    }

    @Override
    public void remove(int index) {
        if (index >= 0 && index < actualSize) {
            int k = 0;
            Object[] newList = new Object[actualSize - 1];
            for (int i = 0; i < actualSize; i++) {
                if (i != index) {
                    newList[k] = values[i];
                    k++;
                }
            }
            values = newList;
            actualSize--;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public Object get(int index) {
        if (index >= 0 && index < actualSize) {
            return values[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return actualSize;
    }

    @Override
    public void clear() {
        Object[] newList = new Object[actualSize];
        System.arraycopy(newList, 0, values, 0, actualSize);
        actualSize = 0;
    }


    @Override
    public boolean contains(T o) {
        for (int i = 0; i < actualSize; i++) {
            if (values[i].equals(o)) return true;
        }
        return false;
    }

    @Override
    public int indexOf(T o) {
        for (int i = 0; i < actualSize; i++) {
            if (values[i].equals(o)) return i;
        }
        return -1;
    }

    @Override
    public void set(int index, T o) {
        if (index >= actualSize) {
            throw new IndexOutOfBoundsException();
        }
        values[index] = o;

    }
}
