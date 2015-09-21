package nl.brickworks.charactersheet.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import nl.brickworks.charactersheet.character.Character;

/**
 * Object to get and store a character in the database
 *
 * @author mistorm
 */
public class CharacterDAO {

    public boolean create(Character character) {

        //EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nl.brickworks.charactersheet.jpa");
        //EntityManager entityManager = entityManagerFactory.createEntityManager();
        //entityManager.getTransaction().begin();

        //entityManager.persist(character);

        //entityManager.getTransaction().commit();
        //entityManager.close();
        
        return false;
    }

    public List<Character> fetch() {
        return new ArrayList<>();
    }

    public Character fetch(String id) {
        Character character = new Character(10, 10, 10, 10, 10, 10);
        character.setName("Dummy");
        return character;
    }

    public boolean update(Character character) {
        return false;
    }

    public boolean delete(Character character) {
        return false;
    }
}
