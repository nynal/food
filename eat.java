
class eat {
	public static void main (String[]args){
		
		int eatNumber = 1 + (int)(Math.random() * 12 );
		
		System.out.println ( "�����" + eatNumber + "���o�܂���" );
		
		switch ( eatNumber){
			
		case 1 : System.out.println("�X�V���[�֍s����");
			break ;
			
		case 2 : System.out.println("����֍s����");
			break ;
			
		case 3 : System.out.println("�����܂֍s����");
			break ;
			
		case 4 : System.out.println("�}�N�h�i���h�֍s����");
			break ;
			
		case 5 : System.out.println("�����Ƃ֍s����");
			break ;
			
		case 6 : System.out.println("�X�[�p�[�Ŕ�����");
			break ;
			
		case 7 : System.out.println("�r�u���I����֍s����");
			break ;
			
		case 8 : System.out.println("�b���b����ԉ��֍s����");
			break ;
			
		case 9 : System.out.println("�p���E�h�E�t�@���t�@�[���@���j��x��");
			break ;
			
		case 10 : System.out.println("�ۋT����");
			break ;
			
		case 11 : System.out.println("���򘥊ہ@��11�F00�`�@�Ηj����x��");
			break ;
			
		case 12 : System.out.println("�P���^�b�L�[");
			break ;
	
		case 13 : System.out.println("");
			break ;
			
		case 14 : System.out.println("");
			break ;
			
		case 15 : System.out.println("");
			break ;

//�\�����F
//�r���I������@�R�R�X�@�K�X�g�@�����@�f�r�C���h�l�p�����X�g�����@�W���C�t���@�g��@����Ԃ����

		}
		
		
		if ( eatNumber == 6 ){
			
			int Number = 1 + (int)(Math.random() * 3 ) ;
			
			switch ( Number ){
				
				case 1 : System.out.println("�a�H");
					break;
				
				case 2 : System.out.println("�m�H");
					break;
					
				case 3 : System.out.println("����");
					break;
				
			}
		}
		
		}
	
}