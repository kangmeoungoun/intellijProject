package me.whiteship;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        //<Book> bookClass = Book.class;

        //Arrays.stream(bookClass.getFields()).forEach(System.out::println);
        //Book book = new Book();
        /*
        Arrays.stream(bookClass.getDeclaredFields()).forEach(f->{
            try {
                f.setAccessible(true);
                System.out.printf("%s : %s\n",f,f.get(book));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        });
        */
        //Arrays.stream(bookClass.getDeclaredConstructors()).forEach(System.out::println);
        //System.out.println(MyBook.class.getSuperclass());
        //Arrays.stream(MyBook.class.getInterfaces()).forEach(System.out::println);
       //Class<? extends Book> aClass = book.getClass();
       // Class<?> aClass1 = Class.forName("me.whiteship.Book");
        /*
        Arrays.stream(Book.class.getDeclaredFields()).forEach(f->{
            int modifiers = f.getModifiers();
            System.out.println(modifiers);
            System.out.println(f);
            System.out.println(Modifier.isPrivate(modifiers));
            System.out.println(Modifier.isStatic(modifiers));

        });
        */
        //Arrays.stream(MyBook.class.getDeclaredAnnotations()).forEach(System.out::println);
        /*
        Arrays.stream(Book.class.getDeclaredFields()).forEach(f->{
            Arrays.stream(f.getAnnotations()).forEach(a->{
                if(a instanceof MyAnnotation){
                    MyAnnotation myAnnotation = (MyAnnotation) a;
                    System.out.println(myAnnotation.name());
                    System.out.println(myAnnotation.number());
                }
            });
        });
        */
        Class<?> bookClass = Class.forName("me.whiteship.Book");
        Constructor<?> constructor = bookClass.getConstructor(String.class);
        Book book = (Book)constructor.newInstance("myBook");
        System.out.println(book);

        Field b = bookClass.getDeclaredField("B");
        b.setAccessible(true);
        System.out.println( b.get(book));
        b.set(book,"BBBBBB");
        System.out.println( b.get(book));

        Method c = bookClass.getDeclaredMethod("sum",int.class,int.class);
        int invoke = (int)c.invoke(book,1,2);
        System.out.println(invoke);

    }
}
