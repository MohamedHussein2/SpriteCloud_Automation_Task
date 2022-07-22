package Util;

public enum URLs {


    TESTING_PLAY_GROUND("http://www.uitestingplayground.com/");
    private String value;

    URLs(String value) {
        this.setValue(value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
