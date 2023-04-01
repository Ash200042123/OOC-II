public class Dollar {


    private int amount;

    public Dollar(int i) {
        this.amount=i;
    }

    public Dollar times(int i) {
        amount*=i;
        return new Dollar(amount);
    }

    public int getAmount() {
        return this.amount;
    }

    @Override
    public boolean equals(Object s){
        Dollar dollar=(Dollar) s;
        return amount== dollar.amount;
    }
}
