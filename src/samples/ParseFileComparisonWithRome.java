package samples;

import java.io.FileReader;
import java.util.List;

import openrssparser.OpenRSS;
import openrssparser.models.atom.Entry;
import openrssparser.models.atom.Source;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.SyndFeedInput;

public class ParseFileComparisonWithRome {

	public static void main(String args[]) {
		String atomFeed = System.getProperty("user.dir") + "/src/samples/atom1.xml";
		try {
			for (int i = 0; i < 1000; i++) {
				long begin1 = System.currentTimeMillis();
				parseWithOpenRSSParser(atomFeed);
				long end1 = System.currentTimeMillis();

				long begin2 = System.currentTimeMillis();
				parseWithRome(atomFeed);
				long end2 = System.currentTimeMillis();
				System.out.println(i + "\t-\t" + (end1 - begin1) + "\t-\t" + (end2 - begin2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void parseWithOpenRSSParser(String atomFeed) throws Exception {
		OpenRSS.PARSER.declareFile(atomFeed);
		Source header = (Source) OpenRSS.getInstance().getHeader();
		while (OpenRSS.getInstance().hasEntry()) {
			Entry entry = OpenRSS.getInstance().nextEntry();
			entry.getAuthors();
		}
	}

	public static void parseWithRome(String atomFeed) throws Exception {
		SyndFeed feed = new SyndFeedInput().build(new FileReader(atomFeed));
		List<SyndEntry> entries = feed.getEntries();
		for (SyndEntry entry : entries) {
			entry.getAuthor();
		}
	}
}
