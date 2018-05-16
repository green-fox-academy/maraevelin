//public class UrlFixer {
//  public static void main(String... args){
//    String url = "https//www.reddit.com/r/nevertellmethebots";
//    https://www.reddit.com/r/nevertellmetheodds
//
//    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
//    // Also, the URL is missing a crucial component, find out what it is and insert it too!
//    // Try to solve it more than once using different String functions!
//
//    System.out.println(url);
//  }
//}

public class UrlFixer {
  public static void main(String... args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";

    String missingPart = "https:";
    String fixedPartShort = "odds";
    String fixedPartLong = "nevertellmetheodds";

    String urlFixedTypeA = url.replace("https", missingPart);
    url = urlFixedTypeA;
    urlFixedTypeA = url.replace("bots", fixedPartShort);
    url = urlFixedTypeA;
    System.out.println(url);

    url = "https//www.reddit.com/r/nevertellmethebots";
    System.out.println(missingPart + url.substring(url.indexOf("/"), url.indexOf("n")) + fixedPartLong);


    url = "https//www.reddit.com/r/nevertellmethebots";
//    String urlPerfection =  missingPart + url.substring(url.indexOf("/"), url.indexOf("n")) + fixedPartLong;
//    System.out.println(urlPerfection);

    String urlPerfection =  url.substring(url.indexOf("h"), url.indexOf("//")) + ":" + url.substring(url.indexOf("/"),
        url.indexOf("b")) + "odds";
    System.out.println(urlPerfection);


    url = "https//www.reddit.com/r/nevertellmethebots";
    String urlNew = url.replace("https//", "https://");
    urlNew = urlNew.replace("/nevertellmethebots", "/");
    urlNew = urlNew.concat("nevertellmetheodds");
    System.out.println(urlNew);

  }

}
