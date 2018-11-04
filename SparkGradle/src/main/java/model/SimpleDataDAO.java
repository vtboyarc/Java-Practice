package model;

import java.util.ArrayList;
import java.util.List;

public class SimpleDataDAO implements DataStructureDAO {

    private List<DataStructure> ideas;

    public SimpleDataDAO() {
        ideas = new ArrayList<>();
    }

    @Override
    public boolean add(DataStructure idea) {
        return ideas.add(idea);
    }

    @Override
    public List<DataStructure> findAll() {
        return new ArrayList<>(ideas);
    }

    @Override
    public DataStructure findBySlug(String slug) {
        return ideas.stream()
                .filter(idea -> idea.getSlug().equals(slug))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }
}
