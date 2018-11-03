package model;

import java.util.List;

public interface DataStructureDAO {
    boolean add(DataStructure dataStructure);

    List<DataStructure> findAll();

}
