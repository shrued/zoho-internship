import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Check {
    void check();
}

class CheckClass implements Check {
    public void check(){
        System.out.println("Printing");
    }
//    public void check2(){
//        System.out.println("Printing");
//    }
}

class MyInvocationHandler implements InvocationHandler {
    private final Check cl;

    public MyInvocationHandler(Check cl) {
        this.cl = cl;
    }
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        String methodName = method.getName();
        System.out.println(methodName);
        method.invoke(cl, null);
        return null;
    }
}

public class Third {
    public static void main(String[] args) throws NoSuchMethodException {
        Check cl = new CheckClass();
        InvocationHandler handler = new MyInvocationHandler(cl);
//        Check cl = new CheckClass();
//        Method method =
//                cl.getMethod("getName", new Class[]{String.class});

        Check proxy = (Check)Proxy.newProxyInstance(
                Check.class.getClassLoader(),
                new Class[] { Check.class },
                handler);

//        Class invocationHandler = Proxy.getInvocationHandler(proxy).getClass();
//        System.out.println(invocationHandler.getName());

        proxy.check();

//        System.out.println(proxy.getClass().getMethod("getName", null));
//        System.out.println(Proxy.getInvocationHandler(proxyClass));
    }
}
