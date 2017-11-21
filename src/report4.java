public class report4 {
    public static void main(String[] args){
        try{
            String str = null;
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("変数strの中身はnullです。");
            System.out.println(e.getMessage());
        }
    }
}
