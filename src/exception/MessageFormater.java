package exception;

public class MessageFormater {
    public static String format(String message, String errorCode, String url, int status) {
        return message + ": Error Code " + errorCode + ", URL: " + url + ", Status: " + status;
    }
}
