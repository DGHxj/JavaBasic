package cn.tedu.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		// ���Ԫ��
		map.put("d", 4);
		map.put("h", 7);
		map.put("z", 7);
		map.put("o", 3);
		map.put("t", 3);
		// �������ͬ���Ӧ��ֵ����
		map.put("o", 0);
		map.put("e", null);

		// ��ȡ��ֵ�Եĸ���
		System.out.println(map.size());

		// �Ƴ���ֵ��
		// map.remove("o");

		// �жϼ��Ƿ����
		// System.out.println(map.containsKey("f"));
		// �ж�ֵ�Ƿ����
		// System.out.println(map.containsValue(4));

		// ����ָ���ļ���ȡ��Ӧ��ֵ
		// System.out.println(map.get("o"));
		// ������������򷵻�null
		// System.out.println(map.get("y"));

		System.out.println(map);

	}

}
