package campaign;

public enum Type {
    Fixed(1){
        @Override
        public String toString() {
            return "Fixed";
        }
    },Percentage(100){
        @Override
        public String toString() {
            return "Percentage";
        }
    };

    public int value(){
        return this.value;
    }

    public abstract String toString();

    Type(int value){
        this.value=value;
    }
    private int value;
}
