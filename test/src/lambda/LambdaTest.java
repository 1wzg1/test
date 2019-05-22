/**
 * @author wangzhiguo
 * 
 * @date 2019年3月23日
 *
 * @TODO
 */
package lambda;

import java.lang.reflect.Method;
import java.util.function.Function;

/**
 * @author wangzhiguo
 *
 * @date 2019年3月23日
 */
public class LambdaTest {
	
  static final int a=100;
	
  public static void main(String[] args) {
	  //使用Lambda表达式来表示该接口的一个实现
	  GreetingService greetService1 = (a,b) -> {
		 return a+b;
		};
	  LambdaTest test = new LambdaTest();
	  int i = test.option(greetService1, 1, 2);
	  System.out.println(i);
  }
  public int option(GreetingService greetingService,int c,int d){
	return greetingService.sayMessage(c, d);
  }
}
interface GreetingService 
	{
	    int sayMessage(int a,int b);
	    //接口中可以定义非抽象default方法
	    public default  void Test(){
	    	System.out.println("aaa");
	    };
	}

