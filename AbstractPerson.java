//�e�b�N�u�[�X�g�@���@3�@�ۑ�2�@ 
//AbstractPerson class �����߂悭�킩��Ȃ��@new�ł��Ȃ��ꍇ�̃C���X�^���X���́H
//���ۃ��\�b�g���܂ރN���X�錾
public abstract class AbstractPerson{
    
    //����ҿ�ā@�q�N���X�̂ق��łǂ�ȏ������邩�������Ăق����Ƃ����Ӗ�
    abstract public String getGender(); //�q�N���X�ł��̃��\�b�g��K�����Ȃ��Ƃ����Ȃ�
    public void speak(){
        System.out.println("I'm a " + getGender()); //�Ȃ�getGender()�Ȃ̂��@//�q�N���X��getGender���Ăяo�����
    }
}