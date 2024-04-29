public class Student implements Discount{
    @Override
    public double calculate (double amount) {
        return amount * 0.5;
    }
}
