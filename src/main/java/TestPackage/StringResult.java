package TestPackage;

public class StringResult implements Result{
    private String getResult(String rock) {
    return "hello";
    }

    @Override
    public String getResult() {
    return "hellooo";
    }
}
