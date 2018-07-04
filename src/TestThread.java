public class TestThread {

    public static void main(String[] args){
        Runner1 r = new Runner1();
        Thread t = new Thread(r);
        t.start();
        // r.run(); 不能使用，因为这是方法调用
        for(int i=0;i<100;i++){
            System.out.println("Main Thread:-----"+ i );
        }

    }
}

class Runner1 implements Runnable{ //尽量使用 继承接口， 不要使用extends Thread，因为继承父类，只能实现一次，而接口可以实现多个
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Runner1:"+i);
        }
    }
}
