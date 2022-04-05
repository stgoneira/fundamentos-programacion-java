import java.util.HashSet;
import java.util.Set;

public class Iguales {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil(1);
        Automovil auto1Rep = new Automovil(1);
        Automovil auto2 = new Automovil(2);
        Automovil auto3 = new Automovil(3);
        Moto moto1 = new Moto(1);
        Moto moto2 = new Moto(2);
        Moto moto3 = new Moto(3);

        System.out.printf("auto1 hashcode: %d %n", auto1.hashCode());
        System.out.printf("auto2 hashcode: %d %n", auto2.hashCode());
        System.out.printf("auto3 hashcode: %d %n", auto3.hashCode());
        System.out.printf("%n");
        System.out.printf("moto1 hashcode: %d %n", moto1.hashCode());
        System.out.printf("moto2 hashcode: %d %n", moto2.hashCode());
        System.out.printf("moto3 hashcode: %d %n", moto3.hashCode());
        System.out.printf("%n");
        
        // Los ordena por el número de Hash 
        Set<Transporte> vehiculos = new HashSet<>();
        vehiculos.add(auto1);
        vehiculos.add(auto2);
        vehiculos.add(auto3);
        vehiculos.add(auto1Rep);
        vehiculos.add(moto1);
        vehiculos.add(moto2);
        vehiculos.add(moto3);
        System.out.println( vehiculos );
    }
}

abstract class Transporte {
    protected int id;

    public Transporte(int id) {this.id = id;}
}

class Automovil extends Transporte {

    public Automovil(int id){super(id);}

    @Override
    public boolean equals(Object obj) {
        if( ! (obj instanceof Automovil) ) return false;
        Automovil otroAuto = (Automovil) obj;
        return otroAuto.id == this.id;
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(id).hashCode();
    }
}

class Moto extends Transporte {

    public Moto(int id){super(id);}

    @Override
    public boolean equals(Object obj) {
        if( ! (obj instanceof Moto) ) return false;
        Moto otraMoto = (Moto) obj;
        return otraMoto.id == this.id;
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(id).hashCode();
    }
}
