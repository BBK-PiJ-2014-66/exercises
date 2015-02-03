package likeunix;

import java.io.IOException;
import java.io.Reader;

public class CloseReader {
	/**
	 * Closes a Reader if it it is not null Adapted from PiJ lecture notes day
	 * 16 page 6 difference is that we re throw any IOException as a runtime
	 * exception
	 * 
	 * @param fileName file name used to open reader (for information)
	 * @param reader to be closed
	 * @throws RuntimeException if there is a problem
	 */
	public static void close(String fileName, Reader reader) {
		try {
			if (reader != null) {
				reader.close();
			}
		} catch (IOException ex) {
			throw (new RuntimeException("ERROR, ioerror on closingfile "
					+ fileName + "\n" + "ERROR, ioerror details "
					+ ex.getMessage()));
		}
	}
}
