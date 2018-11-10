package io.adamcarter.contactmgr;

import io.adamcarter.contactmgr.model.Contact;
import io.adamcarter.contactmgr.model.Contact.ContactBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Application {
    // Hold a reusable reference to a sessionFactory
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        // Create a standard service registry object
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        return new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }

    // in intelliJ, type psvm and it should suggest this auto complete main method for you
    public static void main(String[] args) {
        Contact contact = new ContactBuilder("Adam", "Carter")
                .withEmail("me@me")
                .withPhone(512L)
                .build();
        // Open a session
        Session session = sessionFactory.openSession();

        // Begin a transaction
        session.beginTransaction();

        // Use the session to save the contact
        // the parameter you pass into this is what you want to save
        session.save(contact);

        // Commit the transaction
        session.getTransaction().commit();

        // Close the session
        session.close();
    }
}
