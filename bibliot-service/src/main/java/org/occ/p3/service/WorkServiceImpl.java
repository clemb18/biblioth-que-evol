package org.occ.p3.service;

import org.occ.p3.consumer.repository.WorkRepository;
import org.occ.p3.model.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class WorkServiceImpl implements WorkService {
@Autowired
WorkRepository workRepository;

    @Override
    public List<Work> getWorksByAuthor(String author) {

        /// Appeler le consumer

        List<Work> worksGotFromConsumer = workRepository.findByAuthorContains(author);

        return worksGotFromConsumer;
    }

    @Override
    public List<Work> getWorksByPublicationDate(Integer publicationDate) {

        /// Appeler le consumer

        List<Work> worksGotFromConsumer = workRepository.findByPublicationDate(publicationDate);

        return worksGotFromConsumer;

    }

    @Override
    public List<Work> getWorksByTitle(String title) {

        List<Work> worksGotFromConsumer = workRepository.findByTitleContainsIgnoreCase(title);

        return worksGotFromConsumer;
    }
}
