package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		int[] datas= new int[5];
		ExceptionTest test = null;
		
		try {
			System.out.println("우리 모두 화이팅!");
//			System.out.println(10/0);
//			System.out.println(datas[5]);
//			System.out.println(test.toString());
			System.out.println("모은서");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} 
//		catch(NullPointerException e) {
//			System.out.println(e.getMessage());
//		} 
		catch(Exception e) { // 모든 예외의 부모 클래스
			System.out.println(e);
			System.out.println("예상하지 못한 에러 발생");
		}
		finally {
			System.out.println("예외 발생 유무와 상관없이 실행!");
		}
	}
}
