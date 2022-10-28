//LSP
//Cuando tenemos una interfaz general de los animales y
//la implementamos en todos lo animales 
//no siempre se va cumplir ya que no todos los animales saltan, como los es para 
//El elephante, en ese caso lanzaria una exception
//siendo asi que viole el principio de LSP que dice que 
//las interfaces deben tener responsabilidades especificas 

public class Animal{
	void walk();
	void jump();
}

public class Elephant extends Animal{
	void walk(){
		//camina
	}

	void jump(){
		throw Exception("Los elephantes no pueden saltar");
	}

}


//MANERA CORRECTA : 
// declarar una clase que sea de tipo AnimalLigero y que esta pueda tanto saltar como caminar
// mientras que los animales en general si pueden caminar
//Esto nos permite establecer a ciertos tipos de animales que no pueden saltar como lo es el Elephant

public class Animal{
	void walk();
}

public class AnimalLigero extends Animal{
	void jump();
}

public class Dog extends AnimalLigero{
	void jump(){
	}

	void walk(){
	}
}

public class Elephant extends Animal{
	void walk(){
	}
}