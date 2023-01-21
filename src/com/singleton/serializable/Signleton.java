package com.singleton.serializable;

import com.singleton.Singleton;

public class Signleton implements Cloneable  {

	private static Singleton singletonobject;

	private Signleton() {

	}
	public static Singleton getSingletonObject() {
		synchronized (Singleton.class) {

			if (singletonobject == null) {
				singletonobject = new Singleton();
			} else {
				return singletonobject;
			}
			return singletonobject;
		}

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Singleton obj1 = Singleton.getSingletonObject();
		Singleton obj2 = (Singleton) obj1.clone();

		System.out.println("object 1>>"+obj1.hashCode());
		System.out.println("object 2>>"+obj2.hashCode());
	

		

	}

}
