package person;





/**
 * 创建Person接口
 * @author Gonjan
 */
public class AnonymousFuntion {

    public static void main(String[] args)  {
        String a=new CustomerImpl().sayHello("\"nibushishuo eima \"\n");
        System.out.println(a);
        String b = new Customer() {
            public String sayHello(String name) {
                return "Hello2 " + name;
            }

            public int Add(int a, int b) {
                return a + b;}

        }.sayHello("hongdada");

        System.out.println(b);

    }
}

interface Customer {
    public String sayHello(String name);
    public int Add(int a ,int b);
}

class CustomerImpl implements Customer {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
    @Override
    public int Add(int a ,int b){
        return a+b;
    }
}