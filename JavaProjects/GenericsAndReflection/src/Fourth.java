import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Methods {
    void method1();
    void method2();
}

class MethodsClass implements Methods {
    public void method1(){
        System.out.println("Printing 1");
    }
    public void method2(){
        System.out.println("Printing 2");
    }
}

class MyHandler implements InvocationHandler {
    private final Methods cl;

    public MyHandler(Methods cl) {
        this.cl = cl;
    }
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        String methodName = method.getName();
        System.out.println(methodName);
//        method.invoke(cl.method2(), null);
        Method m = cl.getClass().getMethod("method2");
//        System.out.println(m);
//        method.invoke(cl, null);
        m.invoke(cl);

        return null;
    }
}

public class Fourth {
    public static void main(String[] args) throws NoSuchMethodException {
        Methods cl = new MethodsClass();
        InvocationHandler handler = new MyHandler(cl);

        Methods proxy = (Methods)Proxy.newProxyInstance(
                Methods.class.getClassLoader(),
                new Class[] { Methods.class },
                handler);

        proxy.method1();
    }
}
