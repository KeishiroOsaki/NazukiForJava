import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;


public class 感性情報 {
	@JsonProperty("sense-id")
	public int sense_id;
	public 出現情報 expression;
	public 出現情報 predicate;
	public 単語出現情報[] relations;
	@JsonProperty("rule-id")
	public String rule_id;
	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "感性情報 [sense_id=" + sense_id + ", expression=" + expression
				+ ", predicate=" + predicate + ", relations="
				+ Arrays.toString(relations) + ", rule_id=" + rule_id + "]";
	}
}
/*
public class キーワード情報 {
	public String surfaceString;
	public int type;
	public float score;
	public int frequency;
	public 出現情報[] instances;
}*/
/*public class センテンス処理結果 {
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
}*/
//public class ページ処理結果 {
//	@JsonProperty("sentence-results")
//	public センテンス処理結果[] sentence_results;
//}