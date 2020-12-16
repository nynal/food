
class eat {
	public static void main (String[]args){
		
		int eatNumber = 1 + (int)(Math.random() * 12 );
		
		System.out.println ( "今回は" + eatNumber + "が出ました" );
		
		switch ( eatNumber){
			
		case 1 : System.out.println("スシローへ行こう");
			break ;
			
		case 2 : System.out.println("かつやへ行こう");
			break ;
			
		case 3 : System.out.println("からやまへ行こう");
			break ;
			
		case 4 : System.out.println("マクドナルドへ行こう");
			break ;
			
		case 5 : System.out.println("すき家へ行こう");
			break ;
			
		case 6 : System.out.println("スーパーで買おう");
			break ;
			
		case 7 : System.out.println("ビブリオ珈琲へ行こう");
			break ;
			
		case 8 : System.out.println("ＣｏＣｏ壱番屋へ行こう");
			break ;
			
		case 9 : System.out.println("パン・ド・ファンファーレ　月曜定休日");
			break ;
			
		case 10 : System.out.println("丸亀製麺");
			break ;
			
		case 11 : System.out.println("金沢丼丸　※11：00～　火曜日定休日");
			break ;
			
		case 12 : System.out.println("ケンタッキー");
			break ;
	
		case 13 : System.out.println("");
			break ;
			
		case 14 : System.out.println("");
			break ;
			
		case 15 : System.out.println("");
			break ;

//予備候補：
//ビリオン珈琲　ココス　ガスト　王将　デビインドネパルレストラン　ジョイフル　吉川　しゃぶしゃぶ

		}
		
		
		if ( eatNumber == 6 ){
			
			int Number = 1 + (int)(Math.random() * 3 ) ;
			
			switch ( Number ){
				
				case 1 : System.out.println("和食");
					break;
				
				case 2 : System.out.println("洋食");
					break;
					
				case 3 : System.out.println("中華");
					break;
				
			}
		}
		
		}
	
}