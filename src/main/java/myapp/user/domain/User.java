package myapp.user.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Userクラス.
 */
@Entity // JPAのエンティティであることを示す.
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id // エンティティのID
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;

	public User(){
		// 引数なしコンストラクタが必要！
	}

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
