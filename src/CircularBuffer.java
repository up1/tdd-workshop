public class CircularBuffer {

    private String[] value = new String[2];
    private int first = 0;
    private int last;

    public boolean isEmpty() {
        return last == 0;
    }

    public void add(String value) {
        this.value[last++] = value;
    }

    public String get() {
        return this.value[first++];
    }

    public boolean isFull() {
        return last == value.length;
    }
}
