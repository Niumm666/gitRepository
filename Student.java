package com.situ.day01;


public class Student {
	// 属性
	private String name;
	private int age;
	private String classname;

	// 方法

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
			System.out.println("输入年龄非法");
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
		System.out.println(name + "正在" + classname + "学习");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", classname="
				+ classname + "]";
	}
	
	
}
