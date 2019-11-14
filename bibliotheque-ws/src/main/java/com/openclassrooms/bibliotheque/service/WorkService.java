package com.openclassrooms.bibliotheque.service;

import com.openclassrooms.bibliotheque.models.Work;

import java.util.List;

public interface WorkService {

    public List<Work> getWorksByAuthor(String author);

    public List<Work> getWorksByPublicationDate (Integer publicationDate);

    public Work saveNewWork(Work work);

    public Work deleteWork(Integer workId);


}