package view;

import model.Lista;

public class Main {
	
	public static void main(String[] args) throws Exception{
		
		int[] vetorA = {3,5,8,12,9,7,16};
		int[] vetorB = {9,6,2,3,7};
		
		Lista a = new Lista();
		Lista b = new Lista();
		Lista i = new Lista();
		Lista u = new Lista();
		
		a.vectorInit(vetorA, a);
		b.vectorInit(vetorB, b);
		
		i = intersecao(a, b);
		u = uniao(a, b);
		
		u.printList(u);
		
	}

	private static Lista uniao(Lista a, Lista b) throws Exception{
		
		Lista aux = new Lista();
		
		for(int i=0;i<a.size();i++) {
			if(aux.isEmpty()) {
				aux.addFirst(a.get(i));
			}else {
				aux.addLast(a.get(i));
			}
		}
		for(int i=0;i<a.size();i++) {
			for(int j=0;j<b.size();j++) {
				
				if(a.get(i)==b.get(j)) {
					b.remove(j);
				}
			}
		}
		for(int i=0;i<b.size();i++) {
			aux.addLast(b.get(i));
		}
		return aux;
	}

	private static Lista intersecao(Lista a, Lista b) throws Exception{
		
		Lista aux = new Lista();
		
		for(int i=0;i<a.size();i++) {
			for(int j=0;j<b.size();j++) {
				if(a.get(i) == b.get(j)) {
					if(aux.isEmpty()) {
						aux.addFirst(a.get(i));
					}else {
						aux.addLast(a.get(i));
					}
				}
			}
		}
		return aux;
	}
}
