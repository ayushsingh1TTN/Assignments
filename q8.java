class resource implements AutoCloseable{
    public resource(){
        System.out.println("Created 1");
    }
    public void display(){
        System.out.println("resource 1");
    }

    @Override
    public void close(){
        System.out.println("clean up 1");
    }
}

class resource2 implements AutoCloseable{
    public void close(){
        System.out.println("clean up 2");
    }
    public resource2(){
        System.out.println("Created 2");
    }
    public void display(){
        System.out.println("resource 2");
    }
}
public class q8 {
    public static void main(String[] args) {
        resource r = new resource();
        resource2 r2 = new resource2();
        try(r;r2){
            r.display();
            r2.display();
        }
    }
}
