package com.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class MyBean{
	
	private Integer entero;
	
	public MyBean(){}
	
	public Integer getEntero(){
		return entero;
	}
	
	public void setEntero(Integer entero){
		this.entero = entero;
	}
	
}