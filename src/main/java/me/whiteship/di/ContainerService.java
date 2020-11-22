package me.whiteship.di;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * Created by jojoldu@gmail.com on 2020-11-01
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */
public class ContainerService {
  public static <T> T getObject(Class<T> classType){
      T instance = createInstance(classType);
      Arrays.stream(classType.getDeclaredFields()).forEach(f -> {
          if(f.getAnnotation(Inject.class) != null){
              Object fieldInstance = createInstance(f.getType());
              f.setAccessible(true);
              try {
                  f.set(instance,fieldInstance);
              } catch (IllegalAccessException e) {
                  throw new RuntimeException();
              }
          }
      });
      return instance;
  }
  public static <T> T createInstance(Class<T> classType)  {
      try {
        return classType.getConstructor(null).newInstance();
      }catch (NoSuchMethodException| IllegalAccessException| InvocationTargetException| InstantiationException e){
          throw new RuntimeException();
      }
  }

}
