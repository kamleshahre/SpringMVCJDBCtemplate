package com.raagas.springsample.dao;

import com.raagas.springsample.model.Contact;

import java.util.List;

/**
 * Created by kamlesh_ahire on 2/26/2016.
 *
 */
public interface ContactDAO {

    public void saveOrUpdate(Contact contact);

    public void delete(int contactId);

    public Contact get(int contactId);

    public List<Contact> list();

}
