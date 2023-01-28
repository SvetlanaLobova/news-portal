package org.newportal.database.repository.impl;

import org.newportal.database.entity.News;
import org.newportal.database.repository.NewsPortalRepository;

import java.util.List;

public class NewsPortalRepositoryImpl implements NewsPortalRepository {
    @Override
    public List<News> findAll() {
        return null;
    }

    @Override
    public News findById(String id) {
        return null;
    }

    @Override
    public News findByLogin(String login) {
        return null;
    }

    @Override
    public News createNews(News news) {
        return news;
    }

    @Override
    public News updateNewsById(String id, News news) {
        return null;
    }

    @Override
    public News deleteNewsById(String id) {
        return null;
    }
}
