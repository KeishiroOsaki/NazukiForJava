import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;


public class 不適切傾向 {
	@JsonProperty("reason-id")
	public int reason_id;
	public float score;
	public 不適切傾向情報[] instances;
	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "不適切傾向 [reason_id="
				+ reason_id
				+ ", score="
				+ score
				+ ", "
				+ (instances != null ? "instances="
						+ Arrays.toString(instances) : "") + "]";
	}
}