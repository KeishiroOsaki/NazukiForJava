import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class センテンス処理結果 {
	public String normalize;
	@JsonProperty("kex-results")
	public キーワード情報[] kex_results;
	@JsonProperty("intx-results")
	public 感性情報[] intx_results;
	@JsonProperty("field-results")
	public 分野情報[] field_results;
	@JsonProperty("area-results")
	public 地域情報[] area_results;
	@JsonProperty("type1-results")
	public 禁止表現[] type1_results;
	@JsonProperty("type2-results")
	public 不適切傾向[] type2_results;
	@JsonProperty("type3-results")
	public ネガティブニュース[] type3_results;
	@JsonProperty("depend-results")
	public 係り受け情報[] depend_results;
	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "センテンス処理結果 [normalize=" + normalize + ", kex_results="
				+ Arrays.toString(kex_results) + ", intx_results="
				+ Arrays.toString(intx_results) + ", field_results="
				+ Arrays.toString(field_results) + ", area_results="
				+ Arrays.toString(area_results) + ", type1_results="
				+ Arrays.toString(type1_results) + ", type2_results="
				+ Arrays.toString(type2_results) + ", type3_results="
				+ Arrays.toString(type3_results) + ", depend_results="
				+ Arrays.toString(depend_results) + "]";
	}
}