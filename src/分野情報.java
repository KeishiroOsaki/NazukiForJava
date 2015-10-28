import com.fasterxml.jackson.annotation.JsonProperty;


public class 分野情報 {
	@JsonProperty("field-id")
	public int field_id;
	public float score;
	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "分野情報 [field_id=" + field_id + ", score=" + score + "]";
	}
}