//�e�b�N�u�[�X�g�@���@3 �ۑ�P �����߂��������ŗ����ł��ĂȂ�
public class Person{
    public enum Gender { MAN, WOMAN };	
    private Gender gender;
      
    //�R���X�g���N�^�@�ŏ���MAN��n��
        public Person(Gender gender) {
            //���̃N���X�̃W�F���_�[�@�n���Ă�����ăN���X�ϐ��֓����@man��woman�ǂ����������
            this.gender = gender;
        }
    //Person�N���X��speak���\�b�g���Ăяo��
        public void speak() {
            switch (gender) {
                case MAN:
                    System.out.println("I'm a man");
    break;
                case WOMAN:
                    System.out.println("I'm a woman");
    break;
    default:
    }
        }
    public static void main(String[] args) {
            Person man = new Person(Gender.MAN);
            man.speak();
    
            Person woman = new Person(Gender.WOMAN);
            woman.speak();
        }
    }