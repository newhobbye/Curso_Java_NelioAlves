package Generics;

import java.util.ArrayList;
import java.util.List;

public class ListaVariavel <T>{
	
	private List <T> list = new ArrayList<>();
	
	public void addValor(T valor) {
		list.add(valor);
	}
	
	public void print() {
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
			
		}
	}
}
