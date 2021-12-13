public class StringOperation {
	public static void main(String[] args) {
		System.out.println("Hello World".length());
		System.out.println("Hello Hello Hello".replace("Hello", "Hi"));
		System.out.println("Hello Hello Hello".replaceAll("Hello", "Hi")); // Á¤±Ô½Ä »ç¿ë °¡´É
		
		String str = "aaabbbcccc[abc]dddd[abc]deeee";
			  
		String result1 = str.replace("[abc]", "¿Õ");
		String result2 = str.replaceAll("[abc]", "¿Õ");
		  
		System.out.println("replace result :\t"+ result1);
		System.out.println("replaceAll result :\t"+ result2);
	}
}
