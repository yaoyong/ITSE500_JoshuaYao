import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by steven on 2017/5/30.
 */
public class ShiedoCrawler {
    public static final String URL_ROOT = "http://www.shiseido.com/men/men,en_US,sc.html&forceProducthits";

    public static void main(String[] args) {
        String url = URL_ROOT;
        Document doc = null;

        for (int page = 0; page < 2; page++) {
            url = URL_ROOT + "&start=" + 12 * (page - 1) + "&sz=12";

            try {
                doc = Jsoup.connect(url).get();
                Elements products = doc.select(".productlisting");
                for (Element product : products) {
                    String title = product.select(".namepriceContainer span").get(0).text();
                    String detailUrl = product.select(".productdetailbutton a").get(0).attr("href");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Document detail = Jsoup.connect(detailUrl).get();
                    String productID = detail.select(".ProductID").text();
                    System.out.println(title);
                    System.out.println(productID);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}