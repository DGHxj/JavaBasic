package cn.tedu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("d", 4);
		map.put("h", 7);
		map.put("z", 7);
		map.put("o", 3);
		map.put("t", 3);

		// ����ӳ��
		// ��ʽһ���Ȼ�ȡӳ�������еļ���ɵļ��ϣ�Ȼ��ͨ������ȡ��Ӧ��ֵ
		// keySet��ʾ��ӳ���е����еļ�����һ��Set������
		// Set<String> set = map.keySet();
		// for (String key : set) {
		// System.out.println(key + "=" + map.get(key));
		// }
		// ��ʽ���������еļ�ֵ�Է��뼯���У�Ȼ��������ϻ�ȡ�����ֵ�Ե�����
		// entrySet��ʾ��ӳ���е����еļ�ֵ�Է���һ��Set������
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		// �������ϣ�Ȼ��Ӽ�ֵ���л�ȡ����ֵ
		for (Map.Entry<String, Integer> entry : set) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}

	}

}
