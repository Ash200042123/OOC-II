public interface Buffer {
    public void set(int value);
    public int get() throws InterruptedException;
}
