package ru.neoflex.vtb.saveloadstatic.repo;


import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import ru.neoflex.vtb.saveloadstatic.model.DocModel;

public interface DocRepository extends ReactiveCrudRepository<DocModel, Long> {


}
