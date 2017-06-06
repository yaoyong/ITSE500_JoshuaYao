import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Joshua on 2017/5/30.
 */
public class Demo {
    public static final String URL_ROOT = "http://www.nutrabio.com/category/herbal/";
    public static void main(String[] args){
        Document doc = null;
        try{
            doc = Jsoup.connect(URL_ROOT).get();
            Elements products = doc.select(".product-item");
            for(Element product: products){
                String title = product.select(".product-name").text();
                System.out.println(title);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
