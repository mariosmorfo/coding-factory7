package gr.aueb.cf.ch20.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Teacher.class;
        Class<?> aClass = Class.forName("gr.aueb.cf.ch20.reflection.Teacher");

        Constructor<?>[] publicConstructors = Teacher.class.getConstructors();
        Constructor<?>[] constructorsList = Teacher.class.getDeclaredConstructors();

        Constructor<?> defaultCtr = clazz.getDeclaredConstructor();
        defaultCtr.setAccessible(true);

        Teacher teacher = (Teacher) defaultCtr.newInstance();
        Constructor<?> longCtor = Teacher.class.getConstructor(long.class);

        Constructor<?> overloadedCtor = clazz.getConstructor(long.class, String.class, String.class);

        Method sayHello = clazz.getMethod("sayHello");
        sayHello.setAccessible(true);
        sayHello.invoke(teacher);
    }
}
