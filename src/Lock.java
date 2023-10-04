public class Lock {

    private int key;
    private boolean open;
    private int attempts = 0;

    public Lock(int key) {
        // Creates a lock that is initially open.
        this.key = key;
        this.open = true;
    }

    public void close() {
        // Close the lock
        this.open = false;
    }

    public boolean isOpen() {
        // Returns true if and only if the lock is open.
        return this.open == true;
    }

    public void open(int key) {
        if (this.key == key) {
            this.open = true;
        } else {
            this.attempts += 1;
            if (attempts == 3) {
                System.out.println("ALARM");
            }
        }

    }
}
