import com.fasterxml.jackson.annotation.JsonProperty;


public class 地域情報 {
	@JsonProperty("area-id")
	public int area_id;
	@JsonProperty("area-type")
	public int area_type;
	public float score;
	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "地域情報 [area_id=" + area_id + ", area_type=" + area_type
				+ ", score=" + score + "]";
	}
}