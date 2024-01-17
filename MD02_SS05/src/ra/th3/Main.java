package ra.th3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//code lỗi không chạy được
public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://tintuc.vn/xa-hoi");
//            open the stream and put it into BufferedReader
            Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
            sc.useDelimiter("\\Z");
            String content = sc.next();
//            close scanner
            sc.close();
//            remove all new line
            content = content.replaceAll("\n+", "");
//            đổi pattern mới vì pattern cũ đã không còn sử dụng được
//            regex
            Pattern p1 = Pattern.compile("<div class=\"w-body list page24h\">(.*?)</div></div></div>");
            Matcher m1 = p1.matcher(content);
            while(m1.find()){
                String filteredContent = m1.group(1);
                Pattern p2 = Pattern.compile("title=\"(.*?)\">");
                Matcher m2 = p2.matcher(filteredContent);
                while (m2.find()){
                    System.out.println(m2.group(1));
                }
            }


        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
