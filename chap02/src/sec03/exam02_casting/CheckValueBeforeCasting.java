package sec03.exam02_casting;
public class CheckValueBeforeCasting {
  public static void main(String[] args) {
	  int i = 128;
	  
	  System.out.println("Byte.MIN_VALUE : " + Byte.MIN_VALUE);
	  System.out.println("Byte.MAX_VALUE : " + Byte.MAX_VALUE);
	  
	  if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE) ) {
		  System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
		  System.out.println("���� �ٽ� Ȯ���� �ּ���");
	  } 
	  else {
		  byte b = (byte) i;
		  System.out.println(b);
	  }
  }
}

