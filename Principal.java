

public class Principal {

    public static void main(String[] args) {


        Gato gato1 = new Gato();

        gato1.setNomeAnimal("Nome Animal : Luke");
        gato1.setDono("Nome Dono : Kaua Miranda Alves");
        gato1.setEndereco("Endereco : Rua Veterano Telmo Pinto 99");
        gato1.setRaca("Egipcio");
        gato1.setIdadeAnimal(5);

        System.out.println(gato1.getNomeAnimal());
        System.out.println(gato1.getDono());
        System.out.println(gato1.getEndereco());
        System.out.println(gato1.getRaca());
        System.out.println(gato1.getIdadeAnimal());

        Cachorro dog1 = new Cachorro();
        dog1.setNomeAnimal("Luke");
        dog1.setDono("Fabricio Fernandes Alves");
        dog1.setEndereco("Rua Veterano Telmo Pinto 99");
        dog1.setRaca("Pitbull");
        dog1.setIdadeAnimal(6);

        System.out.println(dog1.getNomeAnimal());
        System.out.println(dog1.getDono());
        System.out.println(dog1.getEndereco());
        System.out.println(dog1.getRaca());
        System.out.println(dog1.getIdadeAnimal());



    }
}
