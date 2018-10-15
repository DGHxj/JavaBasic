package cn.tedu.newfeature;
/**
 * 枚举
 */
public class Demo07 {
	public static void main(String[] args) {
		System.out.println(Score.B.getFen());
		System.out.println(Score.B.getChinaScore());
		System.out.println(Score.E.name());
		System.out.println(Score.E.ordinal());
	}
}

enum Score{
	A("90~100"){
		@Override
		public String getChinaScore() {
			return "优";
		}
	},B("80~89"){
		@Override
		public String getChinaScore() {
			return "良";
		}
	},C("70~79"){
		@Override
		public String getChinaScore() {
			return "可";
		}
	},D("60~69"){
		@Override
		public String getChinaScore() {
			return "差";
		}
	},E("0~59"){
		@Override
		public String getChinaScore() {
			return "不及格";
		}
	};
	private String fen;
	private Score(String fen){
		this.fen = fen;
	}
	public String getFen(){
		return this.fen;
	}
	public abstract String getChinaScore();
}
