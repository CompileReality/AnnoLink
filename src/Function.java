import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class Function {

    private final String KEY;
    private final Object Class;
    
    // Assigns the key used to retrieve the appropriate method for execution.  
    // 'Class' is an instance of the class that contains the method to be executed.  
    public Function(String key,Object Class){
        this.Class = Class;
        this.KEY = key;
    }

    // Executes the method associated with the key assigned to the annotation.  
    // 'param' is a list of objects passed as arguments to the method.  
    // Upon execution, the method's return value is returned.  
    // If the method has a void return type, the returned value should be ignored.  
    public Object execute(Object[] param){
	    Object result = null;
        for(Method method:this.Class.getClass().getDeclaredMethods()){
            if (method.isAnnotationPresent(Executable.class)){
                Executable arg = method.getAnnotation(Executable.class);
                if (Objects.equals(arg.key(), this.KEY)){
                    try {
                        result = method.invoke(Class,param);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return result;
    }

}
