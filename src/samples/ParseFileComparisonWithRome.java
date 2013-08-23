package samples;

import java.io.FileReader;

import openrssparser.Parser;
import openrssparser.atom.Source;

import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.SyndFeedInput;

public class ParseFileComparisonWithRome {

	public static void main(String args[]) {
		String atomFeed = System.getProperty("user.dir") + "/src/samples/atom1.xml";
		try {
			for (int i = 0; i < 1000; i++) {
				long begin1 = System.currentTimeMillis();
				Parser.PARSER.parseCursorFile(atomFeed);
				Source header = Parser.PARSER.getHeader();
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

	public static void parseWithRome(String atomFeed) throws Exception {
		try {
			SyndFeed feed = new SyndFeedInput().build(new FileReader(atomFeed));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}