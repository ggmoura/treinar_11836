package br.com.bancointer.model;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Cebola {
	public Integer chorar(Integer minutos) {
		return minutos * 60;
	}
public static void main(String[] args) {
	System.out.println(new Cebola().chorar(10));
}

}
