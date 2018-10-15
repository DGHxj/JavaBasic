package cn.tedu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Level{
	String value() default "交警";
}

@Level("警督")
public class Police {
	public static void main(String[] args) {
		System.out.println("敬个礼，您好，您超速了，罚款200元~~");
		Class clz = Police.class;
		if(clz.isAnnotationPresent(Level.class)){
			Level l = (Level) clz.getAnnotation(Level.class);
			if("协警".equals(l.value())){
				System.out.println("少罚点，罚50得了~~");
			}else if("交警".equals(l.value())){
				System.out.println("抽根烟，200给您，分就别扣了~~");
			}else if("刑警".equals(l.value())){
				System.out.println("交200，赶紧走~~");
			}else{
				System.out.println("交200，不够还有~~");
			}
		}else{
			System.out.println("打一顿，扭送派出所~~");
		}
	}
}
