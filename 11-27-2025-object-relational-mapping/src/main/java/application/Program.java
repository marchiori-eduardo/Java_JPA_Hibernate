package application;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {

        //Id's nulos para criação automática pelo banco de dados
        Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
        Pessoa p3 = new Pessoa(null,"Ana Maria", "ana@gmail.com");

        // O objeto EntityManagerFactory é utilizado para instanciar objetos EntityManager.
        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("exemplo-jpa");

        // Com esta instanciação abaixo já teremos automaticamente uma conexão com o banco de dados e o contexto de persistencia implementados
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();//transação com o banco de dados
        em.persist(p1); //inserção de objetos para salvamento no banco de dados
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();// confirmação das alterações

        System.out.println("Peoples insertion successful!");
    }
}
