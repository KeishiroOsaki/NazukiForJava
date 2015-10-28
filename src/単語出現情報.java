public class 単語出現情報 {
	public String surface;
	public int type;
	public int offset;
	public int length;
	public int unit;
	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "単語出現情報 ["
				+ (surface != null ? "surface=" + surface + ", " : "")
				+ "type=" + type + ", offset=" + offset + ", length=" + length
				+ ", unit=" + unit + "]";
	}
}