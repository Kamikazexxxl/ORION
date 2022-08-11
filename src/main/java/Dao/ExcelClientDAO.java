package Dao;

import Entities.ClientEntity;

import java.util.List;

public interface ExcelClientDAO {

    List<ClientEntity> getListOfClients();
    ClientEntity getClientById (int id);
}
