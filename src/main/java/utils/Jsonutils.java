package utils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Jsonutils{

    public static String generateRandomName() {
        return  "RoomName" + System.currentTimeMillis();
    }
    public static String generateRandomId() {
        return String.valueOf(ThreadLocalRandom.current().nextInt(1000, 9999));
    }

    public static String generateRandomNames() {
        return "User_" + UUID.randomUUID().toString().substring(0, 8);
    }

    public static String generateRandomUsername() {
        return "uname_" + UUID.randomUUID().toString().substring(0, 5);
    }

    public static String generateRandomEmail() {
        return "user_" + UUID.randomUUID().toString().substring(0, 6) + "@test.com";
    }
    public static String generateRandomLessonname() {
        return "lesson_" + System.currentTimeMillis();
    }


    public static String getJsonPayload(String filePath) throws IOException {
        // Read file content into String
        String content = new String(Files.readAllBytes(Paths.get(filePath)));

        // Replace placeholder with random name
        return content.replace("DYNAMIC_ROOM_NAME", generateRandomName())
                .replace("DYNAMIC_ID", generateRandomId())
                .replace("DYNAMIC_NAME", generateRandomName())
                .replace("DYNAMIC_USERNAME", generateRandomUsername())
                .replace("DYNAMIC_EMAIL", generateRandomEmail())
                .replace("DYNAMIC_LESSON_NAME", generateRandomLessonname());

    }
}
