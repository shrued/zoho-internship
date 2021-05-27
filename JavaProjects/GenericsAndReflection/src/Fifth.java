import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Phones {
    void version1(String version);
    void version2(String version);
    void version3(String version);
}

class IPhone implements Phones {
    public void version1(String version) {
        System.out.println("V1: Passcode Lock");
    }

    public void version2(String version) {
        System.out.println("V2: Fingerprint Lock");
    }

    public void version3(String version) {
        System.out.println("V3: Face Lock");
    }
}

class PhonesInvocationHandler implements InvocationHandler {

    private final Phones phone;

    public PhonesInvocationHandler(Phones phone) {
        this.phone = phone;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Method m = phone.getClass().getMethod((String) args[0], String.class);
        m.invoke(phone, args);
        return null;
    }
}


public class Fifth {
    public static void main(String[] args) {
        Phones phones = new IPhone();
        
        Phones proxy = (Phones) Proxy.newProxyInstance(
                Phones.class.getClassLoader(),
                new Class[] { Phones.class },
                new PhonesInvocationHandler(phones));

        proxy.version1("version2");
    }
}
