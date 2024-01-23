package ra.validate;

import java.util.regex.Pattern;

public class SongValidate {
    public static boolean validateSongid(String songId) {
        String patrern ="^S[A-Za-z)-9]{3}$";
        Pattern pattern = Pattern.compile(patrern);
        return pattern.matcher(songId).matches();
    }
}
