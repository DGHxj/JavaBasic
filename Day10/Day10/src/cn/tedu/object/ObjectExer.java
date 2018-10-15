package cn.tedu.object;

public class ObjectExer {

}

class User {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// hashCode����д��
	// �����������equalsΪtrue����ô��ϣ��һ��
	// ��ͬ����Ĺ�ϣ��Ҫ��ͬ����Ҫ����ɢ�зֲ�
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		User other = (User) obj;

		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;

		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;

		return true;
	}

	// @Override
	// public boolean equals(Object obj) {
	//
	// // �жϵ�ַ�Ƿ�һ��
	// if (this == obj)
	// return true;
	//
	// // �жϲ����Ƿ�Ϊ��
	// if (obj == null)
	// return false;
	//
	// // �ж������Ƿ�һ��
	// if (this.getClass() != obj.getClass())
	// return false;
	//
	// // �ж������Ƿ�һ��
	// User user = (User) obj;
	//
	// if (this.username == null) {
	// if (user.username != null)
	// return false;
	// } else if (!this.username.equals(user.username))
	// return false;
	//
	// if (this.password == null) {
	// if (user.password != null)
	// return false;
	// } else if (!this.password.equals(user.password))
	// return false;
	//
	// return true;
	//
	// }

}