package org.newportal.database.repository;

import org.newportal.database.entity.News;

import java.util.List;

public interface NewsPortalRepository {
    public List<News> findAll();
    public News findById(String id);
    public News findByLogin(String login);
    public News createNews(News news);
    public News updateNewsById(String id, News news);
    public News deleteNewsById(String id);
}
