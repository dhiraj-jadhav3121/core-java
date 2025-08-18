package PRACTICE_DAILY;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractJsonFields {
    public static void main(String[] args) throws Exception {
        String msg = "480 Bad Request on PUT request for \"https://...\": " +
                "\"{\"timestamp\": \"2025-07-31T14:25:05.938948459\",\"path\": \"/omni-deployment-service-feature/api/v1/s3/artifact/upload\"," +
                "\"status\":400, \"error\": \"Bad Request\", \"requestId\":\"6a6cef2a-1421\", \"message\": \"org.slf4j.helpers. FormattingTuple@4b3b5c3b\", " +
                "\"traceId\":\"\",\"errorCode\":\"IACDPLY_ODS_4888\"}\"";

        // Match JSON string inside double quotes that starts with '{'
        Matcher matcher = Pattern.compile("\"(\\{.*})\"").matcher(msg);
        if (matcher.find()) {
            String json = matcher.group(1);
            System.out.println(json);
        }
    }
}

