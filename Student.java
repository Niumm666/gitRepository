package com.situ.day01;


public class Student {
	// ����
	private String name;
	private int age;
	private String classname;

	// ����

	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0||age>100){
			System.out.println("��������Ƿ�");
			return;
		}
			
		this.age = age;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public void study() {
		System.out.println(name + "����" + classname + "ѧϰ");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", classname="
				+ classname + "]";
	}
	
	
}
