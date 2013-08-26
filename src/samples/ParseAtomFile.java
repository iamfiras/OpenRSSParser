package samples;

import openrssparser.OpenRssParser;
import openrssparser.models.common.Header;

public class ParseAtomFile {

	public static void main(String args[]) {
		String atomFeed = System.getProperty("user.dir") + "/src/samples/atom1.xml";
		OpenRssParser myParser = new OpenRssParser();
		try {
			for (int i = 1; i <= 17; i++) {
				long begin = System.currentTimeMillis();
				myParser.declareFile(atomFeed);
				Header header = myParser.getHeader();
				long end = System.currentTimeMillis();
				System.out.println(i + "\t-\t" + (end - begin));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
