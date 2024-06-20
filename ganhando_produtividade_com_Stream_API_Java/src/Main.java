import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		Optional<String> optionalValue = Optional.ofNullable("Hoje");
		String result = optionalValue.orElse("Default"); 
		System.out.println(result);
	}
}
