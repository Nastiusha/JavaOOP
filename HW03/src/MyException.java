public class MyException extends Exception {

    @Override
    public String getMessage() {
        return "The group is full. You cannot add someone else!";
    }
}
