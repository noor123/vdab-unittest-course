package com.realdolmen;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;

public class JdbcPersonRepositoryTest {

    @Before
    public void initializeDataSets() throws Exception {

        // Create DBUnit Connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test2","root","");
        IDatabaseConnection databaseConnection = new DatabaseConnection(connection);

        //load dataset person.xml
        IDataSet peopleDataSet = new FlatXmlDataSetBuilder().build(new File("person.xml"));

        //execute CLEAN_INSERT operation using 1 and 2
        DatabaseOperation.CLEAN_INSERT.execute(databaseConnection, peopleDataSet);

    }

    @Test
    public void testPersonCanBeFoundByID1() throws Exception {
        PersonRepository repository = new JdbcPersonRepository();
        Person person = repository.find(1);
        assertEquals("Jimi", person.getFirstName());
        assertEquals("Hendrix", person.getLastName());
        assertEquals("Langestraat", person.getAddress().getStreet());
        assertEquals("8B", person.getAddress().getNumber());
        assertEquals("Leuven", person.getAddress().getCity().getName());
        assertEquals("3000", person.getAddress().getCity().getPostalCode());
        assertEquals("1988-11-05", person.getBirthDate().toString());
    }

    @Test
    public void testPersonCanBeFoundByID2() throws Exception {
        PersonRepository repository = new JdbcPersonRepository();
        Person person = repository.find(2);
        assertEquals("Sofie", person.getFirstName());
        assertEquals("Wauters", person.getLastName());
        assertEquals("Kortestraat", person.getAddress().getStreet());
        assertEquals("311", person.getAddress().getNumber());
        assertEquals("Hasselt", person.getAddress().getCity().getName());
        assertEquals("3500", person.getAddress().getCity().getPostalCode());
        // assertEquals(Date.from(1990-10-14), person.getBirthDate());
    }

    @Test
    public void testPersonCanBeFoundByIDWhereIdNotExistsInDatabase() throws Exception {
        PersonRepository repository = new JdbcPersonRepository();
        Person person = repository.find(3);
        assertEquals(null, person);
    }




}
