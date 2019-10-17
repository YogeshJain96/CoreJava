package test_strings;

public class Test5 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("hello");
		System.out.println(sb+" length "+sb.length()+" capa "+sb.capacity());
		StringBuilder sb1=sb.append(1234);
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb==sb1);
		sb1=sb.append(true).append(123).
				append(34.56).append('c');
		System.out.println(sb);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb);
		System.out.println(sb==sb1);
		System.out.println("capa before "+sb.capacity());
		sb.delete(0, sb.length());
		System.out.println("sb="+sb);
		System.out.println(sb.length()+" "+sb.capacity());
		sb.trimToSize();
		System.out.println(sb.length()+" "+sb.capacity());
		
	}

}
