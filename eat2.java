
//どこに食べに行くかランダムで決める

class eat2 {
	public static void main (String[]args){

	//お店を配列に代入する
		String eatStore [] = {
			"スシロー",
			"かつや",
			"からやま",
			"マクドナルド",
			"すき家",
			"スーパー",
			"ビブリオ珈琲",
			"ＣｏＣｏ壱番屋",
			"パン・ド・ファンファーレ",
			"丸亀製麺",
			"金沢丼丸",
			"ケンタッキー"
		};

		
	//ランダムに数字を決める
		int eatNumber =  (int)(Math.random() * eatStore.length );
		
		System.out.println ( "今回は" + eatNumber + "が出ました" );
	
		
		System.out.println( eatStore[eatNumber] + "へ行こう" );
		
	//スーパーが出た場合
		if ( eatStore[eatNumber].equals("スーパー") ){
			
			int Number = 1 + (int)(Math.random() * 3 ) ;
			
			switch ( Number ){
				
				case 1 : System.out.println("和食");
					break;
				
				case 2 : System.out.println("洋食");
					break;
					
				case 3 : System.out.println("中華");
					break;
				
			}
	//その他
		}else if(eatStore[eatNumber].equals("パン・ド・ファンファーレ")){
		
			System.out.println("※月曜日は定休日です");
		
		}else if(eatStore[eatNumber].equals("金沢丼丸")){
			System.out.println("※火曜日は定休日です");
		}
		
	}
}
