// Overview methods of Class class in Java (in this case, they are all public)

public String getName() {}
public static Class forName (String className) throws ClassNotFoundException {}
public Object newInstance() throws InstantiationException, IllegalAccessException {}
public boolean isInterface() {}
public boolean isArray() {}
public boolean isPrimitive() {}
public Class getSuperclass() {}
public Field[] getDeclaredFields() throws SecurityException {}
public Method[] getDeclaredMethods() throws SecurityException {}
public Constructor[] getDeclaredConstructors() throws SecurityException {}
public Method getDeclaredMethod (String name, Class[] parameterTypes) throws NoSuchMethodException, SecurityException  {}
