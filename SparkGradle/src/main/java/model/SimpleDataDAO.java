package model;

import java.util.ArrayList;
import java.util.List;

public class SimpleDataDAO implements DataStructureDAO {

    private List<DataStructure> dataStructures;

    public SimpleDataDAO() {
        dataStructures = new ArrayList<>();
    }

    @Override
    public boolean add(DataStructure dataStructure) {
        return dataStructures.add(dataStructure);
    }

    @Override
    public List<DataStructure> findAll() {
        return new ArrayList<>(dataStructures);
    }
}
