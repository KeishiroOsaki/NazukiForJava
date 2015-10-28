import com.fasterxml.jackson.annotation.JsonProperty;


public class ネガティブニュース {
	@JsonProperty("reason-id")
	public int reason_id;
	public float score;
	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ネガティブニュース [reason_id=" + reason_id + ", score=" + score + "]";
	}
}