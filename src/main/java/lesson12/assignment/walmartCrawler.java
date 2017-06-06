package lesson12.assignment;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import static java.lang.System.out;

/**
 * Created by steven on 2017/6/5.
 */
public class walmartCrawler {
    public static final String URL_ROOT =
            "https://www.walmart.com/browse/shop-laptops-by-type/apple-laptops/3944_3951_1089430_1230091_4431341";

    public static void main(String[] args) {
        String url = URL_ROOT;
        Document doc = null;
        String type = null;
        for (int page = 1; page < 3; page++) {
            url = URL_ROOT+"?page="+ page +"#searchProductResult";

            try {
                doc = Jsoup.connect(url).get();
                Elements products = doc.select(".search-result-gridview-items li");
                //System.out.println(products);
                for (Element product : products) {
                    String title = product.select(".prod-ProductTitle div").get(0).text();
                    String price =product.select(".Price-characteristic").get(0).text();
                    Elements spanWithClass = product.select("span.product-list-price-block");

                    if(spanWithClass.size()>0){
                        type = product.select(".product-list-price-block").get(0).text();
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    out.println("name:  "+ title);
                    out.println("price:  "+ price);
                    if (type==null){
                        out.println("type:   normal price");
                    }else out.println("type:   on sale");

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}