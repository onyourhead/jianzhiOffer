/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/1/3
 * Time: 10:36
 * Progect: jianzhiOffer
 */
public class No2 {
    /*
    实现单例模式
     */
//    饿汉式
//    private static final No2 no2=new No2();
//
//    private No2() {
//    }
//
//    public static No2 getInstance() {
////        if (no2==null)
////            no2=new No2();
//        return no2;
//    }


//    懒汉式
    private static volatile No2 no2;
    private No2() {
    }
    public static No2 getInstance() {
        if (no2==null) {
            Thread.yield();
            no2=new No2();
//            synchronized (No2.class) {
//                if (no2==null)
//                    no2=new No2();
//            }
        }
        return no2;
    }

    public static void main(String[] args) {
        Thread thread1=new Thread(new ThreadTest());
        Thread thread2=new Thread(new ThreadTest());
        thread1.start();
        thread2.start();
    }
}
class ThreadTest implements Runnable {

    @Override
    public void run() {
        No2 no2_1=No2.getInstance();
        System.out.println(no2_1);
    }
}
