package models;

import java.util.Arrays;

public class Lista<T> {
	
	//Atributos
	private T[] elementos;
	private int index;
	
	//Constructor
	public Lista(T[] elementos, int index) {
		super();
		this.elementos =(T[]) new Object[0] ;
		this.index = 0;
	}
	
	//Métodos
	public void add(T elemento){			//Añadira un elemento al array
		T[] sig = (T[]) new Object[this.elementos.length+1];
		
		for(int i = 0; i< this.elementos.length; i++){
			
			sig[i]=this.elementos[i];
			this.index = i;
		}
		sig[sig.length - 1]= (T) elemento;
		this.elementos = sig;
	}
	
	public void remove(T elemento){			//Solamente consigo que me lo convierta en null...
	
		  for(int i=0;i<this.elementos.length;i++){
			   if(this.elementos[i]==elemento){
				this.elementos[i]=null;
			    this.index = i-1;
			    T[] elementos = (T[]) new Object[this.elementos.length - 1];
			   }
			  
			  }
		  
	}
	
	public T getNext(){ 					//El indice sera el siguiente al que este
		T index = this.elementos[this.index + 1];
		if(this.elementos[this.index + 1] == null){
			index = this.elementos[0];
		}
		this.index= this.index + 1;
		return index;
	}
	public T getPrev(){						//El indice sera el previo al que este
		T index = this.elementos[this.index-1];
		this.index = this.index -1;	
		return index;
	}
	public T getCurrent(){					//Devolvera el indice actual
		
		T index = this.elementos[this.index];
		
		
		return index;
	}
	public int setIndex(int i){		//No voy a hacer una validacion por que no admite letras
									//y si le ponemos un numero mayor o menor al tamaño del array te
									//devuelve -1
		
		if(i <= this.elementos.length && i> -1){
			
			this.index = i;
		}else if( i> this.elementos.length || i < -1){
			return -1;
		}
		return i;
	}
	
	@Override
	public String toString() {
		return "Lista =" + Arrays.toString(elementos) + "\n";
	}
	

}
