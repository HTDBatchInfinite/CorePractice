package com.core.ObjectMethods;

public class SampleBean {
	@Override
	public String toString() {
		return "SampleBean [res=" + res + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + res;
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
		SampleBean other = (SampleBean) obj;
		if (res != other.res)
			return false;
		return true;
	}

	int res=10;
	static int val=10;
	public static void main(String[] args) {
		SampleBean bean=new SampleBean();
		passByVal(bean);
		System.out.println(bean.toString());
		
		passByRef(bean,val);
		System.out.println("val::"+val);
		System.out.println("res::"+bean.res);
	}

	private static void passByVal(SampleBean bean) {
		System.out.println("inside passByVal::"+bean);
		bean=null;
		System.out.println("inside passByVal::"+bean);
	}

	private static void passByRef(SampleBean bean, int val) {
		val=val+10;
		bean.res=bean.res+10;
	}

}
