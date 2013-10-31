package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author HuYong Email:yate7571@hotmail.com
 */
public class LogTalk implements InvocationHandler {
	private Logger logger = Logger.getLogger(this.getClass().getName());

	private Object object;

	public Object bind(Object object) {
		this.object = object;
		return Proxy.newProxyInstance(object.getClass().getClassLoader(),
				object.getClass().getInterfaces(), this);

	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		try {
			log("method starts ...." + method);
			result = method.invoke(object, args);
			log("method ends...." + method);
		} catch (Exception e) {
			log(e.toString());
		}
		return result;
	}

	private void log(String message) {
		logger.log(Level.INFO, message);
	}

}