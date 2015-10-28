import java.util.Arrays;


/*public class 単語出現情報 {
	public String surface;
	public int type;
	public int offset;
	public int length;
	public int unit;
}*/
/*public class 出現情報 {
	public int offset;
	public int length;
	public int unit;
}*/
public class 係り受け情報 {
	public String surface;
	public int type;
	public int offset;
	public int length;
	public int unit;
	public 単語出現情報[] dependents;
	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "係り受け情報 [surface=" + surface + ", type=" + type + ", offset="
				+ offset + ", length=" + length + ", unit=" + unit
				+ ", dependents=" + Arrays.toString(dependents) + "]";
	}
}