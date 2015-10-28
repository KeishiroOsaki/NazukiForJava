import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ページ処理結果 {
	@JsonProperty("sentence-results")
	public センテンス処理結果[] sentence_results;

	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ページ処理結果 [sentence_results=" + Arrays.toString(sentence_results)
				+ "]";
	}
	
}