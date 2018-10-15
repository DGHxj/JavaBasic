package cn.tedu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Level{
	String value() default "����";
}

@Level("����")
public class Police {
	public static void main(String[] args) {
		System.out.println("���������ã��������ˣ�����200Ԫ~~");
		Class clz = Police.class;
		if(clz.isAnnotationPresent(Level.class)){
			Level l = (Level) clz.getAnnotation(Level.class);
			if("Э��".equals(l.value())){
				System.out.println("�ٷ��㣬��50����~~");
			}else if("����".equals(l.value())){
				System.out.println("����̣�200�������־ͱ����~~");
			}else if("�̾�".equals(l.value())){
				System.out.println("��200���Ͻ���~~");
			}else{
				System.out.println("��200����������~~");
			}
		}else{
			System.out.println("��һ�٣�Ť���ɳ���~~");
		}
	}
}
