import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;


public class NazukiResultSet {


	
	@JsonProperty("page-results")
	public ページ処理結果[] page_results;
	
	@JsonProperty("return-code")
	public int return_code;
	
	@JsonProperty("error-detail")
	public String error_detail;

	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NazukiResultSet [page_results=" + Arrays.toString(page_results)
				+ ", return_code=" + return_code + ", error_detail="
				+ error_detail + "]";
	}

}