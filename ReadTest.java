// import de.vogella.rss.model.Feed;
// import de.vogella.rss.model.FeedMessage;
// import de.vogella.rss.read.RSSFeedParser;

public class ReadTest {
        public static void main(String[] args) {
                RSSFeedParser parser = new RSSFeedParser(
                                "http://www.calendar.gatech.edu/feeds/events.xml");
                Feed feed = parser.readFeed();
                System.out.println(feed);
                for (FeedMessage message : feed.getMessages()) {
                        System.out.println(message);

                }

        }
}
