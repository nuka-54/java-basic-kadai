package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		Kato_Chapter18 katoTaro = new KatoTaro_Chapter18();
		Kato_Chapter18 katoIchiro = new KatoIchiro_Chapter18();
		Kato_Chapter18 katoHanako = new KatoHanako_Chapter18();
		
		katoTaro.setGivenName("太郎");
		katoTaro.execIntroduce();
		System.out.println("");
		
		katoIchiro.setGivenName("一郎");
		katoIchiro.execIntroduce();
		System.out.println("");
		
		katoHanako.setGivenName("花子");
		katoHanako.execIntroduce();
		System.out.println("");
	}

}
