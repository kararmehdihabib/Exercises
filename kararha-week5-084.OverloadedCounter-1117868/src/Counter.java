
public class Counter {

    int counter;
    boolean check;

    public Counter(int startingValue, boolean check) {
        this.counter = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this.check = check;
        this.counter = 0;

    }

    public Counter() {
        this(false);
    }

    public int value() {
        return this.counter;
    }
    //increasing method for incrementing by 1

    public void increase() {
        this.counter++;
    }

    //decreasing method for decrementing by 1
    public void decrease() {

        if (this.check) {

            if (this.counter > 0 && this.counter != 0) {
                this.counter--;
            }

        }
        if (!this.check) {
            this.counter--;
        }

    }

    //increasing method but according to the give¨n amount
    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.counter += increaseAmount;
        } else {
            this.counter = this.counter;
        }
    }

    //decreasing method but according to the amount
    public void decrease(int decreaseAmount) {
        if (this.check) {
            if (decreaseAmount > 0) {
                this.counter -= decreaseAmount;
                if (this.counter < 0) {
                    this.counter = 0;
                }
            } else {
                this.counter = this.counter;
            }
        }
        if (!this.check) {
            if (decreaseAmount > 0) {
                this.counter -= decreaseAmount;
            } else {
                this.counter = this.counter;
            }
        }

    }
}
