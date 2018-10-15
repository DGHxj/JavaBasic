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

	// hashCode的重写：
	// 如果两个对象equals为true，那么哈希码一致
	// 不同对象的哈希码要不同并且要做到散列分布
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
	// // 判断地址是否一致
	// if (this == obj)
	// return true;
	//
	// // 判断参数是否为空
	// if (obj == null)
	// return false;
	//
	// // 判断类型是否一致
	// if (this.getClass() != obj.getClass())
	// return false;
	//
	// // 判断属性是否一致
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