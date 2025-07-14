package model;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="uid")
		private int id;
		
		@Column(name="username",length = 20)
		private String name;
		
		@Column(name="email",length = 50)
		private String email;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		
		
}
