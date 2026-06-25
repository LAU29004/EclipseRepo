package Problem;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodingDemo {

	public static void main(String[] args) {
		String password = "gRacias@105";
		System.out.println(password);

		Encoder encoder = Base64.getEncoder();
		String encoded = encoder.encodeToString(password.getBytes());
		System.out.println("Password after Encryption is: " + encoded);

		Decoder decoder = Base64.getDecoder();
		byte[] decoded = decoder.decode(encoded.getBytes());
		System.out.println("Password after Decryption is: " + new String(decoded));
	}

}
