//�e�b�N�u�[�X�g�@���@3�ۑ�4
//�����_���Ō��݂̎��� (HH:mm:ss.SSS) �Ɣ��p�X�y�[�X�� 1 ���� 9999 �̘A��
//�I���T�|�Ŏ���ρB�񓚋����Ă�������@�����_���͂悭�킩��Ȃ�
//Datetime:���݂̎��Ԃ��擾����
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

public class Lambda {
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 10000);
        //�����_�� s�̒l�@s���ĂȂɁH
		stream.forEach(s -> System.out.println(FORMATTER.format(LocalDateTime.now())+ " "+ s));
	}

	private static String currentTime() {
		return FORMATTER.format(LocalDateTime.now());
	}
}

