//テックブースト　文法3課題4
//ラムダ式で現在の時間 (HH:mm:ss.SSS) と半角スペースと 1 から 9999 の連番
//オンサポで質問済。回答教えてもらった　ラムダ式はよくわからない
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

public class Lambda {
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 10000);
        //ラムダ式 sの値
		stream.forEach(s -> System.out.println(FORMATTER.format(LocalDateTime.now())+ " "+ s));
	}

	private static String currentTime() {
		return FORMATTER.format(LocalDateTime.now());
	}
}

