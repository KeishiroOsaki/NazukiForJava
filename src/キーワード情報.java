import java.util.Arrays;

public class キーワード情報 {
	public String surface;
	public int type;
	public float score;
	public int frequency;
	public 出現情報[] instances;
	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "キーワード情報 [surface=" + surface + ", type=" + type + ", score="
				+ score + ", frequency=" + frequency + ", instances="
				+ Arrays.toString(instances) + "]";
	}
}