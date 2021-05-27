import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface ITest {
    int testIt();
}

class Test implements ITest {
    public int testIt() {
        return 11;
    }
}
class DynamicInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)        {

        if ("testIt".equals(method.getName())) {
            return 5;
        }

        return null;
    }
}
public class Trial {
    public static void main(String[] args) {
        DynamicInvocationHandler myTestInvocationHandler = new DynamicInvocationHandler();

        ITest test = (ITest) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[] {
                ITest.class
        }, myTestInvocationHandler);

        System.out.println(test.testIt());
    }
}