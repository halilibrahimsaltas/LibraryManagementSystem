package dev.patika.library.business.concretes;

import dev.patika.library.business.abstracts.PublisherService;
import dev.patika.library.dao.PublisherRepo;
import dev.patika.library.entities.Publisher;
import org.springframework.stereotype.Service;

@Service
public class PublisherManager implements PublisherService {
    private  final PublisherRepo publisherRepo;

    public PublisherManager(PublisherRepo publisherRepo) {
        this.publisherRepo = publisherRepo;
    }
    @Override
    public Publisher save (Publisher publisher){
        return this.publisherRepo.save(publisher);
    }
}
