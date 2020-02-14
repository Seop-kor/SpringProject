package common;

import java.security.MessageDigest;
import java.util.Base64;
import java.util.Base64.Encoder;

public class LoginUtil {
    public static String encryptPassword(String id, String pass) throws Exception{
        if(pass == null){
            return "";
        }

        byte[] hashValue = null;
        MessageDigest md = MessageDigest.getInstance("SHA-512");

        md.reset();
        md.update(id.getBytes());

        hashValue = md.digest(pass.getBytes());
        Encoder encoder= Base64.getEncoder();

        return encoder.encodeToString(hashValue);
    }

}
