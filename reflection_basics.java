// Overview methods of Class class in Java (in this case, they are all public)

public String getName() {}
// ⇒ Returns the class name.

public static Class forName (String className) throws ClassNotFoundException {}
// ⇒ Loads the class and returns the reference of Class class.


public Object newInstance() throws InstantiationException, IllegalAccessException {}
// ⇒ Creates new instance.

public boolean isInterface() {}
// ⇒ Checks if it is an interface.

public boolean isArray() {}
// ⇒ Checks if it is an array.

public boolean isPrimitive() {}
// ⇒ Checks if it is a primitive.

public Class getSuperclass() {}
// ⇒ Returns the superclass class reference.

public Field[] getDeclaredFields() throws SecurityException {}
// 

public Method[] getDeclaredMethods() throws SecurityException {}
// 

public Constructor[] getDeclaredConstructors() throws SecurityException {}
// 

public Method getDeclaredMethod (String name, Class[] parameterTypes) throws NoSuchMethodException, SecurityException  {}
// 