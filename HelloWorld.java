public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World!!");

        // 变量的验证代码
        byte abyte = 0xF;
        System.out.println(abyte);
        short ashort = 0x7FFF;
        System.out.println(ashort);
        int aint=0xFFFFFFFF;
        System.out.println(aint);
        double adouble = 0xFFFFFFFF;
        System.out.println(adouble);

        // 数组变量
        int[] arrayes = new int[20];
        for(byte i=0; i<arrayes.length; i++){
            System.out.print(arrayes[i]);
        }
        
        System.out.println(' ');

        int[] arrayes2 = new int[22];
        for(byte i=0; i<arrayes2.length; i++){
            arrayes2[i] = i;
            System.out.print(arrayes2[i]);
        }

        System.out.println(' ');
        System.arraycopy(arrayes, 0, arrayes2, 3, 10);

        for(byte i=0; i<arrayes2.length; i++){
            // arrayes2[i] = i;
            System.out.print(arrayes2[i]);
        }
    }
}