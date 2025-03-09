class Computer{
    public void playMusic(){
            System.out.println("Music playing");
    }
    public String getMeAPen(int cost){
       if(cost>=10)
        return "pen";
       else
       return "noting";

    }
}public class Method{
    public static void main(String a[]){
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(10);
        System.out.println(str);
    }
}