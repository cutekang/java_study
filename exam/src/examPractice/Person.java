package examPractice;

import java.util.Objects;

public class Person {
	private int id;
	private int age;
	private String name, phone, job;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public Person() {;}
	public Person(String name, int age, String phone, String job) {
		setId(0);
		setAge(age);
		setName(name);
		setPhone(phone);
		setJob(job);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, id, job, name, phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && id == other.id && Objects.equals(job, other.job) && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone);
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + ", phone=" + phone + ", job=" + job + "]";
	}
	public void work() {
		System.out.println("일을 합니다");
	}
	public void checkLotto(String[] luckyNumbers) {
		
	}
}
