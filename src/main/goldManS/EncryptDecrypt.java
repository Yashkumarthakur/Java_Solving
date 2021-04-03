package goldManS;

//https://leetcode.com/discuss/interview-question/334671/goldman-sacks-july-2019-hackerrank-2

public class EncryptDecrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Message is Open key is 321");
		System.out.print("Encryption :");
		encrypt("Open", "321");
		System.out.print("Decryption :");
		decrypt("OOOppen", "321");

		decrypt("Oppeeennnn", "123");
	}

	public static void decrypt(String msg, String key) {
		if (msg == null || msg == " " || key == null || key == " ")
			System.out.println(msg);
		int msgLen = 0;
		int keyLen = 0;
		StringBuilder sb = new StringBuilder();
		int counter = 0;
		while (keyLen != key.length() && msgLen != msg.length()) {
			int count = (int) key.charAt(keyLen) - '1' + 1;
			counter = counter + count;
			char ch = msg.charAt(counter - 1);
			sb.append(ch);
			keyLen++;
			msgLen = counter;
		}
		while (msgLen != msg.length()) {
			sb.append(msg.charAt(msgLen));
			msgLen++;
		}
		System.out.println(sb.toString());
	}

	public static void encrypt(String msg, String key) {
		if (msg == null || msg == " " || key == null || key == " ")
			System.out.println(msg);

		int msgLen = 0;
		int keyLen = 0;
		StringBuilder sb = new StringBuilder();
		while (keyLen != key.length() && msgLen != msg.length()) {
			int count = (key.charAt(keyLen) - '1') + 1;
			char ch = msg.charAt(msgLen);
			while (count != 0) {
				sb.append(ch);
				count--;
			}
			keyLen++;
			msgLen++;
		}
		while (msgLen != msg.length()) {
			sb.append(msg.charAt(msgLen));
			msgLen++;
		}

		System.out.println(sb.toString());
	}
}