package lesson12.assignment;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import static java.lang.System.out;

/**
 * Created by steven on 2017/6/5.
 */
public class walmartCrawler {
    public static final String URL_ROOT =
            "https://www.walmart.com/browse/shop-laptops-by-type/apple-laptops/3944_3951_1089430_1230091_4431341";


    public void crawle() {
        String url = URL_ROOT;
        Document doc = null;
        String type = null;
        for (int page = 1; page < 3; page++) {
            url = URL_ROOT + "?page=" + page + "#searchProductResult";

            try {
                doc = Jsoup.connect(url).get();
                Elements products = doc.select(".search-result-gridview-items li");
                //System.out.println(products);
                int i =0;
                for (Element product : products) {
                    String title = product.select(".prod-ProductTitle div").get(0).text();
                    String price = product.select(".Price-characteristic").get(0).text();
                    //String getfromFile = product.select(".Tile-img").attr("src");
//                    String fromFile = "https:"+getfromFile;
//                    i++;
//                    String destinationFile = "product"+i+".jpeg";
                    Elements spanWithClass = product.select("span.product-list-price-block");

                    if (spanWithClass.size() > 0) {
                        type = product.select(".product-list-price-block").get(0).text();
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    out.println("name:  " + title.substring(0,50));
                    out.println("price:  " + price);
                    if (type == null) {
                        type = "type:   normal price";
                    } else type = "type:   on sale";
                    out.println(type);
                 //   saveFile(title,price,type,fromFile);

                  //  saveImage(fromFile, destinationFile );
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

//        try (BufferedReader br = new BufferedReader(new FileReader(linkFile))) {
//            String currentLine;
//            while ((currentLine = br.readLine()) != null) {
//                System.out.println(currentLine);
//            }
    //        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter(linkFile, true))) {
//            bw.write("\ntaobao.com");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    public static void main(String[] args) {
        walmartCrawler walmartCrawler = new walmartCrawler();
        walmartCrawler.crawle();
    }

}