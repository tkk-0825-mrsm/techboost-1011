//文法１　課題①
public class ArgsLastPrinter{
    public static void main(String[]args){
        //型+変数　複数の引数を引き取りたいときに[]をつける(配列を指定）String型の配列でargsを引き取る
        if(args.length==0){
            //args.length�͔z��̒��g�������邩�@length�͒����@�����\�[�X�̒��Ŋm�F���Ă���
            //�����������n����Ȃ��������if�i����̏ꍇ�j
            System.out.println("nothing");
        }
        else{
            System.out.println(args[args.length-1]);
        }
        //�����łȂ������ꍇ �����������Ă��else
        //args.length-1:������0����n�܂邩��
    }
}
//�G���[�ɂȂ�Ȃ��悤�ɍ��iclass�Ȃǂ����ׂĎ~�܂��Ă��܂��j���ׂẴp�^�[����z�肷��