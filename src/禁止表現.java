import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;


public class 禁止表現 {
	@JsonProperty("reason-id")
	public int reason_id;
	public 禁止語情報[] instances;
	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "禁止表現 [reason_id=" + reason_id + ", instances="
				+ Arrays.toString(instances) + "]";
	}
}